/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.obvilion.box.physics.bullet.collision;

import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.physics.bullet.linearmath.*;

public class btConvexInternalShapeData extends BulletBase {
	private long swigCPtr;
	
	protected btConvexInternalShapeData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConvexInternalShapeData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btConvexInternalShapeData(long cPtr, boolean cMemoryOwn) {
		this("btConvexInternalShapeData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btConvexInternalShapeData obj) {
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
				CollisionJNI.delete_btConvexInternalShapeData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setCollisionShapeData(btCollisionShapeData value) {
    CollisionJNI.btConvexInternalShapeData_collisionShapeData_set(swigCPtr, this, btCollisionShapeData.getCPtr(value), value);
  }

  public btCollisionShapeData getCollisionShapeData() {
    long cPtr = CollisionJNI.btConvexInternalShapeData_collisionShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionShapeData(cPtr, false);
  }

  public void setLocalScaling(btVector3FloatData value) {
    CollisionJNI.btConvexInternalShapeData_localScaling_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getLocalScaling() {
    long cPtr = CollisionJNI.btConvexInternalShapeData_localScaling_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setImplicitShapeDimensions(btVector3FloatData value) {
    CollisionJNI.btConvexInternalShapeData_implicitShapeDimensions_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getImplicitShapeDimensions() {
    long cPtr = CollisionJNI.btConvexInternalShapeData_implicitShapeDimensions_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setCollisionMargin(float value) {
    CollisionJNI.btConvexInternalShapeData_collisionMargin_set(swigCPtr, this, value);
  }

  public float getCollisionMargin() {
    return CollisionJNI.btConvexInternalShapeData_collisionMargin_get(swigCPtr, this);
  }

  public void setPadding(int value) {
    CollisionJNI.btConvexInternalShapeData_padding_set(swigCPtr, this, value);
  }

  public int getPadding() {
    return CollisionJNI.btConvexInternalShapeData_padding_get(swigCPtr, this);
  }

  public btConvexInternalShapeData() {
    this(CollisionJNI.new_btConvexInternalShapeData(), true);
  }

}
