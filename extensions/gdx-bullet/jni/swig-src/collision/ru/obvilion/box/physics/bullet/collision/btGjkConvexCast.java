/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.obvilion.box.physics.bullet.collision;

import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.physics.bullet.linearmath.*;

public class btGjkConvexCast extends btConvexCast {
	private long swigCPtr;
	
	protected btGjkConvexCast(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btGjkConvexCast_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGjkConvexCast, normally you should not need this constructor it's intended for low-level usage. */
	public btGjkConvexCast(long cPtr, boolean cMemoryOwn) {
		this("btGjkConvexCast", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btGjkConvexCast_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btGjkConvexCast obj) {
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
				CollisionJNI.delete_btGjkConvexCast(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btGjkConvexCast(btConvexShape convexA, btConvexShape convexB, btVoronoiSimplexSolver simplexSolver) {
    this(CollisionJNI.new_btGjkConvexCast(btConvexShape.getCPtr(convexA), convexA, btConvexShape.getCPtr(convexB), convexB, btVoronoiSimplexSolver.getCPtr(simplexSolver), simplexSolver), true);
  }

}
