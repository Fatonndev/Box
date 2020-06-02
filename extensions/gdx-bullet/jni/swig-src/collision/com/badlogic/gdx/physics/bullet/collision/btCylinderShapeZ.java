/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btCylinderShapeZ extends btCylinderShape {
	private long swigCPtr;
	
	protected btCylinderShapeZ(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btCylinderShapeZ_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCylinderShapeZ, normally you should not need this constructor it's intended for low-level usage. */
	public btCylinderShapeZ(long cPtr, boolean cMemoryOwn) {
		this("btCylinderShapeZ", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btCylinderShapeZ_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btCylinderShapeZ obj) {
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
				CollisionJNI.delete_btCylinderShapeZ(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return CollisionJNI.btCylinderShapeZ_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    CollisionJNI.btCylinderShapeZ_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return CollisionJNI.btCylinderShapeZ_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    CollisionJNI.btCylinderShapeZ_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return CollisionJNI.btCylinderShapeZ_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    CollisionJNI.btCylinderShapeZ_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return CollisionJNI.btCylinderShapeZ_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    CollisionJNI.btCylinderShapeZ_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public btCylinderShapeZ(Vector3 halfExtents) {
    this(CollisionJNI.new_btCylinderShapeZ(halfExtents), true);
  }

}
