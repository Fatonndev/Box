/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.obvilion.box.physics.bullet.dynamics;

import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.physics.bullet.linearmath.*;
import ru.obvilion.box.physics.bullet.collision.*;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Matrix4;

public class btHingeAccumulatedAngleConstraint extends btHingeConstraint {
	private long swigCPtr;
	
	protected btHingeAccumulatedAngleConstraint(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btHingeAccumulatedAngleConstraint_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btHingeAccumulatedAngleConstraint, normally you should not need this constructor it's intended for low-level usage. */
	public btHingeAccumulatedAngleConstraint(long cPtr, boolean cMemoryOwn) {
		this("btHingeAccumulatedAngleConstraint", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btHingeAccumulatedAngleConstraint_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btHingeAccumulatedAngleConstraint obj) {
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
				DynamicsJNI.delete_btHingeAccumulatedAngleConstraint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return DynamicsJNI.btHingeAccumulatedAngleConstraint_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    DynamicsJNI.btHingeAccumulatedAngleConstraint_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return DynamicsJNI.btHingeAccumulatedAngleConstraint_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    DynamicsJNI.btHingeAccumulatedAngleConstraint_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return DynamicsJNI.btHingeAccumulatedAngleConstraint_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    DynamicsJNI.btHingeAccumulatedAngleConstraint_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return DynamicsJNI.btHingeAccumulatedAngleConstraint_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    DynamicsJNI.btHingeAccumulatedAngleConstraint_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public btHingeAccumulatedAngleConstraint(btRigidBody rbA, btRigidBody rbB, Vector3 pivotInA, Vector3 pivotInB, Vector3 axisInA, Vector3 axisInB, boolean useReferenceFrameA) {
    this(DynamicsJNI.new_btHingeAccumulatedAngleConstraint__SWIG_0(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, pivotInA, pivotInB, axisInA, axisInB, useReferenceFrameA), true);
  }

  public btHingeAccumulatedAngleConstraint(btRigidBody rbA, btRigidBody rbB, Vector3 pivotInA, Vector3 pivotInB, Vector3 axisInA, Vector3 axisInB) {
    this(DynamicsJNI.new_btHingeAccumulatedAngleConstraint__SWIG_1(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, pivotInA, pivotInB, axisInA, axisInB), true);
  }

  public btHingeAccumulatedAngleConstraint(btRigidBody rbA, Vector3 pivotInA, Vector3 axisInA, boolean useReferenceFrameA) {
    this(DynamicsJNI.new_btHingeAccumulatedAngleConstraint__SWIG_2(btRigidBody.getCPtr(rbA), rbA, pivotInA, axisInA, useReferenceFrameA), true);
  }

  public btHingeAccumulatedAngleConstraint(btRigidBody rbA, Vector3 pivotInA, Vector3 axisInA) {
    this(DynamicsJNI.new_btHingeAccumulatedAngleConstraint__SWIG_3(btRigidBody.getCPtr(rbA), rbA, pivotInA, axisInA), true);
  }

  public btHingeAccumulatedAngleConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame, boolean useReferenceFrameA) {
    this(DynamicsJNI.new_btHingeAccumulatedAngleConstraint__SWIG_4(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, rbAFrame, rbBFrame, useReferenceFrameA), true);
  }

  public btHingeAccumulatedAngleConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame) {
    this(DynamicsJNI.new_btHingeAccumulatedAngleConstraint__SWIG_5(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, rbAFrame, rbBFrame), true);
  }

  public btHingeAccumulatedAngleConstraint(btRigidBody rbA, Matrix4 rbAFrame, boolean useReferenceFrameA) {
    this(DynamicsJNI.new_btHingeAccumulatedAngleConstraint__SWIG_6(btRigidBody.getCPtr(rbA), rbA, rbAFrame, useReferenceFrameA), true);
  }

  public btHingeAccumulatedAngleConstraint(btRigidBody rbA, Matrix4 rbAFrame) {
    this(DynamicsJNI.new_btHingeAccumulatedAngleConstraint__SWIG_7(btRigidBody.getCPtr(rbA), rbA, rbAFrame), true);
  }

  public float getAccumulatedHingeAngle() {
    return DynamicsJNI.btHingeAccumulatedAngleConstraint_getAccumulatedHingeAngle(swigCPtr, this);
  }

  public void setAccumulatedHingeAngle(float accAngle) {
    DynamicsJNI.btHingeAccumulatedAngleConstraint_setAccumulatedHingeAngle(swigCPtr, this, accAngle);
  }

}
