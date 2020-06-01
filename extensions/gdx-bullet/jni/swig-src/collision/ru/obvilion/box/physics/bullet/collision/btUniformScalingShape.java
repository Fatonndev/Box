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

public class btUniformScalingShape extends btConvexShape {
	private long swigCPtr;
	
	protected btUniformScalingShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btUniformScalingShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btUniformScalingShape, normally you should not need this constructor it's intended for low-level usage. */
	public btUniformScalingShape(long cPtr, boolean cMemoryOwn) {
		this("btUniformScalingShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btUniformScalingShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btUniformScalingShape obj) {
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
				CollisionJNI.delete_btUniformScalingShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return CollisionJNI.btUniformScalingShape_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    CollisionJNI.btUniformScalingShape_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return CollisionJNI.btUniformScalingShape_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    CollisionJNI.btUniformScalingShape_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return CollisionJNI.btUniformScalingShape_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    CollisionJNI.btUniformScalingShape_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return CollisionJNI.btUniformScalingShape_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    CollisionJNI.btUniformScalingShape_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public btUniformScalingShape(btConvexShape convexChildShape, float uniformScalingFactor) {
    this(CollisionJNI.new_btUniformScalingShape(btConvexShape.getCPtr(convexChildShape), convexChildShape, uniformScalingFactor), true);
  }

  public float getUniformScalingFactor() {
    return CollisionJNI.btUniformScalingShape_getUniformScalingFactor(swigCPtr, this);
  }

  public btConvexShape getChildShape() {
    long cPtr = CollisionJNI.btUniformScalingShape_getChildShape(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexShape(cPtr, false);
  }

  public btConvexShape getChildShapeConst() {
    long cPtr = CollisionJNI.btUniformScalingShape_getChildShapeConst(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexShape(cPtr, false);
  }

}
