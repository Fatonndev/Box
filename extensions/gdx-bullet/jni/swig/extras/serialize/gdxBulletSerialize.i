
%feature("director") btBulletWorldImporter;
%feature("nodirector") btBulletWorldImporter::createMultiSphereShape;

%{
#include <BulletWorldImporter/btWorldImporter.h>
#include <BulletWorldImporter/btBulletWorldImporter.h>
%}

%template(btStringArray) btAlignedObjectArray<char*>;

%ignore btWorldImporter::getNameForPointer(const void* ptr);
%extend btWorldImporter {
	const char*	getNameForPointer(unsigned long cPtr) {
		return $self->getNameForPointer((void*)cPtr);
	}
};

%ignore btBulletWorldImporter::loadFileFromMemory(char *memoryBuffer, int len);
%extend btBulletWorldImporter {
	bool loadFileFromMemory(unsigned char *memoryBuffer, int len) {
		return $self->loadFileFromMemory((char *)memoryBuffer, len);
	}
};

%typemap(javacode) btBulletWorldImporter %{
	public boolean loadFile(final ru.obvilion.box.files.FileHandle fileHandle) {
		final int len = (int)fileHandle.length();
		if (len <= 0)
			throw new ru.obvilion.box.utils.GdxRuntimeException("Incorrect file specified");
		java.nio.ByteBuffer buff = ru.obvilion.box.utils.BufferUtils.newUnsafeByteBuffer(len);
		buff.put(fileHandle.readBytes());
		buff.position(0);
		boolean result = loadFileFromMemory(buff, len);
		ru.obvilion.box.utils.BufferUtils.disposeUnsafeByteBuffer(buff);
		return result;
	}
%}

%include "BulletWorldImporter/btWorldImporter.h"
%include "BulletWorldImporter/btBulletWorldImporter.h"
