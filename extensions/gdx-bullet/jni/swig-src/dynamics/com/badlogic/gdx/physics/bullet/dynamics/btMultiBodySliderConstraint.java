/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btMultiBodySliderConstraint extends btMultiBodyConstraint {
	private long swigCPtr;
	
	protected btMultiBodySliderConstraint(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btMultiBodySliderConstraint_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btMultiBodySliderConstraint, normally you should not need this constructor it's intended for low-level usage. */
	public btMultiBodySliderConstraint(long cPtr, boolean cMemoryOwn) {
		this("btMultiBodySliderConstraint", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btMultiBodySliderConstraint_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btMultiBodySliderConstraint obj) {
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
				DynamicsJNI.delete_btMultiBodySliderConstraint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btMultiBodySliderConstraint(btMultiBody body, int link, btRigidBody bodyB, Vector3 pivotInA, Vector3 pivotInB, Matrix3 frameInA, Matrix3 frameInB, Vector3 jointAxis) {
    this(DynamicsJNI.new_btMultiBodySliderConstraint__SWIG_0(btMultiBody.getCPtr(body), body, link, btRigidBody.getCPtr(bodyB), bodyB, pivotInA, pivotInB, frameInA, frameInB, jointAxis), true);
  }

  public btMultiBodySliderConstraint(btMultiBody bodyA, int linkA, btMultiBody bodyB, int linkB, Vector3 pivotInA, Vector3 pivotInB, Matrix3 frameInA, Matrix3 frameInB, Vector3 jointAxis) {
    this(DynamicsJNI.new_btMultiBodySliderConstraint__SWIG_1(btMultiBody.getCPtr(bodyA), bodyA, linkA, btMultiBody.getCPtr(bodyB), bodyB, linkB, pivotInA, pivotInB, frameInA, frameInB, jointAxis), true);
  }

  public Vector3 getPivotInA() {
	return DynamicsJNI.btMultiBodySliderConstraint_getPivotInA(swigCPtr, this);
}

  public void setPivotInA(Vector3 pivotInA) {
    DynamicsJNI.btMultiBodySliderConstraint_setPivotInA(swigCPtr, this, pivotInA);
  }

  public Vector3 getPivotInB() {
	return DynamicsJNI.btMultiBodySliderConstraint_getPivotInB(swigCPtr, this);
}

  public Matrix3 getFrameInA() {
	return DynamicsJNI.btMultiBodySliderConstraint_getFrameInA(swigCPtr, this);
}

  public void setFrameInA(Matrix3 frameInA) {
    DynamicsJNI.btMultiBodySliderConstraint_setFrameInA(swigCPtr, this, frameInA);
  }

  public Matrix3 getFrameInB() {
	return DynamicsJNI.btMultiBodySliderConstraint_getFrameInB(swigCPtr, this);
}

  public Vector3 getJointAxis() {
	return DynamicsJNI.btMultiBodySliderConstraint_getJointAxis(swigCPtr, this);
}

  public void setJointAxis(Vector3 jointAxis) {
    DynamicsJNI.btMultiBodySliderConstraint_setJointAxis(swigCPtr, this, jointAxis);
  }

}
