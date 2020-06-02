/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import ru.obvilion.box.physics.bullet.BulletBase;

public class btIntSortPredicate extends BulletBase {
	private long swigCPtr;
	
	protected btIntSortPredicate(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btIntSortPredicate, normally you should not need this constructor it's intended for low-level usage. */ 
	public btIntSortPredicate(long cPtr, boolean cMemoryOwn) {
		this("btIntSortPredicate", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btIntSortPredicate obj) {
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
				LinearMathJNI.delete_btIntSortPredicate(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public boolean operatorFunctionCall(int a, int b) {
    return LinearMathJNI.btIntSortPredicate_operatorFunctionCall(swigCPtr, this, a, b);
  }

  public btIntSortPredicate() {
    this(LinearMathJNI.new_btIntSortPredicate(), true);
  }

}
