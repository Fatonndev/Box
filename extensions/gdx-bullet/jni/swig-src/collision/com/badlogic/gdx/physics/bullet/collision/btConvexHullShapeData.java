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
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btConvexHullShapeData extends BulletBase {
	private long swigCPtr;
	
	protected btConvexHullShapeData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConvexHullShapeData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btConvexHullShapeData(long cPtr, boolean cMemoryOwn) {
		this("btConvexHullShapeData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btConvexHullShapeData obj) {
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
				CollisionJNI.delete_btConvexHullShapeData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setConvexInternalShapeData(btConvexInternalShapeData value) {
    CollisionJNI.btConvexHullShapeData_convexInternalShapeData_set(swigCPtr, this, btConvexInternalShapeData.getCPtr(value), value);
  }

  public btConvexInternalShapeData getConvexInternalShapeData() {
    long cPtr = CollisionJNI.btConvexHullShapeData_convexInternalShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexInternalShapeData(cPtr, false);
  }

  public void setUnscaledPointsFloatPtr(btVector3FloatData value) {
    CollisionJNI.btConvexHullShapeData_unscaledPointsFloatPtr_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getUnscaledPointsFloatPtr() {
    long cPtr = CollisionJNI.btConvexHullShapeData_unscaledPointsFloatPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setUnscaledPointsDoublePtr(btVector3DoubleData value) {
    CollisionJNI.btConvexHullShapeData_unscaledPointsDoublePtr_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getUnscaledPointsDoublePtr() {
    long cPtr = CollisionJNI.btConvexHullShapeData_unscaledPointsDoublePtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setNumUnscaledPoints(int value) {
    CollisionJNI.btConvexHullShapeData_numUnscaledPoints_set(swigCPtr, this, value);
  }

  public int getNumUnscaledPoints() {
    return CollisionJNI.btConvexHullShapeData_numUnscaledPoints_get(swigCPtr, this);
  }

  public void setPadding3(String value) {
    CollisionJNI.btConvexHullShapeData_padding3_set(swigCPtr, this, value);
  }

  public String getPadding3() {
    return CollisionJNI.btConvexHullShapeData_padding3_get(swigCPtr, this);
  }

  public btConvexHullShapeData() {
    this(CollisionJNI.new_btConvexHullShapeData(), true);
  }

}
