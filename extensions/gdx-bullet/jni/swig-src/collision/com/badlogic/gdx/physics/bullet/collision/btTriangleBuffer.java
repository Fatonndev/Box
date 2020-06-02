/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

public class btTriangleBuffer extends btTriangleCallback {
	private long swigCPtr;
	
	protected btTriangleBuffer(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btTriangleBuffer_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTriangleBuffer, normally you should not need this constructor it's intended for low-level usage. */
	public btTriangleBuffer(long cPtr, boolean cMemoryOwn) {
		this("btTriangleBuffer", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btTriangleBuffer_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btTriangleBuffer obj) {
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
				CollisionJNI.delete_btTriangleBuffer(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public int getNumTriangles() {
    return CollisionJNI.btTriangleBuffer_getNumTriangles(swigCPtr, this);
  }

  public btTriangle getTriangle(int index) {
    return new btTriangle(CollisionJNI.btTriangleBuffer_getTriangle(swigCPtr, this, index), false);
  }

  public void clearBuffer() {
    CollisionJNI.btTriangleBuffer_clearBuffer(swigCPtr, this);
  }

  public btTriangleBuffer() {
    this(CollisionJNI.new_btTriangleBuffer(), true);
  }

}
