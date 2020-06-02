/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import ru.obvilion.box.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btGjkCollisionDescription extends BulletBase {
	private long swigCPtr;
	
	protected btGjkCollisionDescription(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGjkCollisionDescription, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGjkCollisionDescription(long cPtr, boolean cMemoryOwn) {
		this("btGjkCollisionDescription", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGjkCollisionDescription obj) {
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
				CollisionJNI.delete_btGjkCollisionDescription(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setFirstDir(btVector3 value) {
    CollisionJNI.btGjkCollisionDescription_firstDir_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getFirstDir() {
    long cPtr = CollisionJNI.btGjkCollisionDescription_firstDir_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setMaxGjkIterations(int value) {
    CollisionJNI.btGjkCollisionDescription_maxGjkIterations_set(swigCPtr, this, value);
  }

  public int getMaxGjkIterations() {
    return CollisionJNI.btGjkCollisionDescription_maxGjkIterations_get(swigCPtr, this);
  }

  public void setMaximumDistanceSquared(float value) {
    CollisionJNI.btGjkCollisionDescription_maximumDistanceSquared_set(swigCPtr, this, value);
  }

  public float getMaximumDistanceSquared() {
    return CollisionJNI.btGjkCollisionDescription_maximumDistanceSquared_get(swigCPtr, this);
  }

  public void setGjkRelError2(float value) {
    CollisionJNI.btGjkCollisionDescription_gjkRelError2_set(swigCPtr, this, value);
  }

  public float getGjkRelError2() {
    return CollisionJNI.btGjkCollisionDescription_gjkRelError2_get(swigCPtr, this);
  }

  public btGjkCollisionDescription() {
    this(CollisionJNI.new_btGjkCollisionDescription(), true);
  }

}
