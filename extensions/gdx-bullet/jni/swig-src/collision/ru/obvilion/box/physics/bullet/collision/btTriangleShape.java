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
import ru.obvilion.box.math.Vector3;

public class btTriangleShape extends btPolyhedralConvexShape {
	private long swigCPtr;
	
	protected btTriangleShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btTriangleShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTriangleShape, normally you should not need this constructor it's intended for low-level usage. */
	public btTriangleShape(long cPtr, boolean cMemoryOwn) {
		this("btTriangleShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btTriangleShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btTriangleShape obj) {
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
				CollisionJNI.delete_btTriangleShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return CollisionJNI.btTriangleShape_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    CollisionJNI.btTriangleShape_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return CollisionJNI.btTriangleShape_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    CollisionJNI.btTriangleShape_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return CollisionJNI.btTriangleShape_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    CollisionJNI.btTriangleShape_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return CollisionJNI.btTriangleShape_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    CollisionJNI.btTriangleShape_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public void setVertices1(btVector3 value) {
    CollisionJNI.btTriangleShape_vertices1_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getVertices1() {
    long cPtr = CollisionJNI.btTriangleShape_vertices1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public Vector3 getVertexPtr(int index) {
	return CollisionJNI.btTriangleShape_getVertexPtr(swigCPtr, this, index);
}

  public Vector3 getVertexPtrConst(int index) {
	return CollisionJNI.btTriangleShape_getVertexPtrConst(swigCPtr, this, index);
}

  public btTriangleShape() {
    this(CollisionJNI.new_btTriangleShape__SWIG_0(), true);
  }

  public btTriangleShape(Vector3 p0, Vector3 p1, Vector3 p2) {
    this(CollisionJNI.new_btTriangleShape__SWIG_1(p0, p1, p2), true);
  }

  public void calcNormal(Vector3 normal) {
    CollisionJNI.btTriangleShape_calcNormal(swigCPtr, this, normal);
  }

  public void getPlaneEquation(int i, Vector3 planeNormal, Vector3 planeSupport) {
    CollisionJNI.btTriangleShape_getPlaneEquation(swigCPtr, this, i, planeNormal, planeSupport);
  }

}
