/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.collision.*;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btSoftClusterCollisionShape extends btConvexInternalShape {
	private long swigCPtr;
	
	protected btSoftClusterCollisionShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, SoftbodyJNI.btSoftClusterCollisionShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSoftClusterCollisionShape, normally you should not need this constructor it's intended for low-level usage. */
	public btSoftClusterCollisionShape(long cPtr, boolean cMemoryOwn) {
		this("btSoftClusterCollisionShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(SoftbodyJNI.btSoftClusterCollisionShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btSoftClusterCollisionShape obj) {
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
				SoftbodyJNI.delete_btSoftClusterCollisionShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setCluster(btSoftBody.Cluster value) {
    SoftbodyJNI.btSoftClusterCollisionShape_cluster_set(swigCPtr, this, btSoftBody.Cluster.getCPtr(value), value);
  }

  public btSoftBody.Cluster getCluster() {
    long cPtr = SoftbodyJNI.btSoftClusterCollisionShape_cluster_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btSoftBody.Cluster(cPtr, false);
  }

  public btSoftClusterCollisionShape(btSoftBody.Cluster cluster) {
    this(SoftbodyJNI.new_btSoftClusterCollisionShape(btSoftBody.Cluster.getCPtr(cluster), cluster), true);
  }

  public int getShapeType() {
    return SoftbodyJNI.btSoftClusterCollisionShape_getShapeType(swigCPtr, this);
  }

}
