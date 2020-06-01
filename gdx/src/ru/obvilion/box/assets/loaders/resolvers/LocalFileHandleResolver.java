
package ru.obvilion.box.assets.loaders.resolvers;

import ru.obvilion.box.Gdx;
import ru.obvilion.box.assets.loaders.FileHandleResolver;
import ru.obvilion.box.files.FileHandle;

public class LocalFileHandleResolver implements FileHandleResolver {
	@Override
	public FileHandle resolve (String fileName) {
		return Gdx.files.local(fileName);
	}
}
