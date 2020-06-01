/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.obvilion.box.physics.bullet.dynamics;

import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.physics.bullet.linearmath.*;
import ru.obvilion.box.physics.bullet.collision.*;

public class btConstraintSolverPoolMt extends btConstraintSolver {
	private long swigCPtr;
	
	protected btConstraintSolverPoolMt(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btConstraintSolverPoolMt_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConstraintSolverPoolMt, normally you should not need this constructor it's intended for low-level usage. */
	public btConstraintSolverPoolMt(long cPtr, boolean cMemoryOwn) {
		this("btConstraintSolverPoolMt", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btConstraintSolverPoolMt_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btConstraintSolverPoolMt obj) {
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
				DynamicsJNI.delete_btConstraintSolverPoolMt(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btConstraintSolverPoolMt(int numSolvers) {
    this(DynamicsJNI.new_btConstraintSolverPoolMt__SWIG_0(numSolvers), true);
  }

  public btConstraintSolverPoolMt(SWIGTYPE_p_p_btConstraintSolver solvers, int numSolvers) {
    this(DynamicsJNI.new_btConstraintSolverPoolMt__SWIG_1(SWIGTYPE_p_p_btConstraintSolver.getCPtr(solvers), numSolvers), true);
  }

}
