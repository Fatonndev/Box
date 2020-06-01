/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.obvilion.box.physics.bullet.extras;

import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.physics.bullet.linearmath.*;
import ru.obvilion.box.physics.bullet.collision.*;
import ru.obvilion.box.physics.bullet.dynamics.*;
import ru.obvilion.box.physics.bullet.inversedynamics.MultiBodyTree;
import ru.obvilion.box.physics.bullet.dynamics.btDynamicsWorld;
import ru.obvilion.box.physics.bullet.dynamics.btContactSolverInfo;
import ru.obvilion.box.physics.bullet.collision.btCollisionShape;

public class CoilCreator extends MultiBodyTreeCreator {
	private long swigCPtr;
	
	protected CoilCreator(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, ExtrasJNI.CoilCreator_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new CoilCreator, normally you should not need this constructor it's intended for low-level usage. */
	public CoilCreator(long cPtr, boolean cMemoryOwn) {
		this("CoilCreator", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(ExtrasJNI.CoilCreator_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(CoilCreator obj) {
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
				ExtrasJNI.delete_CoilCreator(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public CoilCreator(int n) {
    this(ExtrasJNI.new_CoilCreator(n), true);
  }

}
