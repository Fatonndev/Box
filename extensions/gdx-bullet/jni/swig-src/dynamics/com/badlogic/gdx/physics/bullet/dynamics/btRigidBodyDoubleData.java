/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;

public class btRigidBodyDoubleData extends BulletBase {
	private long swigCPtr;
	
	protected btRigidBodyDoubleData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btRigidBodyDoubleData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btRigidBodyDoubleData(long cPtr, boolean cMemoryOwn) {
		this("btRigidBodyDoubleData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btRigidBodyDoubleData obj) {
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
				DynamicsJNI.delete_btRigidBodyDoubleData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setCollisionObjectData(btCollisionObjectDoubleData value) {
    DynamicsJNI.btRigidBodyDoubleData_collisionObjectData_set(swigCPtr, this, btCollisionObjectDoubleData.getCPtr(value), value);
  }

  public btCollisionObjectDoubleData getCollisionObjectData() {
    long cPtr = DynamicsJNI.btRigidBodyDoubleData_collisionObjectData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionObjectDoubleData(cPtr, false);
  }

  public void setInvInertiaTensorWorld(btMatrix3x3DoubleData value) {
    DynamicsJNI.btRigidBodyDoubleData_invInertiaTensorWorld_set(swigCPtr, this, btMatrix3x3DoubleData.getCPtr(value), value);
  }

  public btMatrix3x3DoubleData getInvInertiaTensorWorld() {
    long cPtr = DynamicsJNI.btRigidBodyDoubleData_invInertiaTensorWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btMatrix3x3DoubleData(cPtr, false);
  }

  public void setLinearVelocity(btVector3DoubleData value) {
    DynamicsJNI.btRigidBodyDoubleData_linearVelocity_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getLinearVelocity() {
    long cPtr = DynamicsJNI.btRigidBodyDoubleData_linearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setAngularVelocity(btVector3DoubleData value) {
    DynamicsJNI.btRigidBodyDoubleData_angularVelocity_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getAngularVelocity() {
    long cPtr = DynamicsJNI.btRigidBodyDoubleData_angularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setAngularFactor(btVector3DoubleData value) {
    DynamicsJNI.btRigidBodyDoubleData_angularFactor_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getAngularFactor() {
    long cPtr = DynamicsJNI.btRigidBodyDoubleData_angularFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setLinearFactor(btVector3DoubleData value) {
    DynamicsJNI.btRigidBodyDoubleData_linearFactor_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getLinearFactor() {
    long cPtr = DynamicsJNI.btRigidBodyDoubleData_linearFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setGravity(btVector3DoubleData value) {
    DynamicsJNI.btRigidBodyDoubleData_gravity_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getGravity() {
    long cPtr = DynamicsJNI.btRigidBodyDoubleData_gravity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setGravity_acceleration(btVector3DoubleData value) {
    DynamicsJNI.btRigidBodyDoubleData_gravity_acceleration_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getGravity_acceleration() {
    long cPtr = DynamicsJNI.btRigidBodyDoubleData_gravity_acceleration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setInvInertiaLocal(btVector3DoubleData value) {
    DynamicsJNI.btRigidBodyDoubleData_invInertiaLocal_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getInvInertiaLocal() {
    long cPtr = DynamicsJNI.btRigidBodyDoubleData_invInertiaLocal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setTotalForce(btVector3DoubleData value) {
    DynamicsJNI.btRigidBodyDoubleData_totalForce_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getTotalForce() {
    long cPtr = DynamicsJNI.btRigidBodyDoubleData_totalForce_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setTotalTorque(btVector3DoubleData value) {
    DynamicsJNI.btRigidBodyDoubleData_totalTorque_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getTotalTorque() {
    long cPtr = DynamicsJNI.btRigidBodyDoubleData_totalTorque_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setInverseMass(double value) {
    DynamicsJNI.btRigidBodyDoubleData_inverseMass_set(swigCPtr, this, value);
  }

  public double getInverseMass() {
    return DynamicsJNI.btRigidBodyDoubleData_inverseMass_get(swigCPtr, this);
  }

  public void setLinearDamping(double value) {
    DynamicsJNI.btRigidBodyDoubleData_linearDamping_set(swigCPtr, this, value);
  }

  public double getLinearDamping() {
    return DynamicsJNI.btRigidBodyDoubleData_linearDamping_get(swigCPtr, this);
  }

  public void setAngularDamping(double value) {
    DynamicsJNI.btRigidBodyDoubleData_angularDamping_set(swigCPtr, this, value);
  }

  public double getAngularDamping() {
    return DynamicsJNI.btRigidBodyDoubleData_angularDamping_get(swigCPtr, this);
  }

  public void setAdditionalDampingFactor(double value) {
    DynamicsJNI.btRigidBodyDoubleData_additionalDampingFactor_set(swigCPtr, this, value);
  }

  public double getAdditionalDampingFactor() {
    return DynamicsJNI.btRigidBodyDoubleData_additionalDampingFactor_get(swigCPtr, this);
  }

  public void setAdditionalLinearDampingThresholdSqr(double value) {
    DynamicsJNI.btRigidBodyDoubleData_additionalLinearDampingThresholdSqr_set(swigCPtr, this, value);
  }

  public double getAdditionalLinearDampingThresholdSqr() {
    return DynamicsJNI.btRigidBodyDoubleData_additionalLinearDampingThresholdSqr_get(swigCPtr, this);
  }

  public void setAdditionalAngularDampingThresholdSqr(double value) {
    DynamicsJNI.btRigidBodyDoubleData_additionalAngularDampingThresholdSqr_set(swigCPtr, this, value);
  }

  public double getAdditionalAngularDampingThresholdSqr() {
    return DynamicsJNI.btRigidBodyDoubleData_additionalAngularDampingThresholdSqr_get(swigCPtr, this);
  }

  public void setAdditionalAngularDampingFactor(double value) {
    DynamicsJNI.btRigidBodyDoubleData_additionalAngularDampingFactor_set(swigCPtr, this, value);
  }

  public double getAdditionalAngularDampingFactor() {
    return DynamicsJNI.btRigidBodyDoubleData_additionalAngularDampingFactor_get(swigCPtr, this);
  }

  public void setLinearSleepingThreshold(double value) {
    DynamicsJNI.btRigidBodyDoubleData_linearSleepingThreshold_set(swigCPtr, this, value);
  }

  public double getLinearSleepingThreshold() {
    return DynamicsJNI.btRigidBodyDoubleData_linearSleepingThreshold_get(swigCPtr, this);
  }

  public void setAngularSleepingThreshold(double value) {
    DynamicsJNI.btRigidBodyDoubleData_angularSleepingThreshold_set(swigCPtr, this, value);
  }

  public double getAngularSleepingThreshold() {
    return DynamicsJNI.btRigidBodyDoubleData_angularSleepingThreshold_get(swigCPtr, this);
  }

  public void setAdditionalDamping(int value) {
    DynamicsJNI.btRigidBodyDoubleData_additionalDamping_set(swigCPtr, this, value);
  }

  public int getAdditionalDamping() {
    return DynamicsJNI.btRigidBodyDoubleData_additionalDamping_get(swigCPtr, this);
  }

  public void setPadding(String value) {
    DynamicsJNI.btRigidBodyDoubleData_padding_set(swigCPtr, this, value);
  }

  public String getPadding() {
    return DynamicsJNI.btRigidBodyDoubleData_padding_get(swigCPtr, this);
  }

  public btRigidBodyDoubleData() {
    this(DynamicsJNI.new_btRigidBodyDoubleData(), true);
  }

}
