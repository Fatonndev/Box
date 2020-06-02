/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import ru.obvilion.box.physics.bullet.BulletBase;

public class btSerializer extends BulletBase {
	private long swigCPtr;
	
	protected btSerializer(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSerializer, normally you should not need this constructor it's intended for low-level usage. */ 
	public btSerializer(long cPtr, boolean cMemoryOwn) {
		this("btSerializer", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btSerializer obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				LinearMathJNI.delete_btSerializer(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public java.nio.ByteBuffer getBufferPointer() {
    return LinearMathJNI.btSerializer_getBufferPointer(swigCPtr, this);
}

  public int getCurrentBufferSize() {
    return LinearMathJNI.btSerializer_getCurrentBufferSize(swigCPtr, this);
  }

  public btChunk allocate(long size, int numElements) {
    long cPtr = LinearMathJNI.btSerializer_allocate(swigCPtr, this, size, numElements);
    return (cPtr == 0) ? null : new btChunk(cPtr, false);
  }

  public void finalizeChunk(btChunk chunk, String structType, int chunkCode, long oldPtr) {
    LinearMathJNI.btSerializer_finalizeChunk(swigCPtr, this, btChunk.getCPtr(chunk), chunk, structType, chunkCode, oldPtr);
  }

  public long findPointer(long oldPtr) {
    return LinearMathJNI.btSerializer_findPointer(swigCPtr, this, oldPtr);
  }

  public long getUniquePointer(long oldPtr) {
    return LinearMathJNI.btSerializer_getUniquePointer(swigCPtr, this, oldPtr);
  }

  public void startSerialization() {
    LinearMathJNI.btSerializer_startSerialization(swigCPtr, this);
  }

  public void finishSerialization() {
    LinearMathJNI.btSerializer_finishSerialization(swigCPtr, this);
  }

  public String findNameForPointer(long ptr) {
    return LinearMathJNI.btSerializer_findNameForPointer(swigCPtr, this, ptr);
  }

  public void registerNameForPointer(long ptr, String name) {
    LinearMathJNI.btSerializer_registerNameForPointer(swigCPtr, this, ptr, name);
  }

  public void serializeName(String ptr) {
    LinearMathJNI.btSerializer_serializeName(swigCPtr, this, ptr);
  }

  public int getSerializationFlags() {
    return LinearMathJNI.btSerializer_getSerializationFlags(swigCPtr, this);
  }

  public void setSerializationFlags(int flags) {
    LinearMathJNI.btSerializer_setSerializationFlags(swigCPtr, this, flags);
  }

  public int getNumChunks() {
    return LinearMathJNI.btSerializer_getNumChunks(swigCPtr, this);
  }

  public btChunk getChunk(int chunkIndex) {
    long cPtr = LinearMathJNI.btSerializer_getChunk(swigCPtr, this, chunkIndex);
    return (cPtr == 0) ? null : new btChunk(cPtr, false);
  }

}
