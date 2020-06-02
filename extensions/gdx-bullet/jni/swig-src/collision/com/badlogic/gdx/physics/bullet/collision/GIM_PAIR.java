/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import ru.obvilion.box.physics.bullet.BulletBase;

public class GIM_PAIR extends BulletBase {
	private long swigCPtr;
	
	protected GIM_PAIR(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new GIM_PAIR, normally you should not need this constructor it's intended for low-level usage. */ 
	public GIM_PAIR(long cPtr, boolean cMemoryOwn) {
		this("GIM_PAIR", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(GIM_PAIR obj) {
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
				CollisionJNI.delete_GIM_PAIR(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setIndex1(int value) {
    CollisionJNI.GIM_PAIR_index1_set(swigCPtr, this, value);
  }

  public int getIndex1() {
    return CollisionJNI.GIM_PAIR_index1_get(swigCPtr, this);
  }

  public void setIndex2(int value) {
    CollisionJNI.GIM_PAIR_index2_set(swigCPtr, this, value);
  }

  public int getIndex2() {
    return CollisionJNI.GIM_PAIR_index2_get(swigCPtr, this);
  }

  public GIM_PAIR() {
    this(CollisionJNI.new_GIM_PAIR__SWIG_0(), true);
  }

  public GIM_PAIR(GIM_PAIR p) {
    this(CollisionJNI.new_GIM_PAIR__SWIG_1(GIM_PAIR.getCPtr(p), p), true);
  }

  public GIM_PAIR(int index1, int index2) {
    this(CollisionJNI.new_GIM_PAIR__SWIG_2(index1, index2), true);
  }

}
