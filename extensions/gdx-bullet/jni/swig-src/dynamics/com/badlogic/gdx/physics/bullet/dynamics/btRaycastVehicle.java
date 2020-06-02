/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btRaycastVehicle extends btActionInterface {
	private long swigCPtr;
	
	protected btRaycastVehicle(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btRaycastVehicle_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btRaycastVehicle, normally you should not need this constructor it's intended for low-level usage. */
	public btRaycastVehicle(long cPtr, boolean cMemoryOwn) {
		this("btRaycastVehicle", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btRaycastVehicle_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btRaycastVehicle obj) {
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
				DynamicsJNI.delete_btRaycastVehicle(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  static public class btVehicleTuning extends BulletBase {
  	private long swigCPtr;
  	
  	protected btVehicleTuning(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new btVehicleTuning, normally you should not need this constructor it's intended for low-level usage. */ 
  	public btVehicleTuning(long cPtr, boolean cMemoryOwn) {
  		this("btVehicleTuning", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(btVehicleTuning obj) {
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
  				DynamicsJNI.delete_btRaycastVehicle_btVehicleTuning(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public btVehicleTuning() {
      this(DynamicsJNI.new_btRaycastVehicle_btVehicleTuning(), true);
    }
  
    public void setSuspensionStiffness(float value) {
      DynamicsJNI.btRaycastVehicle_btVehicleTuning_suspensionStiffness_set(swigCPtr, this, value);
    }
  
    public float getSuspensionStiffness() {
      return DynamicsJNI.btRaycastVehicle_btVehicleTuning_suspensionStiffness_get(swigCPtr, this);
    }
  
    public void setSuspensionCompression(float value) {
      DynamicsJNI.btRaycastVehicle_btVehicleTuning_suspensionCompression_set(swigCPtr, this, value);
    }
  
    public float getSuspensionCompression() {
      return DynamicsJNI.btRaycastVehicle_btVehicleTuning_suspensionCompression_get(swigCPtr, this);
    }
  
    public void setSuspensionDamping(float value) {
      DynamicsJNI.btRaycastVehicle_btVehicleTuning_suspensionDamping_set(swigCPtr, this, value);
    }
  
    public float getSuspensionDamping() {
      return DynamicsJNI.btRaycastVehicle_btVehicleTuning_suspensionDamping_get(swigCPtr, this);
    }
  
    public void setMaxSuspensionTravelCm(float value) {
      DynamicsJNI.btRaycastVehicle_btVehicleTuning_maxSuspensionTravelCm_set(swigCPtr, this, value);
    }
  
    public float getMaxSuspensionTravelCm() {
      return DynamicsJNI.btRaycastVehicle_btVehicleTuning_maxSuspensionTravelCm_get(swigCPtr, this);
    }
  
    public void setFrictionSlip(float value) {
      DynamicsJNI.btRaycastVehicle_btVehicleTuning_frictionSlip_set(swigCPtr, this, value);
    }
  
    public float getFrictionSlip() {
      return DynamicsJNI.btRaycastVehicle_btVehicleTuning_frictionSlip_get(swigCPtr, this);
    }
  
    public void setMaxSuspensionForce(float value) {
      DynamicsJNI.btRaycastVehicle_btVehicleTuning_maxSuspensionForce_set(swigCPtr, this, value);
    }
  
    public float getMaxSuspensionForce() {
      return DynamicsJNI.btRaycastVehicle_btVehicleTuning_maxSuspensionForce_get(swigCPtr, this);
    }
  
  }

  public btRaycastVehicle(btRaycastVehicle.btVehicleTuning tuning, btRigidBody chassis, btVehicleRaycaster raycaster) {
    this(DynamicsJNI.new_btRaycastVehicle(btRaycastVehicle.btVehicleTuning.getCPtr(tuning), tuning, btRigidBody.getCPtr(chassis), chassis, btVehicleRaycaster.getCPtr(raycaster), raycaster), true);
  }

  public Matrix4 getChassisWorldTransform() {
	return DynamicsJNI.btRaycastVehicle_getChassisWorldTransform(swigCPtr, this);
}

  public float rayCast(btWheelInfo wheel) {
    return DynamicsJNI.btRaycastVehicle_rayCast(swigCPtr, this, btWheelInfo.getCPtr(wheel), wheel);
  }

  public void updateVehicle(float step) {
    DynamicsJNI.btRaycastVehicle_updateVehicle(swigCPtr, this, step);
  }

  public void resetSuspension() {
    DynamicsJNI.btRaycastVehicle_resetSuspension(swigCPtr, this);
  }

  public float getSteeringValue(int wheel) {
    return DynamicsJNI.btRaycastVehicle_getSteeringValue(swigCPtr, this, wheel);
  }

  public void setSteeringValue(float steering, int wheel) {
    DynamicsJNI.btRaycastVehicle_setSteeringValue(swigCPtr, this, steering, wheel);
  }

  public void applyEngineForce(float force, int wheel) {
    DynamicsJNI.btRaycastVehicle_applyEngineForce(swigCPtr, this, force, wheel);
  }

  public Matrix4 getWheelTransformWS(int wheelIndex) {
	return DynamicsJNI.btRaycastVehicle_getWheelTransformWS(swigCPtr, this, wheelIndex);
}

  public void updateWheelTransform(int wheelIndex, boolean interpolatedTransform) {
    DynamicsJNI.btRaycastVehicle_updateWheelTransform__SWIG_0(swigCPtr, this, wheelIndex, interpolatedTransform);
  }

  public void updateWheelTransform(int wheelIndex) {
    DynamicsJNI.btRaycastVehicle_updateWheelTransform__SWIG_1(swigCPtr, this, wheelIndex);
  }

  public btWheelInfo addWheel(Vector3 connectionPointCS0, Vector3 wheelDirectionCS0, Vector3 wheelAxleCS, float suspensionRestLength, float wheelRadius, btRaycastVehicle.btVehicleTuning tuning, boolean isFrontWheel) {
    return new btWheelInfo(DynamicsJNI.btRaycastVehicle_addWheel(swigCPtr, this, connectionPointCS0, wheelDirectionCS0, wheelAxleCS, suspensionRestLength, wheelRadius, btRaycastVehicle.btVehicleTuning.getCPtr(tuning), tuning, isFrontWheel), false);
  }

  public int getNumWheels() {
    return DynamicsJNI.btRaycastVehicle_getNumWheels(swigCPtr, this);
  }

  public void setWheelInfo(SWIGTYPE_p_btAlignedObjectArrayT_btWheelInfo_t value) {
    DynamicsJNI.btRaycastVehicle_wheelInfo_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btWheelInfo_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btWheelInfo_t getWheelInfo() {
    long cPtr = DynamicsJNI.btRaycastVehicle_wheelInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btWheelInfo_t(cPtr, false);
  }

  public btWheelInfo getWheelInfo(int index) {
    return new btWheelInfo(DynamicsJNI.btRaycastVehicle_getWheelInfo(swigCPtr, this, index), false);
  }

  public btWheelInfo getWheelInfoConst(int index) {
    return new btWheelInfo(DynamicsJNI.btRaycastVehicle_getWheelInfoConst(swigCPtr, this, index), false);
  }

  public void updateWheelTransformsWS(btWheelInfo wheel, boolean interpolatedTransform) {
    DynamicsJNI.btRaycastVehicle_updateWheelTransformsWS__SWIG_0(swigCPtr, this, btWheelInfo.getCPtr(wheel), wheel, interpolatedTransform);
  }

  public void updateWheelTransformsWS(btWheelInfo wheel) {
    DynamicsJNI.btRaycastVehicle_updateWheelTransformsWS__SWIG_1(swigCPtr, this, btWheelInfo.getCPtr(wheel), wheel);
  }

  public void setBrake(float brake, int wheelIndex) {
    DynamicsJNI.btRaycastVehicle_setBrake(swigCPtr, this, brake, wheelIndex);
  }

  public void setPitchControl(float pitch) {
    DynamicsJNI.btRaycastVehicle_setPitchControl(swigCPtr, this, pitch);
  }

  public void updateSuspension(float deltaTime) {
    DynamicsJNI.btRaycastVehicle_updateSuspension(swigCPtr, this, deltaTime);
  }

  public void updateFriction(float timeStep) {
    DynamicsJNI.btRaycastVehicle_updateFriction(swigCPtr, this, timeStep);
  }

  public btRigidBody getRigidBody() {
	return btRigidBody.getInstance(DynamicsJNI.btRaycastVehicle_getRigidBody(swigCPtr, this), false);
}

  public btRigidBody getRigidBodyConst() {
	return btRigidBody.getInstance(DynamicsJNI.btRaycastVehicle_getRigidBodyConst(swigCPtr, this), false);
}

  public int getRightAxis() {
    return DynamicsJNI.btRaycastVehicle_getRightAxis(swigCPtr, this);
  }

  public int getUpAxis() {
    return DynamicsJNI.btRaycastVehicle_getUpAxis(swigCPtr, this);
  }

  public int getForwardAxis() {
    return DynamicsJNI.btRaycastVehicle_getForwardAxis(swigCPtr, this);
  }

  public Vector3 getForwardVector() {
	return DynamicsJNI.btRaycastVehicle_getForwardVector(swigCPtr, this);
}

  public float getCurrentSpeedKmHour() {
    return DynamicsJNI.btRaycastVehicle_getCurrentSpeedKmHour(swigCPtr, this);
  }

  public void setCoordinateSystem(int rightIndex, int upIndex, int forwardIndex) {
    DynamicsJNI.btRaycastVehicle_setCoordinateSystem(swigCPtr, this, rightIndex, upIndex, forwardIndex);
  }

  public int getUserConstraintType() {
    return DynamicsJNI.btRaycastVehicle_getUserConstraintType(swigCPtr, this);
  }

  public void setUserConstraintType(int userConstraintType) {
    DynamicsJNI.btRaycastVehicle_setUserConstraintType(swigCPtr, this, userConstraintType);
  }

  public void setUserConstraintId(int uid) {
    DynamicsJNI.btRaycastVehicle_setUserConstraintId(swigCPtr, this, uid);
  }

  public int getUserConstraintId() {
    return DynamicsJNI.btRaycastVehicle_getUserConstraintId(swigCPtr, this);
  }

}
