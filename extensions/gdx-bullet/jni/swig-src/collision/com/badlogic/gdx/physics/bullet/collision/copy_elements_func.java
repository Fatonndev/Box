/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import ru.obvilion.box.physics.bullet.BulletBase;

public class copy_elements_func extends BulletBase {
	private long swigCPtr;
	
	protected copy_elements_func(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new copy_elements_func, normally you should not need this constructor it's intended for low-level usage. */ 
	public copy_elements_func(long cPtr, boolean cMemoryOwn) {
		this("copy_elements_func", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(copy_elements_func obj) {
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
				CollisionJNI.delete_copy_elements_func(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public copy_elements_func() {
    this(CollisionJNI.new_copy_elements_func(), true);
  }

}
