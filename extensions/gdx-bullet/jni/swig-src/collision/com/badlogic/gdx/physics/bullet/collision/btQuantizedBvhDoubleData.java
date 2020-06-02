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

public class btQuantizedBvhDoubleData extends BulletBase {
	private long swigCPtr;
	
	protected btQuantizedBvhDoubleData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btQuantizedBvhDoubleData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btQuantizedBvhDoubleData(long cPtr, boolean cMemoryOwn) {
		this("btQuantizedBvhDoubleData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btQuantizedBvhDoubleData obj) {
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
				CollisionJNI.delete_btQuantizedBvhDoubleData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setBvhAabbMin(btVector3DoubleData value) {
    CollisionJNI.btQuantizedBvhDoubleData_bvhAabbMin_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getBvhAabbMin() {
    long cPtr = CollisionJNI.btQuantizedBvhDoubleData_bvhAabbMin_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setBvhAabbMax(btVector3DoubleData value) {
    CollisionJNI.btQuantizedBvhDoubleData_bvhAabbMax_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getBvhAabbMax() {
    long cPtr = CollisionJNI.btQuantizedBvhDoubleData_bvhAabbMax_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setBvhQuantization(btVector3DoubleData value) {
    CollisionJNI.btQuantizedBvhDoubleData_bvhQuantization_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getBvhQuantization() {
    long cPtr = CollisionJNI.btQuantizedBvhDoubleData_bvhQuantization_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setCurNodeIndex(int value) {
    CollisionJNI.btQuantizedBvhDoubleData_curNodeIndex_set(swigCPtr, this, value);
  }

  public int getCurNodeIndex() {
    return CollisionJNI.btQuantizedBvhDoubleData_curNodeIndex_get(swigCPtr, this);
  }

  public void setUseQuantization(int value) {
    CollisionJNI.btQuantizedBvhDoubleData_useQuantization_set(swigCPtr, this, value);
  }

  public int getUseQuantization() {
    return CollisionJNI.btQuantizedBvhDoubleData_useQuantization_get(swigCPtr, this);
  }

  public void setNumContiguousLeafNodes(int value) {
    CollisionJNI.btQuantizedBvhDoubleData_numContiguousLeafNodes_set(swigCPtr, this, value);
  }

  public int getNumContiguousLeafNodes() {
    return CollisionJNI.btQuantizedBvhDoubleData_numContiguousLeafNodes_get(swigCPtr, this);
  }

  public void setNumQuantizedContiguousNodes(int value) {
    CollisionJNI.btQuantizedBvhDoubleData_numQuantizedContiguousNodes_set(swigCPtr, this, value);
  }

  public int getNumQuantizedContiguousNodes() {
    return CollisionJNI.btQuantizedBvhDoubleData_numQuantizedContiguousNodes_get(swigCPtr, this);
  }

  public void setContiguousNodesPtr(btOptimizedBvhNodeDoubleData value) {
    CollisionJNI.btQuantizedBvhDoubleData_contiguousNodesPtr_set(swigCPtr, this, btOptimizedBvhNodeDoubleData.getCPtr(value), value);
  }

  public btOptimizedBvhNodeDoubleData getContiguousNodesPtr() {
    long cPtr = CollisionJNI.btQuantizedBvhDoubleData_contiguousNodesPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btOptimizedBvhNodeDoubleData(cPtr, false);
  }

  public void setQuantizedContiguousNodesPtr(btQuantizedBvhNodeData value) {
    CollisionJNI.btQuantizedBvhDoubleData_quantizedContiguousNodesPtr_set(swigCPtr, this, btQuantizedBvhNodeData.getCPtr(value), value);
  }

  public btQuantizedBvhNodeData getQuantizedContiguousNodesPtr() {
    long cPtr = CollisionJNI.btQuantizedBvhDoubleData_quantizedContiguousNodesPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btQuantizedBvhNodeData(cPtr, false);
  }

  public void setTraversalMode(int value) {
    CollisionJNI.btQuantizedBvhDoubleData_traversalMode_set(swigCPtr, this, value);
  }

  public int getTraversalMode() {
    return CollisionJNI.btQuantizedBvhDoubleData_traversalMode_get(swigCPtr, this);
  }

  public void setNumSubtreeHeaders(int value) {
    CollisionJNI.btQuantizedBvhDoubleData_numSubtreeHeaders_set(swigCPtr, this, value);
  }

  public int getNumSubtreeHeaders() {
    return CollisionJNI.btQuantizedBvhDoubleData_numSubtreeHeaders_get(swigCPtr, this);
  }

  public void setSubTreeInfoPtr(btBvhSubtreeInfoData value) {
    CollisionJNI.btQuantizedBvhDoubleData_subTreeInfoPtr_set(swigCPtr, this, btBvhSubtreeInfoData.getCPtr(value), value);
  }

  public btBvhSubtreeInfoData getSubTreeInfoPtr() {
    long cPtr = CollisionJNI.btQuantizedBvhDoubleData_subTreeInfoPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btBvhSubtreeInfoData(cPtr, false);
  }

  public btQuantizedBvhDoubleData() {
    this(CollisionJNI.new_btQuantizedBvhDoubleData(), true);
  }

}
