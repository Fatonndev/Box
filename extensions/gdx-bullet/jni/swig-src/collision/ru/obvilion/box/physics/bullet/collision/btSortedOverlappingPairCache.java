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

public class btSortedOverlappingPairCache extends btOverlappingPairCache {
	private long swigCPtr;
	
	protected btSortedOverlappingPairCache(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btSortedOverlappingPairCache_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSortedOverlappingPairCache, normally you should not need this constructor it's intended for low-level usage. */
	public btSortedOverlappingPairCache(long cPtr, boolean cMemoryOwn) {
		this("btSortedOverlappingPairCache", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btSortedOverlappingPairCache_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btSortedOverlappingPairCache obj) {
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
				CollisionJNI.delete_btSortedOverlappingPairCache(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btSortedOverlappingPairCache() {
    this(CollisionJNI.new_btSortedOverlappingPairCache(), true);
  }

  public boolean needsBroadphaseCollision(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
    return CollisionJNI.btSortedOverlappingPairCache_needsBroadphaseCollision(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1);
  }

  public btBroadphasePairArray getOverlappingPairArrayConst() {
    return new btBroadphasePairArray(CollisionJNI.btSortedOverlappingPairCache_getOverlappingPairArrayConst(swigCPtr, this), false);
  }

  public btOverlapFilterCallback getOverlapFilterCallback() {
    long cPtr = CollisionJNI.btSortedOverlappingPairCache_getOverlapFilterCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new btOverlapFilterCallback(cPtr, false);
  }

}
