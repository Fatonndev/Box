/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import ru.obvilion.box.math.Vector3;

public class btPlane extends BulletBase {
	private long swigCPtr;
	
	protected btPlane(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btPlane, normally you should not need this constructor it's intended for low-level usage. */ 
	public btPlane(long cPtr, boolean cMemoryOwn) {
		this("btPlane", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btPlane obj) {
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
				LinearMathJNI.delete_btPlane(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setNormal(btVector3 value) {
    LinearMathJNI.btPlane_normal_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getNormal() {
    long cPtr = LinearMathJNI.btPlane_normal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setDist(float value) {
    LinearMathJNI.btPlane_dist_set(swigCPtr, this, value);
  }

  public float getDist() {
    return LinearMathJNI.btPlane_dist_get(swigCPtr, this);
  }

  public btPlane(Vector3 n, float d) {
    this(LinearMathJNI.new_btPlane__SWIG_0(n, d), true);
  }

  public btPlane() {
    this(LinearMathJNI.new_btPlane__SWIG_1(), true);
  }

}
