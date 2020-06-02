/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btGenericPoolAllocator extends BulletBase {
	private long swigCPtr;
	
	protected btGenericPoolAllocator(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGenericPoolAllocator, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGenericPoolAllocator(long cPtr, boolean cMemoryOwn) {
		this("btGenericPoolAllocator", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGenericPoolAllocator obj) {
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
				CollisionJNI.delete_btGenericPoolAllocator(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setPools(SWIGTYPE_p_p_btGenericMemoryPool value) {
    CollisionJNI.btGenericPoolAllocator_pools_set(swigCPtr, this, SWIGTYPE_p_p_btGenericMemoryPool.getCPtr(value));
  }

  public SWIGTYPE_p_p_btGenericMemoryPool getPools() {
    long cPtr = CollisionJNI.btGenericPoolAllocator_pools_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_btGenericMemoryPool(cPtr, false);
  }

  public void setPool_count(long value) {
    CollisionJNI.btGenericPoolAllocator_pool_count_set(swigCPtr, this, value);
  }

  public long getPool_count() {
    return CollisionJNI.btGenericPoolAllocator_pool_count_get(swigCPtr, this);
  }

  public long get_pool_capacity() {
    return CollisionJNI.btGenericPoolAllocator_get_pool_capacity(swigCPtr, this);
  }

  public btGenericPoolAllocator(long pool_element_size, long pool_element_count) {
    this(CollisionJNI.new_btGenericPoolAllocator(pool_element_size, pool_element_count), true);
  }

  public long allocate(long size_bytes) {
    return CollisionJNI.btGenericPoolAllocator_allocate(swigCPtr, this, size_bytes);
  }

  public boolean freeMemory(long pointer) {
    return CollisionJNI.btGenericPoolAllocator_freeMemory(swigCPtr, this, pointer);
  }

}
