/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class DISTANCE_PLANE_3D_FUNC extends BulletBase {
	private long swigCPtr;
	
	protected DISTANCE_PLANE_3D_FUNC(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new DISTANCE_PLANE_3D_FUNC, normally you should not need this constructor it's intended for low-level usage. */ 
	public DISTANCE_PLANE_3D_FUNC(long cPtr, boolean cMemoryOwn) {
		this("DISTANCE_PLANE_3D_FUNC", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(DISTANCE_PLANE_3D_FUNC obj) {
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
				CollisionJNI.delete_DISTANCE_PLANE_3D_FUNC(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public DISTANCE_PLANE_3D_FUNC() {
    this(CollisionJNI.new_DISTANCE_PLANE_3D_FUNC(), true);
  }

}
