
package ru.obvilion.box.assets.loaders.resolvers;

import ru.obvilion.box.Box;
import ru.obvilion.box.assets.loaders.FileHandleResolver;
import ru.obvilion.box.files.FileHandle;

public class LocalFileHandleResolver implements FileHandleResolver {
	@Override
	public FileHandle resolve (String fileName) {
		return Box.files.local(fileName);
	}
}
