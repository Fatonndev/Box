/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import ru.obvilion.box.physics.bullet.BulletBase;

public class btBulletSerializedArrays extends BulletBase {
	private long swigCPtr;
	
	protected btBulletSerializedArrays(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btBulletSerializedArrays, normally you should not need this constructor it's intended for low-level usage. */ 
	public btBulletSerializedArrays(long cPtr, boolean cMemoryOwn) {
		this("btBulletSerializedArrays", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btBulletSerializedArrays obj) {
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
				LinearMathJNI.delete_btBulletSerializedArrays(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btBulletSerializedArrays() {
    this(LinearMathJNI.new_btBulletSerializedArrays(), true);
  }

  public void setBvhsDouble(SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhDoubleData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_bvhsDouble_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhDoubleData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhDoubleData_p_t getBvhsDouble() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_bvhsDouble_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhDoubleData_p_t(cPtr, false);
  }

  public void setBvhsFloat(SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhFloatData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_bvhsFloat_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhFloatData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhFloatData_p_t getBvhsFloat() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_bvhsFloat_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhFloatData_p_t(cPtr, false);
  }

  public void setColShapeData(SWIGTYPE_p_btAlignedObjectArrayT_btCollisionShapeData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_colShapeData_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btCollisionShapeData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btCollisionShapeData_p_t getColShapeData() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_colShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btCollisionShapeData_p_t(cPtr, false);
  }

  public void setDynamicWorldInfoDataDouble(SWIGTYPE_p_btAlignedObjectArrayT_btDynamicsWorldDoubleData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_dynamicWorldInfoDataDouble_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btDynamicsWorldDoubleData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btDynamicsWorldDoubleData_p_t getDynamicWorldInfoDataDouble() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_dynamicWorldInfoDataDouble_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btDynamicsWorldDoubleData_p_t(cPtr, false);
  }

  public void setDynamicWorldInfoDataFloat(SWIGTYPE_p_btAlignedObjectArrayT_btDynamicsWorldFloatData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_dynamicWorldInfoDataFloat_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btDynamicsWorldFloatData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btDynamicsWorldFloatData_p_t getDynamicWorldInfoDataFloat() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_dynamicWorldInfoDataFloat_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btDynamicsWorldFloatData_p_t(cPtr, false);
  }

  public void setRigidBodyDataDouble(SWIGTYPE_p_btAlignedObjectArrayT_btRigidBodyDoubleData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_rigidBodyDataDouble_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btRigidBodyDoubleData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btRigidBodyDoubleData_p_t getRigidBodyDataDouble() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_rigidBodyDataDouble_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btRigidBodyDoubleData_p_t(cPtr, false);
  }

  public void setRigidBodyDataFloat(SWIGTYPE_p_btAlignedObjectArrayT_btRigidBodyFloatData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_rigidBodyDataFloat_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btRigidBodyFloatData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btRigidBodyFloatData_p_t getRigidBodyDataFloat() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_rigidBodyDataFloat_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btRigidBodyFloatData_p_t(cPtr, false);
  }

  public void setCollisionObjectDataDouble(SWIGTYPE_p_btAlignedObjectArrayT_btCollisionObjectDoubleData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_collisionObjectDataDouble_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btCollisionObjectDoubleData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btCollisionObjectDoubleData_p_t getCollisionObjectDataDouble() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_collisionObjectDataDouble_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btCollisionObjectDoubleData_p_t(cPtr, false);
  }

  public void setCollisionObjectDataFloat(SWIGTYPE_p_btAlignedObjectArrayT_btCollisionObjectFloatData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_collisionObjectDataFloat_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btCollisionObjectFloatData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btCollisionObjectFloatData_p_t getCollisionObjectDataFloat() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_collisionObjectDataFloat_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btCollisionObjectFloatData_p_t(cPtr, false);
  }

  public void setConstraintDataFloat(SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintFloatData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_constraintDataFloat_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintFloatData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintFloatData_p_t getConstraintDataFloat() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_constraintDataFloat_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintFloatData_p_t(cPtr, false);
  }

  public void setConstraintDataDouble(SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintDoubleData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_constraintDataDouble_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintDoubleData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintDoubleData_p_t getConstraintDataDouble() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_constraintDataDouble_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintDoubleData_p_t(cPtr, false);
  }

  public void setConstraintData(SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_constraintData_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintData_p_t getConstraintData() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_constraintData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btTypedConstraintData_p_t(cPtr, false);
  }

  public void setSoftBodyFloatData(SWIGTYPE_p_btAlignedObjectArrayT_btSoftBodyFloatData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_softBodyFloatData_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btSoftBodyFloatData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btSoftBodyFloatData_p_t getSoftBodyFloatData() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_softBodyFloatData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btSoftBodyFloatData_p_t(cPtr, false);
  }

  public void setSoftBodyDoubleData(SWIGTYPE_p_btAlignedObjectArrayT_btSoftBodyDoubleData_p_t value) {
    LinearMathJNI.btBulletSerializedArrays_softBodyDoubleData_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btSoftBodyDoubleData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btSoftBodyDoubleData_p_t getSoftBodyDoubleData() {
    long cPtr = LinearMathJNI.btBulletSerializedArrays_softBodyDoubleData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btSoftBodyDoubleData_p_t(cPtr, false);
  }

}
