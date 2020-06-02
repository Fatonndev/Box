/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package ru.obvilion.box.graphics.glutils;

import ru.obvilion.box.Box;
import ru.obvilion.box.constructors.Application.ApplicationType;
import ru.obvilion.box.graphics.GL20;
import ru.obvilion.box.graphics.Pixmap;
import ru.obvilion.box.graphics.Pixmap.Blending;
import ru.obvilion.box.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;

public class MipMapGenerator {

	private MipMapGenerator () {
		// disallow, static methods only
	}

	private static boolean useHWMipMap = true;

	static public void setUseHardwareMipMap (boolean useHWMipMap) {
		MipMapGenerator.useHWMipMap = useHWMipMap;
	}

	/** Sets the image data of the {@link Texture} based on the {@link Pixmap}. The texture must be bound for this to work. If
	 * <code>disposePixmap</code> is true, the pixmap will be disposed at the end of the method.
	 * @param pixmap the Pixmap */
	public static void generateMipMap (Pixmap pixmap, int textureWidth, int textureHeight) {
		generateMipMap(GL20.GL_TEXTURE_2D, pixmap, textureWidth, textureHeight);
	}

	/** Sets the image data of the {@link Texture} based on the {@link Pixmap}. The texture must be bound for this to work. If
	 * <code>disposePixmap</code> is true, the pixmap will be disposed at the end of the method. */
	public static void generateMipMap (int target, Pixmap pixmap, int textureWidth, int textureHeight) {
		if (!useHWMipMap) {
			generateMipMapCPU(target, pixmap, textureWidth, textureHeight);
			return;
		}

		if (Box.app.getType() == ApplicationType.Android || Box.app.getType() == ApplicationType.WebGL
			|| Box.app.getType() == ApplicationType.iOS) {
			generateMipMapGLES20(target, pixmap);
		} else {
			generateMipMapDesktop(target, pixmap, textureWidth, textureHeight);
		}
	}

	private static void generateMipMapGLES20 (int target, Pixmap pixmap) {
		Box.gl.glTexImage2D(target, 0, pixmap.getGLInternalFormat(), pixmap.getWidth(), pixmap.getHeight(), 0,
			pixmap.getGLFormat(), pixmap.getGLType(), pixmap.getPixels());
		Box.gl20.glGenerateMipmap(target);
	}

	private static void generateMipMapDesktop (int target, Pixmap pixmap, int textureWidth, int textureHeight) {
		if (Box.graphics.supportsExtension("GL_ARB_framebuffer_object")
			|| Box.graphics.supportsExtension("GL_EXT_framebuffer_object") || Box.gl30 != null) {
			Box.gl.glTexImage2D(target, 0, pixmap.getGLInternalFormat(), pixmap.getWidth(), pixmap.getHeight(), 0,
				pixmap.getGLFormat(), pixmap.getGLType(), pixmap.getPixels());
			Box.gl20.glGenerateMipmap(target);
		} else {
			generateMipMapCPU(target, pixmap, textureWidth, textureHeight);
		}
	}

	private static void generateMipMapCPU (int target, Pixmap pixmap, int textureWidth, int textureHeight) {
		Box.gl.glTexImage2D(target, 0, pixmap.getGLInternalFormat(), pixmap.getWidth(), pixmap.getHeight(), 0,
			pixmap.getGLFormat(), pixmap.getGLType(), pixmap.getPixels());
		if ((Box.gl20 == null) && textureWidth != textureHeight)
			throw new GdxRuntimeException("texture width and height must be square when using mipmapping.");
		int width = pixmap.getWidth() / 2;
		int height = pixmap.getHeight() / 2;
		int level = 1;
		while (width > 0 && height > 0) {
			Pixmap tmp = new Pixmap(width, height, pixmap.getFormat());
			tmp.setBlending(Blending.None);
			tmp.drawPixmap(pixmap, 0, 0, pixmap.getWidth(), pixmap.getHeight(), 0, 0, width, height);
			if (level > 1) pixmap.dispose();
			pixmap = tmp;

			Box.gl.glTexImage2D(target, level, pixmap.getGLInternalFormat(), pixmap.getWidth(), pixmap.getHeight(), 0,
				pixmap.getGLFormat(), pixmap.getGLType(), pixmap.getPixels());

			width = pixmap.getWidth() / 2;
			height = pixmap.getHeight() / 2;
			level++;
		}
	}
}
