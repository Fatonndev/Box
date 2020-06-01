/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.obvilion.box.physics.bullet.softbody;

import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.physics.bullet.linearmath.*;
import ru.obvilion.box.physics.bullet.collision.*;
import ru.obvilion.box.physics.bullet.dynamics.*;

public class btTriIndex extends BulletBase {
	private long swigCPtr;
	
	protected btTriIndex(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTriIndex, normally you should not need this constructor it's intended for low-level usage. */ 
	public btTriIndex(long cPtr, boolean cMemoryOwn) {
		this("btTriIndex", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btTriIndex obj) {
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
				SoftbodyJNI.delete_btTriIndex(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setPartIdTriangleIndex(int value) {
    SoftbodyJNI.btTriIndex_PartIdTriangleIndex_set(swigCPtr, this, value);
  }

  public int getPartIdTriangleIndex() {
    return SoftbodyJNI.btTriIndex_PartIdTriangleIndex_get(swigCPtr, this);
  }

  public void setChildShape(btCollisionShape value) {
    SoftbodyJNI.btTriIndex_childShape_set(swigCPtr, this, btCollisionShape.getCPtr(value), value);
  }

  public btCollisionShape getChildShape() {
    long cPtr = SoftbodyJNI.btTriIndex_childShape_get(swigCPtr, this);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btTriIndex(int partId, int triangleIndex, btCollisionShape shape) {
    this(SoftbodyJNI.new_btTriIndex(partId, triangleIndex, btCollisionShape.getCPtr(shape), shape), true);
  }

  public int getTriangleIndex() {
    return SoftbodyJNI.btTriIndex_getTriangleIndex(swigCPtr, this);
  }

  public int getPartId() {
    return SoftbodyJNI.btTriIndex_getPartId(swigCPtr, this);
  }

  public int getUid() {
    return SoftbodyJNI.btTriIndex_getUid(swigCPtr, this);
  }

}
