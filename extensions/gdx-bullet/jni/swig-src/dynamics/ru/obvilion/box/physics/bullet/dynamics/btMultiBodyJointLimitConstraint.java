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

public class btMultiBodyJointLimitConstraint extends btMultiBodyConstraint {
	private long swigCPtr;
	
	protected btMultiBodyJointLimitConstraint(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btMultiBodyJointLimitConstraint_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btMultiBodyJointLimitConstraint, normally you should not need this constructor it's intended for low-level usage. */
	public btMultiBodyJointLimitConstraint(long cPtr, boolean cMemoryOwn) {
		this("btMultiBodyJointLimitConstraint", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btMultiBodyJointLimitConstraint_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btMultiBodyJointLimitConstraint obj) {
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
				DynamicsJNI.delete_btMultiBodyJointLimitConstraint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btMultiBodyJointLimitConstraint(btMultiBody body, int link, float lower, float upper) {
    this(DynamicsJNI.new_btMultiBodyJointLimitConstraint(btMultiBody.getCPtr(body), body, link, lower, upper), true);
  }

}
