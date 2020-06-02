/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.collision.*;
import ru.obvilion.box.math.Vector3;

public class btKinematicCharacterController extends btCharacterControllerInterface {
	private long swigCPtr;
	
	protected btKinematicCharacterController(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btKinematicCharacterController_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btKinematicCharacterController, normally you should not need this constructor it's intended for low-level usage. */
	public btKinematicCharacterController(long cPtr, boolean cMemoryOwn) {
		this("btKinematicCharacterController", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btKinematicCharacterController_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btKinematicCharacterController obj) {
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
				DynamicsJNI.delete_btKinematicCharacterController(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return DynamicsJNI.btKinematicCharacterController_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    DynamicsJNI.btKinematicCharacterController_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return DynamicsJNI.btKinematicCharacterController_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    DynamicsJNI.btKinematicCharacterController_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return DynamicsJNI.btKinematicCharacterController_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    DynamicsJNI.btKinematicCharacterController_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return DynamicsJNI.btKinematicCharacterController_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    DynamicsJNI.btKinematicCharacterController_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public btKinematicCharacterController(btPairCachingGhostObject ghostObject, btConvexShape convexShape, float stepHeight, Vector3 up) {
    this(DynamicsJNI.new_btKinematicCharacterController__SWIG_0(btPairCachingGhostObject.getCPtr(ghostObject), ghostObject, btConvexShape.getCPtr(convexShape), convexShape, stepHeight, up), true);
  }

  public btKinematicCharacterController(btPairCachingGhostObject ghostObject, btConvexShape convexShape, float stepHeight) {
    this(DynamicsJNI.new_btKinematicCharacterController__SWIG_1(btPairCachingGhostObject.getCPtr(ghostObject), ghostObject, btConvexShape.getCPtr(convexShape), convexShape, stepHeight), true);
  }

  public void setUp(Vector3 up) {
    DynamicsJNI.btKinematicCharacterController_setUp(swigCPtr, this, up);
  }

  public Vector3 getUp() {
	return DynamicsJNI.btKinematicCharacterController_getUp(swigCPtr, this);
}

  public void setAngularVelocity(Vector3 velocity) {
    DynamicsJNI.btKinematicCharacterController_setAngularVelocity(swigCPtr, this, velocity);
  }

  public Vector3 getAngularVelocity() {
	return DynamicsJNI.btKinematicCharacterController_getAngularVelocity(swigCPtr, this);
}

  public void setLinearVelocity(Vector3 velocity) {
    DynamicsJNI.btKinematicCharacterController_setLinearVelocity(swigCPtr, this, velocity);
  }

  public Vector3 getLinearVelocity() {
	return DynamicsJNI.btKinematicCharacterController_getLinearVelocity(swigCPtr, this);
}

  public void setLinearDamping(float d) {
    DynamicsJNI.btKinematicCharacterController_setLinearDamping(swigCPtr, this, d);
  }

  public float getLinearDamping() {
    return DynamicsJNI.btKinematicCharacterController_getLinearDamping(swigCPtr, this);
  }

  public void setAngularDamping(float d) {
    DynamicsJNI.btKinematicCharacterController_setAngularDamping(swigCPtr, this, d);
  }

  public float getAngularDamping() {
    return DynamicsJNI.btKinematicCharacterController_getAngularDamping(swigCPtr, this);
  }

  public void setStepHeight(float h) {
    DynamicsJNI.btKinematicCharacterController_setStepHeight(swigCPtr, this, h);
  }

  public float getStepHeight() {
    return DynamicsJNI.btKinematicCharacterController_getStepHeight(swigCPtr, this);
  }

  public void setFallSpeed(float fallSpeed) {
    DynamicsJNI.btKinematicCharacterController_setFallSpeed(swigCPtr, this, fallSpeed);
  }

  public float getFallSpeed() {
    return DynamicsJNI.btKinematicCharacterController_getFallSpeed(swigCPtr, this);
  }

  public void setJumpSpeed(float jumpSpeed) {
    DynamicsJNI.btKinematicCharacterController_setJumpSpeed(swigCPtr, this, jumpSpeed);
  }

  public float getJumpSpeed() {
    return DynamicsJNI.btKinematicCharacterController_getJumpSpeed(swigCPtr, this);
  }

  public void setMaxJumpHeight(float maxJumpHeight) {
    DynamicsJNI.btKinematicCharacterController_setMaxJumpHeight(swigCPtr, this, maxJumpHeight);
  }

  public void jump(Vector3 v) {
    DynamicsJNI.btKinematicCharacterController_jump__SWIG_0(swigCPtr, this, v);
  }

  public void jump() {
    DynamicsJNI.btKinematicCharacterController_jump__SWIG_1(swigCPtr, this);
  }

  public void applyImpulse(Vector3 v) {
    DynamicsJNI.btKinematicCharacterController_applyImpulse(swigCPtr, this, v);
  }

  public void setGravity(Vector3 gravity) {
    DynamicsJNI.btKinematicCharacterController_setGravity(swigCPtr, this, gravity);
  }

  public Vector3 getGravity() {
	return DynamicsJNI.btKinematicCharacterController_getGravity(swigCPtr, this);
}

  public void setMaxSlope(float slopeRadians) {
    DynamicsJNI.btKinematicCharacterController_setMaxSlope(swigCPtr, this, slopeRadians);
  }

  public float getMaxSlope() {
    return DynamicsJNI.btKinematicCharacterController_getMaxSlope(swigCPtr, this);
  }

  public void setMaxPenetrationDepth(float d) {
    DynamicsJNI.btKinematicCharacterController_setMaxPenetrationDepth(swigCPtr, this, d);
  }

  public float getMaxPenetrationDepth() {
    return DynamicsJNI.btKinematicCharacterController_getMaxPenetrationDepth(swigCPtr, this);
  }

  public btPairCachingGhostObject getGhostObject() {
    long cPtr = DynamicsJNI.btKinematicCharacterController_getGhostObject(swigCPtr, this);
    return (cPtr == 0) ? null : new btPairCachingGhostObject(cPtr, false);
  }

  public void setUseGhostSweepTest(boolean useGhostObjectSweepTest) {
    DynamicsJNI.btKinematicCharacterController_setUseGhostSweepTest(swigCPtr, this, useGhostObjectSweepTest);
  }

}
