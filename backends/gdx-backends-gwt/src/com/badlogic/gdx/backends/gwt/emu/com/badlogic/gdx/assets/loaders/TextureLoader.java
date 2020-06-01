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

package com.badlogic.gdx.assets.loaders;

import ru.obvilion.box.assets.AssetDescriptor;
import ru.obvilion.box.assets.AssetLoaderParameters;
import ru.obvilion.box.assets.AssetManager;
import ru.obvilion.box.files.FileHandle;
import ru.obvilion.box.graphics.Pixmap;
import ru.obvilion.box.graphics.Pixmap.Format;
import ru.obvilion.box.graphics.Texture;
import ru.obvilion.box.graphics.Texture.TextureFilter;
import ru.obvilion.box.graphics.Texture.TextureWrap;
import ru.obvilion.box.graphics.TextureData;
import ru.obvilion.box.graphics.glutils.FileTextureData;
import ru.obvilion.box.utils.Array;

public class TextureLoader extends AsynchronousAssetLoader<Texture, TextureLoader.TextureParameter> {
	TextureData data;
	Texture texture;

	public TextureLoader (FileHandleResolver resolver) {
		super(resolver);
	}

	@Override
	public void loadAsync (AssetManager manager, String fileName, FileHandle fileHandle, TextureParameter parameter) {
		if (parameter == null || (parameter != null && parameter.textureData == null)) {
			Pixmap pixmap = null;
			Format format = null;
			boolean genMipMaps = false;
			texture = null;

			if (parameter != null) {
				format = parameter.format;
				genMipMaps = parameter.genMipMaps;
				texture = parameter.texture;
			}

			FileHandle handle = resolve(fileName);
			pixmap = new Pixmap(handle);
			data = new FileTextureData(handle, pixmap, format, genMipMaps);
		} else {
			data = parameter.textureData;
			if (!data.isPrepared()) data.prepare();
			texture = parameter.texture;
		}
	}

	@Override
	public Texture loadSync (AssetManager manager, String fileName, FileHandle fileHandle, TextureParameter parameter) {
		Texture texture = this.texture;
		if (texture != null) {
			texture.load(data);
		} else {
			texture = new Texture(data);
		}
		if (parameter != null) {
			texture.setFilter(parameter.minFilter, parameter.magFilter);
			texture.setWrap(parameter.wrapU, parameter.wrapV);
		}
		return texture;
	}

	@Override
	public Array<AssetDescriptor> getDependencies (String fileName, FileHandle fileHandle, TextureParameter parameter) {
		return null;
	}

	static public class TextureParameter extends AssetLoaderParameters<Texture> {
		/** the format of the final Texture. Uses the source images format if null **/
		public Format format = null;
		/** whether to generate mipmaps **/
		public boolean genMipMaps = false;
		/** The texture to put the {@link TextureData} in, optional. **/
		public Texture texture = null;
		/** TextureData for textures created on the fly, optional. When set, all format and genMipMaps are ignored */
		public TextureData textureData = null;
		public TextureFilter minFilter = TextureFilter.Nearest;
		public TextureFilter magFilter = TextureFilter.Nearest;
		public TextureWrap wrapU = TextureWrap.ClampToEdge;
		public TextureWrap wrapV = TextureWrap.ClampToEdge;
	}
}
