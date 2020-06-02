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
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Matrix4;

public class btGjkEpaSolver2 extends BulletBase {
	private long swigCPtr;
	
	protected btGjkEpaSolver2(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGjkEpaSolver2, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGjkEpaSolver2(long cPtr, boolean cMemoryOwn) {
		this("btGjkEpaSolver2", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGjkEpaSolver2 obj) {
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
				CollisionJNI.delete_btGjkEpaSolver2(swigCPtr);
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
  				CollisionJNI.delete_btGjkEpaSolver2_sResults(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setStatus(int value) {
      CollisionJNI.btGjkEpaSolver2_sResults_status_set(swigCPtr, this, value);
    }
  
    public int getStatus() {
      return CollisionJNI.btGjkEpaSolver2_sResults_status_get(swigCPtr, this);
    }
  
    public void setWitnesses(btVector3 value) {
      CollisionJNI.btGjkEpaSolver2_sResults_witnesses_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getWitnesses() {
      long cPtr = CollisionJNI.btGjkEpaSolver2_sResults_witnesses_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setNormal(btVector3 value) {
      CollisionJNI.btGjkEpaSolver2_sResults_normal_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getNormal() {
      long cPtr = CollisionJNI.btGjkEpaSolver2_sResults_normal_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setDistance(float value) {
      CollisionJNI.btGjkEpaSolver2_sResults_distance_set(swigCPtr, this, value);
    }
  
    public float getDistance() {
      return CollisionJNI.btGjkEpaSolver2_sResults_distance_get(swigCPtr, this);
    }
  
    public sResults() {
      this(CollisionJNI.new_btGjkEpaSolver2_sResults(), true);
    }
  
    public final static class eStatus {
      public final static int Separated = 0;
      public final static int Penetrating = Separated + 1;
      public final static int GJK_Failed = Penetrating + 1;
      public final static int EPA_Failed = GJK_Failed + 1;
    }
  
  }

  public static int StackSizeRequirement() {
    return CollisionJNI.btGjkEpaSolver2_StackSizeRequirement();
  }

  public static boolean Distance(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, btGjkEpaSolver2.sResults results) {
    return CollisionJNI.btGjkEpaSolver2_Distance(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, btGjkEpaSolver2.sResults.getCPtr(results), results);
  }

  public static boolean Penetration(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, btGjkEpaSolver2.sResults results, boolean usemargins) {
    return CollisionJNI.btGjkEpaSolver2_Penetration__SWIG_0(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, btGjkEpaSolver2.sResults.getCPtr(results), results, usemargins);
  }

  public static boolean Penetration(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, btGjkEpaSolver2.sResults results) {
    return CollisionJNI.btGjkEpaSolver2_Penetration__SWIG_1(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, btGjkEpaSolver2.sResults.getCPtr(results), results);
  }

  public static float SignedDistance(Vector3 position, float margin, btConvexShape shape, Matrix4 wtrs, btGjkEpaSolver2.sResults results) {
    return CollisionJNI.btGjkEpaSolver2_SignedDistance__SWIG_0(position, margin, btConvexShape.getCPtr(shape), shape, wtrs, btGjkEpaSolver2.sResults.getCPtr(results), results);
  }

  public static boolean SignedDistance(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, btGjkEpaSolver2.sResults results) {
    return CollisionJNI.btGjkEpaSolver2_SignedDistance__SWIG_1(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, btGjkEpaSolver2.sResults.getCPtr(results), results);
  }

  public btGjkEpaSolver2() {
    this(CollisionJNI.new_btGjkEpaSolver2(), true);
  }

}
