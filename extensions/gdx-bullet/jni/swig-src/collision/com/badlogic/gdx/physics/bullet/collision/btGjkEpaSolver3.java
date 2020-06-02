/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btGjkEpaSolver3 extends BulletBase {
	private long swigCPtr;
	
	protected btGjkEpaSolver3(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGjkEpaSolver3, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGjkEpaSolver3(long cPtr, boolean cMemoryOwn) {
		this("btGjkEpaSolver3", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGjkEpaSolver3 obj) {
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
				CollisionJNI.delete_btGjkEpaSolver3(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  static public class sResults extends BulletBase {
  	private long swigCPtr;
  	
  	protected sResults(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new sResults, normally you should not need this constructor it's intended for low-level usage. */ 
  	public sResults(long cPtr, boolean cMemoryOwn) {
  		this("sResults", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(sResults obj) {
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
  				CollisionJNI.delete_btGjkEpaSolver3_sResults(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setStatus(int value) {
      CollisionJNI.btGjkEpaSolver3_sResults_status_set(swigCPtr, this, value);
    }
  
    public int getStatus() {
      return CollisionJNI.btGjkEpaSolver3_sResults_status_get(swigCPtr, this);
    }
  
    public void setWitnesses(btVector3 value) {
      CollisionJNI.btGjkEpaSolver3_sResults_witnesses_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getWitnesses() {
      long cPtr = CollisionJNI.btGjkEpaSolver3_sResults_witnesses_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setNormal(btVector3 value) {
      CollisionJNI.btGjkEpaSolver3_sResults_normal_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getNormal() {
      long cPtr = CollisionJNI.btGjkEpaSolver3_sResults_normal_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setDistance(float value) {
      CollisionJNI.btGjkEpaSolver3_sResults_distance_set(swigCPtr, this, value);
    }
  
    public float getDistance() {
      return CollisionJNI.btGjkEpaSolver3_sResults_distance_get(swigCPtr, this);
    }
  
    public sResults() {
      this(CollisionJNI.new_btGjkEpaSolver3_sResults(), true);
    }
  
    public final static class eStatus {
      public final static int Separated = 0;
      public final static int Penetrating = Separated + 1;
      public final static int GJK_Failed = Penetrating + 1;
      public final static int EPA_Failed = GJK_Failed + 1;
    }
  
  }

  public btGjkEpaSolver3() {
    this(CollisionJNI.new_btGjkEpaSolver3(), true);
  }

}
