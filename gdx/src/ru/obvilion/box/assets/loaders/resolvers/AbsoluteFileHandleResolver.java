
package com.badlogic.gdx.assets.loaders.resolvers;

import ru.obvilion.box.Box;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import ru.obvilion.box.files.FileHandle;

public class AbsoluteFileHandleResolver implements FileHandleResolver {
	@Override
	public FileHandle resolve (String fileName) {
		return Box.files.absolute(fileName);
	}
}
