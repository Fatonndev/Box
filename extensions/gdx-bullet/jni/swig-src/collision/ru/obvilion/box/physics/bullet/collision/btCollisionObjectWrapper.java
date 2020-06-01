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
import ru.obvilion.box.math.Matrix4;

public class btCollisionObjectWrapper extends BulletBase {
	private long swigCPtr;
	
	protected btCollisionObjectWrapper(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCollisionObjectWrapper, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCollisionObjectWrapper(long cPtr, boolean cMemoryOwn) {
		this("btCollisionObjectWrapper", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCollisionObjectWrapper obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				throw new UnsupportedOperationException("C++ destructor does not have public access");
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	/** Temporary instance, use by native methods that return a btCollisionObjectWrapper instance */
	protected final static btCollisionObjectWrapper temp = new btCollisionObjectWrapper(0, false);
	public static btCollisionObjectWrapper internalTemp(long cPtr, boolean own) {
		temp.reset(cPtr, own);
		return temp;
	}

	private static btCollisionObjectWrapper[] argumentInstances = new btCollisionObjectWrapper[] {new btCollisionObjectWrapper(0, false),
		new btCollisionObjectWrapper(0, false), new btCollisionObjectWrapper(0, false), new btCollisionObjectWrapper(0, false)};
	private static int argumentIndex = -1;
	/** Obtains a temporary instance, used for callback methods with one or more btManifoldPoint arguments */
	protected static btCollisionObjectWrapper obtainForArgument(final long swigCPtr, boolean owner) {
		btCollisionObjectWrapper instance = argumentInstances[argumentIndex = (argumentIndex + 1) & 3];
		instance.reset(swigCPtr, owner);
		return instance;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  public void setParent(btCollisionObjectWrapper value) {
    CollisionJNI.btCollisionObjectWrapper_parent_set(swigCPtr, this, btCollisionObjectWrapper.getCPtr(value), value);
  }

  public btCollisionObjectWrapper getParent() {
	return btCollisionObjectWrapper.internalTemp(CollisionJNI.btCollisionObjectWrapper_parent_get(swigCPtr, this), false);
}

  public void setShape(btCollisionShape value) {
    CollisionJNI.btCollisionObjectWrapper_shape_set(swigCPtr, this, btCollisionShape.getCPtr(value), value);
  }

  public btCollisionShape getShape() {
    long cPtr = CollisionJNI.btCollisionObjectWrapper_shape_get(swigCPtr, this);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public void setCollisionObject(btCollisionObject value) {
    CollisionJNI.btCollisionObjectWrapper_collisionObject_set(swigCPtr, this, btCollisionObject.getCPtr(value), value);
  }

  public btCollisionObject getCollisionObject() {
	return btCollisionObject.getInstance(CollisionJNI.btCollisionObjectWrapper_collisionObject_get(swigCPtr, this), false);
}

  public Matrix4 getWorldTransform() {
	return CollisionJNI.btCollisionObjectWrapper_worldTransform_get(swigCPtr, this);
}

  public void setPartId(int value) {
    CollisionJNI.btCollisionObjectWrapper_partId_set(swigCPtr, this, value);
  }

  public int getPartId() {
    return CollisionJNI.btCollisionObjectWrapper_partId_get(swigCPtr, this);
  }

  public void setIndex(int value) {
    CollisionJNI.btCollisionObjectWrapper_index_set(swigCPtr, this, value);
  }

  public int getIndex() {
    return CollisionJNI.btCollisionObjectWrapper_index_get(swigCPtr, this);
  }

  public btCollisionShape getCollisionShape() {
    long cPtr = CollisionJNI.btCollisionObjectWrapper_getCollisionShape(swigCPtr, this);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

}
