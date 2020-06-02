/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.collision.*;

public class btDiscreteDynamicsWorldMt extends btDiscreteDynamicsWorld {
	private long swigCPtr;
	
	protected btDiscreteDynamicsWorldMt(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btDiscreteDynamicsWorldMt_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDiscreteDynamicsWorldMt, normally you should not need this constructor it's intended for low-level usage. */
	public btDiscreteDynamicsWorldMt(long cPtr, boolean cMemoryOwn) {
		this("btDiscreteDynamicsWorldMt", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btDiscreteDynamicsWorldMt_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btDiscreteDynamicsWorldMt obj) {
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
				DynamicsJNI.delete_btDiscreteDynamicsWorldMt(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return DynamicsJNI.btDiscreteDynamicsWorldMt_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    DynamicsJNI.btDiscreteDynamicsWorldMt_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return DynamicsJNI.btDiscreteDynamicsWorldMt_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    DynamicsJNI.btDiscreteDynamicsWorldMt_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return DynamicsJNI.btDiscreteDynamicsWorldMt_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    DynamicsJNI.btDiscreteDynamicsWorldMt_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return DynamicsJNI.btDiscreteDynamicsWorldMt_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    DynamicsJNI.btDiscreteDynamicsWorldMt_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public btDiscreteDynamicsWorldMt(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolverPoolMt constraintSolver, btCollisionConfiguration collisionConfiguration) {
    this(DynamicsJNI.new_btDiscreteDynamicsWorldMt(btDispatcher.getCPtr(dispatcher), dispatcher, btBroadphaseInterface.getCPtr(pairCache), pairCache, btConstraintSolverPoolMt.getCPtr(constraintSolver), constraintSolver, btCollisionConfiguration.getCPtr(collisionConfiguration), collisionConfiguration), true);
  }

}
