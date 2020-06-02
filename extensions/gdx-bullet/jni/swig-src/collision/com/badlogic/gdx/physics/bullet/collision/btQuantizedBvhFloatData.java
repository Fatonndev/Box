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

public class btQuantizedBvhFloatData extends BulletBase {
	private long swigCPtr;
	
	protected btQuantizedBvhFloatData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btQuantizedBvhFloatData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btQuantizedBvhFloatData(long cPtr, boolean cMemoryOwn) {
		this("btQuantizedBvhFloatData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btQuantizedBvhFloatData obj) {
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
				CollisionJNI.delete_btQuantizedBvhFloatData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setBvhAabbMin(btVector3FloatData value) {
    CollisionJNI.btQuantizedBvhFloatData_bvhAabbMin_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getBvhAabbMin() {
    long cPtr = CollisionJNI.btQuantizedBvhFloatData_bvhAabbMin_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setBvhAabbMax(btVector3FloatData value) {
    CollisionJNI.btQuantizedBvhFloatData_bvhAabbMax_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getBvhAabbMax() {
    long cPtr = CollisionJNI.btQuantizedBvhFloatData_bvhAabbMax_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setBvhQuantization(btVector3FloatData value) {
    CollisionJNI.btQuantizedBvhFloatData_bvhQuantization_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getBvhQuantization() {
    long cPtr = CollisionJNI.btQuantizedBvhFloatData_bvhQuantization_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setCurNodeIndex(int value) {
    CollisionJNI.btQuantizedBvhFloatData_curNodeIndex_set(swigCPtr, this, value);
  }

  public int getCurNodeIndex() {
    return CollisionJNI.btQuantizedBvhFloatData_curNodeIndex_get(swigCPtr, this);
  }

  public void setUseQuantization(int value) {
    CollisionJNI.btQuantizedBvhFloatData_useQuantization_set(swigCPtr, this, value);
  }

  public int getUseQuantization() {
    return CollisionJNI.btQuantizedBvhFloatData_useQuantization_get(swigCPtr, this);
  }

  public void setNumContiguousLeafNodes(int value) {
    CollisionJNI.btQuantizedBvhFloatData_numContiguousLeafNodes_set(swigCPtr, this, value);
  }

  public int getNumContiguousLeafNodes() {
    return CollisionJNI.btQuantizedBvhFloatData_numContiguousLeafNodes_get(swigCPtr, this);
  }

  public void setNumQuantizedContiguousNodes(int value) {
    CollisionJNI.btQuantizedBvhFloatData_numQuantizedContiguousNodes_set(swigCPtr, this, value);
  }

  public int getNumQuantizedContiguousNodes() {
    return CollisionJNI.btQuantizedBvhFloatData_numQuantizedContiguousNodes_get(swigCPtr, this);
  }

  public void setContiguousNodesPtr(btOptimizedBvhNodeFloatData value) {
    CollisionJNI.btQuantizedBvhFloatData_contiguousNodesPtr_set(swigCPtr, this, btOptimizedBvhNodeFloatData.getCPtr(value), value);
  }

  public btOptimizedBvhNodeFloatData getContiguousNodesPtr() {
    long cPtr = CollisionJNI.btQuantizedBvhFloatData_contiguousNodesPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btOptimizedBvhNodeFloatData(cPtr, false);
  }

  public void setQuantizedContiguousNodesPtr(btQuantizedBvhNodeData value) {
    CollisionJNI.btQuantizedBvhFloatData_quantizedContiguousNodesPtr_set(swigCPtr, this, btQuantizedBvhNodeData.getCPtr(value), value);
  }

  public btQuantizedBvhNodeData getQuantizedContiguousNodesPtr() {
    long cPtr = CollisionJNI.btQuantizedBvhFloatData_quantizedContiguousNodesPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btQuantizedBvhNodeData(cPtr, false);
  }

  public void setSubTreeInfoPtr(btBvhSubtreeInfoData value) {
    CollisionJNI.btQuantizedBvhFloatData_subTreeInfoPtr_set(swigCPtr, this, btBvhSubtreeInfoData.getCPtr(value), value);
  }

  public btBvhSubtreeInfoData getSubTreeInfoPtr() {
    long cPtr = CollisionJNI.btQuantizedBvhFloatData_subTreeInfoPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btBvhSubtreeInfoData(cPtr, false);
  }

  public void setTraversalMode(int value) {
    CollisionJNI.btQuantizedBvhFloatData_traversalMode_set(swigCPtr, this, value);
  }

  public int getTraversalMode() {
    return CollisionJNI.btQuantizedBvhFloatData_traversalMode_get(swigCPtr, this);
  }

  public void setNumSubtreeHeaders(int value) {
    CollisionJNI.btQuantizedBvhFloatData_numSubtreeHeaders_set(swigCPtr, this, value);
  }

  public int getNumSubtreeHeaders() {
    return CollisionJNI.btQuantizedBvhFloatData_numSubtreeHeaders_get(swigCPtr, this);
  }

  public btQuantizedBvhFloatData() {
    this(CollisionJNI.new_btQuantizedBvhFloatData(), true);
  }

}
