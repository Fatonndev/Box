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

public class btJointFeedback extends BulletBase {
	private long swigCPtr;
	
	protected btJointFeedback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btJointFeedback, normally you should not need this constructor it's intended for low-level usage. */ 
	public btJointFeedback(long cPtr, boolean cMemoryOwn) {
		this("btJointFeedback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btJointFeedback obj) {
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
				DynamicsJNI.delete_btJointFeedback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return DynamicsJNI.btJointFeedback_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    DynamicsJNI.btJointFeedback_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return DynamicsJNI.btJointFeedback_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    DynamicsJNI.btJointFeedback_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return DynamicsJNI.btJointFeedback_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    DynamicsJNI.btJointFeedback_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return DynamicsJNI.btJointFeedback_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    DynamicsJNI.btJointFeedback_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public void setAppliedForceBodyA(btVector3 value) {
    DynamicsJNI.btJointFeedback_appliedForceBodyA_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAppliedForceBodyA() {
    long cPtr = DynamicsJNI.btJointFeedback_appliedForceBodyA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setAppliedTorqueBodyA(btVector3 value) {
    DynamicsJNI.btJointFeedback_appliedTorqueBodyA_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAppliedTorqueBodyA() {
    long cPtr = DynamicsJNI.btJointFeedback_appliedTorqueBodyA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setAppliedForceBodyB(btVector3 value) {
    DynamicsJNI.btJointFeedback_appliedForceBodyB_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAppliedForceBodyB() {
    long cPtr = DynamicsJNI.btJointFeedback_appliedForceBodyB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setAppliedTorqueBodyB(btVector3 value) {
    DynamicsJNI.btJointFeedback_appliedTorqueBodyB_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAppliedTorqueBodyB() {
    long cPtr = DynamicsJNI.btJointFeedback_appliedTorqueBodyB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public btJointFeedback() {
    this(DynamicsJNI.new_btJointFeedback(), true);
  }

}
