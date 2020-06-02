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

public class btCompoundShapeChild extends BulletBase {
	private long swigCPtr;
	
	protected btCompoundShapeChild(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCompoundShapeChild, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCompoundShapeChild(long cPtr, boolean cMemoryOwn) {
		this("btCompoundShapeChild", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCompoundShapeChild obj) {
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
				CollisionJNI.delete_btCompoundShapeChild(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return CollisionJNI.btCompoundShapeChild_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    CollisionJNI.btCompoundShapeChild_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return CollisionJNI.btCompoundShapeChild_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    CollisionJNI.btCompoundShapeChild_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return CollisionJNI.btCompoundShapeChild_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    CollisionJNI.btCompoundShapeChild_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return CollisionJNI.btCompoundShapeChild_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    CollisionJNI.btCompoundShapeChild_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public void setTransform(btTransform value) {
    CollisionJNI.btCompoundShapeChild_transform_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getTransform() {
    long cPtr = CollisionJNI.btCompoundShapeChild_transform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setChildShape(btCollisionShape value) {
    CollisionJNI.btCompoundShapeChild_childShape_set(swigCPtr, this, btCollisionShape.getCPtr(value), value);
  }

  public btCollisionShape getChildShape() {
    long cPtr = CollisionJNI.btCompoundShapeChild_childShape_get(swigCPtr, this);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public void setChildShapeType(int value) {
    CollisionJNI.btCompoundShapeChild_childShapeType_set(swigCPtr, this, value);
  }

  public int getChildShapeType() {
    return CollisionJNI.btCompoundShapeChild_childShapeType_get(swigCPtr, this);
  }

  public void setChildMargin(float value) {
    CollisionJNI.btCompoundShapeChild_childMargin_set(swigCPtr, this, value);
  }

  public float getChildMargin() {
    return CollisionJNI.btCompoundShapeChild_childMargin_get(swigCPtr, this);
  }

  public void setNode(btDbvtNode value) {
    CollisionJNI.btCompoundShapeChild_node_set(swigCPtr, this, btDbvtNode.getCPtr(value), value);
  }

  public btDbvtNode getNode() {
	return btDbvtNode.internalTemp(CollisionJNI.btCompoundShapeChild_node_get(swigCPtr, this), false);
}

  public btCompoundShapeChild() {
    this(CollisionJNI.new_btCompoundShapeChild(), true);
  }

}
