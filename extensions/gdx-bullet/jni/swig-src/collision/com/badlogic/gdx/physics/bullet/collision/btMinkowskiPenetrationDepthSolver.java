/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btMinkowskiPenetrationDepthSolver extends btConvexPenetrationDepthSolver {
	private long swigCPtr;
	
	protected btMinkowskiPenetrationDepthSolver(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btMinkowskiPenetrationDepthSolver_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btMinkowskiPenetrationDepthSolver, normally you should not need this constructor it's intended for low-level usage. */
	public btMinkowskiPenetrationDepthSolver(long cPtr, boolean cMemoryOwn) {
		this("btMinkowskiPenetrationDepthSolver", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btMinkowskiPenetrationDepthSolver_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btMinkowskiPenetrationDepthSolver obj) {
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
				CollisionJNI.delete_btMinkowskiPenetrationDepthSolver(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btMinkowskiPenetrationDepthSolver() {
    this(CollisionJNI.new_btMinkowskiPenetrationDepthSolver(), true);
  }

}
