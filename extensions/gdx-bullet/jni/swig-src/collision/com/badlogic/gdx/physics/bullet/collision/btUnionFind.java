/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import ru.obvilion.box.physics.bullet.BulletBase;

public class btUnionFind extends BulletBase {
	private long swigCPtr;
	
	protected btUnionFind(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btUnionFind, normally you should not need this constructor it's intended for low-level usage. */ 
	public btUnionFind(long cPtr, boolean cMemoryOwn) {
		this("btUnionFind", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btUnionFind obj) {
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
				CollisionJNI.delete_btUnionFind(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btUnionFind() {
    this(CollisionJNI.new_btUnionFind(), true);
  }

  public void sortIslands() {
    CollisionJNI.btUnionFind_sortIslands(swigCPtr, this);
  }

  public void reset(int N) {
    CollisionJNI.btUnionFind_reset(swigCPtr, this, N);
  }

  public int getNumElements() {
    return CollisionJNI.btUnionFind_getNumElements(swigCPtr, this);
  }

  public boolean isRoot(int x) {
    return CollisionJNI.btUnionFind_isRoot(swigCPtr, this, x);
  }

  public btElement getElement(int index) {
    return new btElement(CollisionJNI.btUnionFind_getElement(swigCPtr, this, index), false);
  }

  public btElement getElementConst(int index) {
    return new btElement(CollisionJNI.btUnionFind_getElementConst(swigCPtr, this, index), false);
  }

  public void allocate(int N) {
    CollisionJNI.btUnionFind_allocate(swigCPtr, this, N);
  }

  public void Free() {
    CollisionJNI.btUnionFind_Free(swigCPtr, this);
  }

  public int find(int p, int q) {
    return CollisionJNI.btUnionFind_find__SWIG_0(swigCPtr, this, p, q);
  }

  public void unite(int p, int q) {
    CollisionJNI.btUnionFind_unite(swigCPtr, this, p, q);
  }

  public int find(int x) {
    return CollisionJNI.btUnionFind_find__SWIG_1(swigCPtr, this, x);
  }

}
