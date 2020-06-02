package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import ru.obvilion.box.files.FileHandle;
import ru.obvilion.box.graphics.Cubemap;
import ru.obvilion.box.graphics.CubemapData;
import ru.obvilion.box.graphics.Pixmap;
import ru.obvilion.box.graphics.Pixmap.Format;
import ru.obvilion.box.graphics.Texture.TextureFilter;
import ru.obvilion.box.graphics.Texture.TextureWrap;
import ru.obvilion.box.graphics.TextureData;
import com.badlogic.gdx.utils.Array;

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
			Pixmap pixmap = null;
			Format format = null;
			boolean genMipMaps = false;
			info.cubemap = null;

			if (parameter != null) {
				format = parameter.format;
				info.cubemap = parameter.cubemap;
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
