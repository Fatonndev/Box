/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import ru.obvilion.box.physics.bullet.BulletBase;

public class btHashInt extends BulletBase {
	private long swigCPtr;
	
	protected btHashInt(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btHashInt, normally you should not need this constructor it's intended for low-level usage. */ 
	public btHashInt(long cPtr, boolean cMemoryOwn) {
		this("btHashInt", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btHashInt obj) {
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
				LinearMathJNI.delete_btHashInt(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btHashInt() {
    this(LinearMathJNI.new_btHashInt__SWIG_0(), true);
  }

  public btHashInt(int uid) {
    this(LinearMathJNI.new_btHashInt__SWIG_1(uid), true);
  }

  public int getUid1() {
    return LinearMathJNI.btHashInt_getUid1(swigCPtr, this);
  }

  public void setUid1(int uid) {
    LinearMathJNI.btHashInt_setUid1(swigCPtr, this, uid);
  }

  public boolean equals(btHashInt other) {
    return LinearMathJNI.btHashInt_equals(swigCPtr, this, btHashInt.getCPtr(other), other);
  }

  public long getHash() {
    return LinearMathJNI.btHashInt_getHash(swigCPtr, this);
  }

}
