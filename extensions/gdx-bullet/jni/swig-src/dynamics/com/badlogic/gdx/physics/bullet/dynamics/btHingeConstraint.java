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

public class btHingeConstraint extends btTypedConstraint {
	private long swigCPtr;
	
	protected btHingeConstraint(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btHingeConstraint_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btHingeConstraint, normally you should not need this constructor it's intended for low-level usage. */
	public btHingeConstraint(long cPtr, boolean cMemoryOwn) {
		this("btHingeConstraint", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btHingeConstraint_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btHingeConstraint obj) {
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
				DynamicsJNI.delete_btHingeConstraint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return DynamicsJNI.btHingeConstraint_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    DynamicsJNI.btHingeConstraint_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return DynamicsJNI.btHingeConstraint_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    DynamicsJNI.btHingeConstraint_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return DynamicsJNI.btHingeConstraint_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    DynamicsJNI.btHingeConstraint_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return DynamicsJNI.btHingeConstraint_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    DynamicsJNI.btHingeConstraint_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public btHingeConstraint(btRigidBody rbA, btRigidBody rbB, Vector3 pivotInA, Vector3 pivotInB, Vector3 axisInA, Vector3 axisInB, boolean useReferenceFrameA) {
    this(DynamicsJNI.new_btHingeConstraint__SWIG_0(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, pivotInA, pivotInB, axisInA, axisInB, useReferenceFrameA), true);
  }

  public btHingeConstraint(btRigidBody rbA, btRigidBody rbB, Vector3 pivotInA, Vector3 pivotInB, Vector3 axisInA, Vector3 axisInB) {
    this(DynamicsJNI.new_btHingeConstraint__SWIG_1(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, pivotInA, pivotInB, axisInA, axisInB), true);
  }

  public btHingeConstraint(btRigidBody rbA, Vector3 pivotInA, Vector3 axisInA, boolean useReferenceFrameA) {
    this(DynamicsJNI.new_btHingeConstraint__SWIG_2(btRigidBody.getCPtr(rbA), rbA, pivotInA, axisInA, useReferenceFrameA), true);
  }

  public btHingeConstraint(btRigidBody rbA, Vector3 pivotInA, Vector3 axisInA) {
    this(DynamicsJNI.new_btHingeConstraint__SWIG_3(btRigidBody.getCPtr(rbA), rbA, pivotInA, axisInA), true);
  }

  public btHingeConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame, boolean useReferenceFrameA) {
    this(DynamicsJNI.new_btHingeConstraint__SWIG_4(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, rbAFrame, rbBFrame, useReferenceFrameA), true);
  }

  public btHingeConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame) {
    this(DynamicsJNI.new_btHingeConstraint__SWIG_5(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, rbAFrame, rbBFrame), true);
  }

  public btHingeConstraint(btRigidBody rbA, Matrix4 rbAFrame, boolean useReferenceFrameA) {
    this(DynamicsJNI.new_btHingeConstraint__SWIG_6(btRigidBody.getCPtr(rbA), rbA, rbAFrame, useReferenceFrameA), true);
  }

  public btHingeConstraint(btRigidBody rbA, Matrix4 rbAFrame) {
    this(DynamicsJNI.new_btHingeConstraint__SWIG_7(btRigidBody.getCPtr(rbA), rbA, rbAFrame), true);
  }

  public void getInfo1NonVirtual(btTypedConstraint.btConstraintInfo1 info) {
    DynamicsJNI.btHingeConstraint_getInfo1NonVirtual(swigCPtr, this, btTypedConstraint.btConstraintInfo1.getCPtr(info), info);
  }

  public void getInfo2NonVirtual(btTypedConstraint.btConstraintInfo2 info, Matrix4 transA, Matrix4 transB, Vector3 angVelA, Vector3 angVelB) {
    DynamicsJNI.btHingeConstraint_getInfo2NonVirtual(swigCPtr, this, btTypedConstraint.btConstraintInfo2.getCPtr(info), info, transA, transB, angVelA, angVelB);
  }

  public void getInfo2Internal(btTypedConstraint.btConstraintInfo2 info, Matrix4 transA, Matrix4 transB, Vector3 angVelA, Vector3 angVelB) {
    DynamicsJNI.btHingeConstraint_getInfo2Internal(swigCPtr, this, btTypedConstraint.btConstraintInfo2.getCPtr(info), info, transA, transB, angVelA, angVelB);
  }

  public void getInfo2InternalUsingFrameOffset(btTypedConstraint.btConstraintInfo2 info, Matrix4 transA, Matrix4 transB, Vector3 angVelA, Vector3 angVelB) {
    DynamicsJNI.btHingeConstraint_getInfo2InternalUsingFrameOffset(swigCPtr, this, btTypedConstraint.btConstraintInfo2.getCPtr(info), info, transA, transB, angVelA, angVelB);
  }

  public void updateRHS(float timeStep) {
    DynamicsJNI.btHingeConstraint_updateRHS(swigCPtr, this, timeStep);
  }

  public btRigidBody getRigidBodyAConst() {
	return btRigidBody.getInstance(DynamicsJNI.btHingeConstraint_getRigidBodyAConst(swigCPtr, this), false);
}

  public btRigidBody getRigidBodyBConst() {
	return btRigidBody.getInstance(DynamicsJNI.btHingeConstraint_getRigidBodyBConst(swigCPtr, this), false);
}

  public btRigidBody getRigidBodyA() {
	return btRigidBody.getInstance(DynamicsJNI.btHingeConstraint_getRigidBodyA(swigCPtr, this), false);
}

  public btRigidBody getRigidBodyB() {
	return btRigidBody.getInstance(DynamicsJNI.btHingeConstraint_getRigidBodyB(swigCPtr, this), false);
}

  public Matrix4 getFrameOffsetA() {
	return DynamicsJNI.btHingeConstraint_getFrameOffsetA(swigCPtr, this);
}

  public Matrix4 getFrameOffsetB() {
	return DynamicsJNI.btHingeConstraint_getFrameOffsetB(swigCPtr, this);
}

  public void setFrames(Matrix4 frameA, Matrix4 frameB) {
    DynamicsJNI.btHingeConstraint_setFrames(swigCPtr, this, frameA, frameB);
  }

  public void setAngularOnly(boolean angularOnly) {
    DynamicsJNI.btHingeConstraint_setAngularOnly(swigCPtr, this, angularOnly);
  }

  public void enableAngularMotor(boolean enableMotor, float targetVelocity, float maxMotorImpulse) {
    DynamicsJNI.btHingeConstraint_enableAngularMotor(swigCPtr, this, enableMotor, targetVelocity, maxMotorImpulse);
  }

  public void enableMotor(boolean enableMotor) {
    DynamicsJNI.btHingeConstraint_enableMotor(swigCPtr, this, enableMotor);
  }

  public void setMaxMotorImpulse(float maxMotorImpulse) {
    DynamicsJNI.btHingeConstraint_setMaxMotorImpulse(swigCPtr, this, maxMotorImpulse);
  }

  public void setMotorTargetVelocity(float motorTargetVelocity) {
    DynamicsJNI.btHingeConstraint_setMotorTargetVelocity(swigCPtr, this, motorTargetVelocity);
  }

  public void setMotorTarget(Quaternion qAinB, float dt) {
    DynamicsJNI.btHingeConstraint_setMotorTarget__SWIG_0(swigCPtr, this, qAinB, dt);
  }

  public void setMotorTarget(float targetAngle, float dt) {
    DynamicsJNI.btHingeConstraint_setMotorTarget__SWIG_1(swigCPtr, this, targetAngle, dt);
  }

  public void setLimit(float low, float high, float _softness, float _biasFactor, float _relaxationFactor) {
    DynamicsJNI.btHingeConstraint_setLimit__SWIG_0(swigCPtr, this, low, high, _softness, _biasFactor, _relaxationFactor);
  }

  public void setLimit(float low, float high, float _softness, float _biasFactor) {
    DynamicsJNI.btHingeConstraint_setLimit__SWIG_1(swigCPtr, this, low, high, _softness, _biasFactor);
  }

  public void setLimit(float low, float high, float _softness) {
    DynamicsJNI.btHingeConstraint_setLimit__SWIG_2(swigCPtr, this, low, high, _softness);
  }

  public void setLimit(float low, float high) {
    DynamicsJNI.btHingeConstraint_setLimit__SWIG_3(swigCPtr, this, low, high);
  }

  public float getLimitSoftness() {
    return DynamicsJNI.btHingeConstraint_getLimitSoftness(swigCPtr, this);
  }

  public float getLimitBiasFactor() {
    return DynamicsJNI.btHingeConstraint_getLimitBiasFactor(swigCPtr, this);
  }

  public float getLimitRelaxationFactor() {
    return DynamicsJNI.btHingeConstraint_getLimitRelaxationFactor(swigCPtr, this);
  }

  public void setAxis(Vector3 axisInA) {
    DynamicsJNI.btHingeConstraint_setAxis(swigCPtr, this, axisInA);
  }

  public boolean hasLimit() {
    return DynamicsJNI.btHingeConstraint_hasLimit(swigCPtr, this);
  }

  public float getLowerLimit() {
    return DynamicsJNI.btHingeConstraint_getLowerLimit(swigCPtr, this);
  }

  public float getUpperLimit() {
    return DynamicsJNI.btHingeConstraint_getUpperLimit(swigCPtr, this);
  }

  public float getHingeAngle() {
    return DynamicsJNI.btHingeConstraint_getHingeAngle__SWIG_0(swigCPtr, this);
  }

  public float getHingeAngle(Matrix4 transA, Matrix4 transB) {
    return DynamicsJNI.btHingeConstraint_getHingeAngle__SWIG_1(swigCPtr, this, transA, transB);
  }

  public void testLimit(Matrix4 transA, Matrix4 transB) {
    DynamicsJNI.btHingeConstraint_testLimit(swigCPtr, this, transA, transB);
  }

  public Matrix4 getAFrameConst() {
	return DynamicsJNI.btHingeConstraint_getAFrameConst(swigCPtr, this);
}

  public Matrix4 getBFrameConst() {
	return DynamicsJNI.btHingeConstraint_getBFrameConst(swigCPtr, this);
}

  public Matrix4 getAFrame() {
	return DynamicsJNI.btHingeConstraint_getAFrame(swigCPtr, this);
}

  public Matrix4 getBFrame() {
	return DynamicsJNI.btHingeConstraint_getBFrame(swigCPtr, this);
}

  public int getSolveLimit() {
    return DynamicsJNI.btHingeConstraint_getSolveLimit(swigCPtr, this);
  }

  public float getLimitSign() {
    return DynamicsJNI.btHingeConstraint_getLimitSign(swigCPtr, this);
  }

  public boolean getAngularOnly() {
    return DynamicsJNI.btHingeConstraint_getAngularOnly(swigCPtr, this);
  }

  public boolean getEnableAngularMotor() {
    return DynamicsJNI.btHingeConstraint_getEnableAngularMotor(swigCPtr, this);
  }

  public float getMotorTargetVelocity() {
    return DynamicsJNI.btHingeConstraint_getMotorTargetVelocity(swigCPtr, this);
  }

  public float getMaxMotorImpulse() {
    return DynamicsJNI.btHingeConstraint_getMaxMotorImpulse(swigCPtr, this);
  }

  public boolean getUseFrameOffset() {
    return DynamicsJNI.btHingeConstraint_getUseFrameOffset(swigCPtr, this);
  }

  public void setUseFrameOffset(boolean frameOffsetOnOff) {
    DynamicsJNI.btHingeConstraint_setUseFrameOffset(swigCPtr, this, frameOffsetOnOff);
  }

  public boolean getUseReferenceFrameA() {
    return DynamicsJNI.btHingeConstraint_getUseReferenceFrameA(swigCPtr, this);
  }

  public void setUseReferenceFrameA(boolean useReferenceFrameA) {
    DynamicsJNI.btHingeConstraint_setUseReferenceFrameA(swigCPtr, this, useReferenceFrameA);
  }

  public void setParam(int num, float value, int axis) {
    DynamicsJNI.btHingeConstraint_setParam__SWIG_0(swigCPtr, this, num, value, axis);
  }

  public void setParam(int num, float value) {
    DynamicsJNI.btHingeConstraint_setParam__SWIG_1(swigCPtr, this, num, value);
  }

  public float getParam(int num, int axis) {
    return DynamicsJNI.btHingeConstraint_getParam__SWIG_0(swigCPtr, this, num, axis);
  }

  public float getParam(int num) {
    return DynamicsJNI.btHingeConstraint_getParam__SWIG_1(swigCPtr, this, num);
  }

  public int getFlags() {
    return DynamicsJNI.btHingeConstraint_getFlags(swigCPtr, this);
  }

}
