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
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btWheelInfo extends BulletBase {
	private long swigCPtr;
	
	protected btWheelInfo(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btWheelInfo, normally you should not need this constructor it's intended for low-level usage. */ 
	public btWheelInfo(long cPtr, boolean cMemoryOwn) {
		this("btWheelInfo", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btWheelInfo obj) {
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
				DynamicsJNI.delete_btWheelInfo(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  static public class RaycastInfo extends BulletBase {
  	private long swigCPtr;
  	
  	protected RaycastInfo(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new RaycastInfo, normally you should not need this constructor it's intended for low-level usage. */ 
  	public RaycastInfo(long cPtr, boolean cMemoryOwn) {
  		this("RaycastInfo", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(RaycastInfo obj) {
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
  				DynamicsJNI.delete_btWheelInfo_RaycastInfo(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setContactNormalWS(btVector3 value) {
      DynamicsJNI.btWheelInfo_RaycastInfo_contactNormalWS_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getContactNormalWS() {
      long cPtr = DynamicsJNI.btWheelInfo_RaycastInfo_contactNormalWS_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setContactPointWS(btVector3 value) {
      DynamicsJNI.btWheelInfo_RaycastInfo_contactPointWS_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getContactPointWS() {
      long cPtr = DynamicsJNI.btWheelInfo_RaycastInfo_contactPointWS_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setSuspensionLength(float value) {
      DynamicsJNI.btWheelInfo_RaycastInfo_suspensionLength_set(swigCPtr, this, value);
    }
  
    public float getSuspensionLength() {
      return DynamicsJNI.btWheelInfo_RaycastInfo_suspensionLength_get(swigCPtr, this);
    }
  
    public void setHardPointWS(btVector3 value) {
      DynamicsJNI.btWheelInfo_RaycastInfo_hardPointWS_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getHardPointWS() {
      long cPtr = DynamicsJNI.btWheelInfo_RaycastInfo_hardPointWS_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setWheelDirectionWS(btVector3 value) {
      DynamicsJNI.btWheelInfo_RaycastInfo_wheelDirectionWS_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getWheelDirectionWS() {
      long cPtr = DynamicsJNI.btWheelInfo_RaycastInfo_wheelDirectionWS_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setWheelAxleWS(btVector3 value) {
      DynamicsJNI.btWheelInfo_RaycastInfo_wheelAxleWS_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getWheelAxleWS() {
      long cPtr = DynamicsJNI.btWheelInfo_RaycastInfo_wheelAxleWS_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setIsInContact(boolean value) {
      DynamicsJNI.btWheelInfo_RaycastInfo_isInContact_set(swigCPtr, this, value);
    }
  
    public boolean getIsInContact() {
      return DynamicsJNI.btWheelInfo_RaycastInfo_isInContact_get(swigCPtr, this);
    }
  
    public void setGroundObject(long value) {
      DynamicsJNI.btWheelInfo_RaycastInfo_groundObject_set(swigCPtr, this, value);
    }
  
    public long getGroundObject() {
      return DynamicsJNI.btWheelInfo_RaycastInfo_groundObject_get(swigCPtr, this);
    }
  
    public RaycastInfo() {
      this(DynamicsJNI.new_btWheelInfo_RaycastInfo(), true);
    }
  
  }

  public void setRaycastInfo(btWheelInfo.RaycastInfo value) {
    DynamicsJNI.btWheelInfo_raycastInfo_set(swigCPtr, this, btWheelInfo.RaycastInfo.getCPtr(value), value);
  }

  public btWheelInfo.RaycastInfo getRaycastInfo() {
    long cPtr = DynamicsJNI.btWheelInfo_raycastInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btWheelInfo.RaycastInfo(cPtr, false);
  }

  public void setWorldTransform(btTransform value) {
    DynamicsJNI.btWheelInfo_worldTransform_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getWorldTransform() {
    long cPtr = DynamicsJNI.btWheelInfo_worldTransform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setChassisConnectionPointCS(btVector3 value) {
    DynamicsJNI.btWheelInfo_chassisConnectionPointCS_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getChassisConnectionPointCS() {
    long cPtr = DynamicsJNI.btWheelInfo_chassisConnectionPointCS_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setWheelDirectionCS(btVector3 value) {
    DynamicsJNI.btWheelInfo_wheelDirectionCS_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getWheelDirectionCS() {
    long cPtr = DynamicsJNI.btWheelInfo_wheelDirectionCS_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setWheelAxleCS(btVector3 value) {
    DynamicsJNI.btWheelInfo_wheelAxleCS_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getWheelAxleCS() {
    long cPtr = DynamicsJNI.btWheelInfo_wheelAxleCS_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setSuspensionRestLength1(float value) {
    DynamicsJNI.btWheelInfo_suspensionRestLength1_set(swigCPtr, this, value);
  }

  public float getSuspensionRestLength1() {
    return DynamicsJNI.btWheelInfo_suspensionRestLength1_get(swigCPtr, this);
  }

  public void setMaxSuspensionTravelCm(float value) {
    DynamicsJNI.btWheelInfo_maxSuspensionTravelCm_set(swigCPtr, this, value);
  }

  public float getMaxSuspensionTravelCm() {
    return DynamicsJNI.btWheelInfo_maxSuspensionTravelCm_get(swigCPtr, this);
  }

  public float getSuspensionRestLength() {
    return DynamicsJNI.btWheelInfo_getSuspensionRestLength(swigCPtr, this);
  }

  public void setWheelsRadius(float value) {
    DynamicsJNI.btWheelInfo_wheelsRadius_set(swigCPtr, this, value);
  }

  public float getWheelsRadius() {
    return DynamicsJNI.btWheelInfo_wheelsRadius_get(swigCPtr, this);
  }

  public void setSuspensionStiffness(float value) {
    DynamicsJNI.btWheelInfo_suspensionStiffness_set(swigCPtr, this, value);
  }

  public float getSuspensionStiffness() {
    return DynamicsJNI.btWheelInfo_suspensionStiffness_get(swigCPtr, this);
  }

  public void setWheelsDampingCompression(float value) {
    DynamicsJNI.btWheelInfo_wheelsDampingCompression_set(swigCPtr, this, value);
  }

  public float getWheelsDampingCompression() {
    return DynamicsJNI.btWheelInfo_wheelsDampingCompression_get(swigCPtr, this);
  }

  public void setWheelsDampingRelaxation(float value) {
    DynamicsJNI.btWheelInfo_wheelsDampingRelaxation_set(swigCPtr, this, value);
  }

  public float getWheelsDampingRelaxation() {
    return DynamicsJNI.btWheelInfo_wheelsDampingRelaxation_get(swigCPtr, this);
  }

  public void setFrictionSlip(float value) {
    DynamicsJNI.btWheelInfo_frictionSlip_set(swigCPtr, this, value);
  }

  public float getFrictionSlip() {
    return DynamicsJNI.btWheelInfo_frictionSlip_get(swigCPtr, this);
  }

  public void setSteering(float value) {
    DynamicsJNI.btWheelInfo_steering_set(swigCPtr, this, value);
  }

  public float getSteering() {
    return DynamicsJNI.btWheelInfo_steering_get(swigCPtr, this);
  }

  public void setRotation(float value) {
    DynamicsJNI.btWheelInfo_rotation_set(swigCPtr, this, value);
  }

  public float getRotation() {
    return DynamicsJNI.btWheelInfo_rotation_get(swigCPtr, this);
  }

  public void setDeltaRotation(float value) {
    DynamicsJNI.btWheelInfo_deltaRotation_set(swigCPtr, this, value);
  }

  public float getDeltaRotation() {
    return DynamicsJNI.btWheelInfo_deltaRotation_get(swigCPtr, this);
  }

  public void setRollInfluence(float value) {
    DynamicsJNI.btWheelInfo_rollInfluence_set(swigCPtr, this, value);
  }

  public float getRollInfluence() {
    return DynamicsJNI.btWheelInfo_rollInfluence_get(swigCPtr, this);
  }

  public void setMaxSuspensionForce(float value) {
    DynamicsJNI.btWheelInfo_maxSuspensionForce_set(swigCPtr, this, value);
  }

  public float getMaxSuspensionForce() {
    return DynamicsJNI.btWheelInfo_maxSuspensionForce_get(swigCPtr, this);
  }

  public void setEngineForce(float value) {
    DynamicsJNI.btWheelInfo_engineForce_set(swigCPtr, this, value);
  }

  public float getEngineForce() {
    return DynamicsJNI.btWheelInfo_engineForce_get(swigCPtr, this);
  }

  public void setBrake(float value) {
    DynamicsJNI.btWheelInfo_brake_set(swigCPtr, this, value);
  }

  public float getBrake() {
    return DynamicsJNI.btWheelInfo_brake_get(swigCPtr, this);
  }

  public void setBIsFrontWheel(boolean value) {
    DynamicsJNI.btWheelInfo_bIsFrontWheel_set(swigCPtr, this, value);
  }

  public boolean getBIsFrontWheel() {
    return DynamicsJNI.btWheelInfo_bIsFrontWheel_get(swigCPtr, this);
  }

  public void setClientInfo(long value) {
    DynamicsJNI.btWheelInfo_clientInfo_set(swigCPtr, this, value);
  }

  public long getClientInfo() {
    return DynamicsJNI.btWheelInfo_clientInfo_get(swigCPtr, this);
  }

  public btWheelInfo() {
    this(DynamicsJNI.new_btWheelInfo__SWIG_0(), true);
  }

  public btWheelInfo(btWheelInfoConstructionInfo ci) {
    this(DynamicsJNI.new_btWheelInfo__SWIG_1(btWheelInfoConstructionInfo.getCPtr(ci), ci), true);
  }

  public void updateWheel(btRigidBody chassis, btWheelInfo.RaycastInfo raycastInfo) {
    DynamicsJNI.btWheelInfo_updateWheel(swigCPtr, this, btRigidBody.getCPtr(chassis), chassis, btWheelInfo.RaycastInfo.getCPtr(raycastInfo), raycastInfo);
  }

  public void setClippedInvContactDotSuspension(float value) {
    DynamicsJNI.btWheelInfo_clippedInvContactDotSuspension_set(swigCPtr, this, value);
  }

  public float getClippedInvContactDotSuspension() {
    return DynamicsJNI.btWheelInfo_clippedInvContactDotSuspension_get(swigCPtr, this);
  }

  public void setSuspensionRelativeVelocity(float value) {
    DynamicsJNI.btWheelInfo_suspensionRelativeVelocity_set(swigCPtr, this, value);
  }

  public float getSuspensionRelativeVelocity() {
    return DynamicsJNI.btWheelInfo_suspensionRelativeVelocity_get(swigCPtr, this);
  }

  public void setWheelsSuspensionForce(float value) {
    DynamicsJNI.btWheelInfo_wheelsSuspensionForce_set(swigCPtr, this, value);
  }

  public float getWheelsSuspensionForce() {
    return DynamicsJNI.btWheelInfo_wheelsSuspensionForce_get(swigCPtr, this);
  }

  public void setSkidInfo(float value) {
    DynamicsJNI.btWheelInfo_skidInfo_set(swigCPtr, this, value);
  }

  public float getSkidInfo() {
    return DynamicsJNI.btWheelInfo_skidInfo_get(swigCPtr, this);
  }

}
