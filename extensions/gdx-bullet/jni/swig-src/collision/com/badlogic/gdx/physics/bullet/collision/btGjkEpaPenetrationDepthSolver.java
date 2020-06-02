/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

public class btGjkEpaPenetrationDepthSolver extends btConvexPenetrationDepthSolver {
	private long swigCPtr;
	
	protected btGjkEpaPenetrationDepthSolver(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btGjkEpaPenetrationDepthSolver_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGjkEpaPenetrationDepthSolver, normally you should not need this constructor it's intended for low-level usage. */
	public btGjkEpaPenetrationDepthSolver(long cPtr, boolean cMemoryOwn) {
		this("btGjkEpaPenetrationDepthSolver", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btGjkEpaPenetrationDepthSolver_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btGjkEpaPenetrationDepthSolver obj) {
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
				CollisionJNI.delete_btGjkEpaPenetrationDepthSolver(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btGjkEpaPenetrationDepthSolver() {
    this(CollisionJNI.new_btGjkEpaPenetrationDepthSolver(), true);
  }

}
