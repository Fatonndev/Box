/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btDefaultMotionState extends btMotionState {
	private long swigCPtr;
	
	protected btDefaultMotionState(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, LinearMathJNI.btDefaultMotionState_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDefaultMotionState, normally you should not need this constructor it's intended for low-level usage. */
	public btDefaultMotionState(long cPtr, boolean cMemoryOwn) {
		this("btDefaultMotionState", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(LinearMathJNI.btDefaultMotionState_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btDefaultMotionState obj) {
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
				LinearMathJNI.delete_btDefaultMotionState(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setGraphicsWorldTrans(btTransform value) {
    LinearMathJNI.btDefaultMotionState_graphicsWorldTrans_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getGraphicsWorldTrans() {
    long cPtr = LinearMathJNI.btDefaultMotionState_graphicsWorldTrans_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setCenterOfMassOffset(btTransform value) {
    LinearMathJNI.btDefaultMotionState_centerOfMassOffset_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getCenterOfMassOffset() {
    long cPtr = LinearMathJNI.btDefaultMotionState_centerOfMassOffset_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setStartWorldTrans(btTransform value) {
    LinearMathJNI.btDefaultMotionState_startWorldTrans_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getStartWorldTrans() {
    long cPtr = LinearMathJNI.btDefaultMotionState_startWorldTrans_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setUserPointer(long value) {
    LinearMathJNI.btDefaultMotionState_userPointer_set(swigCPtr, this, value);
  }

  public long getUserPointer() {
    return LinearMathJNI.btDefaultMotionState_userPointer_get(swigCPtr, this);
  }

  public long operatorNew(long sizeInBytes) {
    return LinearMathJNI.btDefaultMotionState_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    LinearMathJNI.btDefaultMotionState_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return LinearMathJNI.btDefaultMotionState_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    LinearMathJNI.btDefaultMotionState_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return LinearMathJNI.btDefaultMotionState_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    LinearMathJNI.btDefaultMotionState_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return LinearMathJNI.btDefaultMotionState_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    LinearMathJNI.btDefaultMotionState_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public btDefaultMotionState(Matrix4 startTrans, Matrix4 centerOfMassOffset) {
    this(LinearMathJNI.new_btDefaultMotionState__SWIG_0(startTrans, centerOfMassOffset), true);
  }

  public btDefaultMotionState(Matrix4 startTrans) {
    this(LinearMathJNI.new_btDefaultMotionState__SWIG_1(startTrans), true);
  }

  public btDefaultMotionState() {
    this(LinearMathJNI.new_btDefaultMotionState__SWIG_2(), true);
  }

  public void getGraphicsWorldTrans(Matrix4 out) {
    LinearMathJNI.btDefaultMotionState_getGraphicsWorldTrans(swigCPtr, this, out);
  }

  public void getCenterOfMassOffset(Matrix4 out) {
    LinearMathJNI.btDefaultMotionState_getCenterOfMassOffset(swigCPtr, this, out);
  }

  public void getStartWorldTrans(Matrix4 out) {
    LinearMathJNI.btDefaultMotionState_getStartWorldTrans(swigCPtr, this, out);
  }

}
