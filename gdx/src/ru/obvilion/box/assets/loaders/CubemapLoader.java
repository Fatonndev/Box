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

package ru.obvilion.box.assets.loaders;

import ru.obvilion.box.assets.AssetDescriptor;
import ru.obvilion.box.assets.AssetLoaderParameters;
import ru.obvilion.box.assets.AssetManager;
import ru.obvilion.box.files.FileHandle;
import ru.obvilion.box.graphics.Cubemap;
import ru.obvilion.box.graphics.CubemapData;
import ru.obvilion.box.graphics.Pixmap.Format;
import ru.obvilion.box.graphics.Texture;
import ru.obvilion.box.graphics.Texture.TextureFilter;
import ru.obvilion.box.graphics.Texture.TextureWrap;
import ru.obvilion.box.graphics.TextureData;
import ru.obvilion.box.graphics.glutils.KTXTextureData;
import ru.obvilion.box.utils.Array;

/** {@link AssetLoader} for {@link Cubemap} instances. The pixel data is loaded asynchronously. The texture is then created on the
 * rendering thread, synchronously. Passing a {@link CubemapParameter} to
 * {@link AssetManager#load(String, Class, AssetLoaderParameters)} allows one to specify parameters as can be passed to the
 * various Cubemap constructors, e.g. filtering and so on.
 * @author mzechner, Vincent Bousquet */
public class CubemapLoader extends AsynchronousAssetLoader<Cubemap, CubemapLoader.CubemapParameter> {
	static public class CubemapLoaderInfo {
		String filename;
		CubemapData data;
		Cubemap cubemap;
	};

	CubemapLoaderInfo info = new CubemapLoaderInfo();

	public CubemapLoader (FileHandleResolver resolver) {
		super(resolver);
	}

	@Override
	public void loadAsync (AssetManager manager, String fileName, FileHandle file, CubemapParameter parameter) {
		info.filename = fileName;
		if (parameter == null || parameter.cubemapData == null) {
			Format format = null;
			boolean genMipMaps = false;
			info.cubemap = null;

			if (parameter != null) {
				format = parameter.format;
				info.cubemap = parameter.cubemap;
			}

			if (fileName.contains(".ktx") || fileName.contains(".zktx")) {
				info.data = new KTXTextureData(file, genMipMaps);
			}
		} else {
			info.data = parameter.cubemapData;
			info.cubemap = parameter.cubemap;
		}
		if (!info.data.isPrepared()) info.data.prepare();
	}

	@Override
	public Cubemap loadSync (AssetManager manager, String fileName, FileHandle file, CubemapParameter parameter) {
		if (info == null) return null;
		Cubemap cubemap = info.cubemap;
		if (cubemap != null) {
			cubemap.load(info.data);
		} else {
			cubemap = new Cubemap(info.data);
		}
		if (parameter != null) {
			cubemap.setFilter(parameter.minFilter, parameter.magFilter);
			cubemap.setWrap(parameter.wrapU, parameter.wrapV);
		}
		return cubemap;
	}

	@Override
	public Array<AssetDescriptor> getDependencies (String fileName, FileHandle file, CubemapParameter parameter) {
		return null;
	}

	static public class CubemapParameter extends AssetLoaderParameters<Cubemap> {
		/** the format of the final Texture. Uses the source images format if null **/
		public Format format = null;
		/** The texture to put the {@link TextureData} in, optional. **/
		public Cubemap cubemap = null;
		/** CubemapData for textures created on the fly, optional. When set, all format and genMipMaps are ignored */
		public CubemapData cubemapData = null;
		public TextureFilter minFilter = TextureFilter.Nearest;
		public TextureFilter magFilter = TextureFilter.Nearest;
		public TextureWrap wrapU = TextureWrap.ClampToEdge;
		public TextureWrap wrapV = TextureWrap.ClampToEdge;
	}
}
