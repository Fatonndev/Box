/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import ru.obvilion.box.physics.bullet.BulletBase;

public class btGenericMemoryPool extends BulletBase {
	private long swigCPtr;
	
	protected btGenericMemoryPool(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGenericMemoryPool, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGenericMemoryPool(long cPtr, boolean cMemoryOwn) {
		this("btGenericMemoryPool", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGenericMemoryPool obj) {
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
				CollisionJNI.delete_btGenericMemoryPool(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setPool(java.nio.ByteBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      CollisionJNI.btGenericMemoryPool_pool_set(swigCPtr, this, value);
    }
  }

  public java.nio.ByteBuffer getPool() {
    return CollisionJNI.btGenericMemoryPool_pool_get(swigCPtr, this);
}

  public void setFree_nodes(SWIGTYPE_p_size_t value) {
    CollisionJNI.btGenericMemoryPool_free_nodes_set(swigCPtr, this, SWIGTYPE_p_size_t.getCPtr(value));
  }

  public SWIGTYPE_p_size_t getFree_nodes() {
    long cPtr = CollisionJNI.btGenericMemoryPool_free_nodes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_size_t(cPtr, false);
  }

  public void setAllocated_sizes(SWIGTYPE_p_size_t value) {
    CollisionJNI.btGenericMemoryPool_allocated_sizes_set(swigCPtr, this, SWIGTYPE_p_size_t.getCPtr(value));
  }

  public SWIGTYPE_p_size_t getAllocated_sizes() {
    long cPtr = CollisionJNI.btGenericMemoryPool_allocated_sizes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_size_t(cPtr, false);
  }

  public void setAllocated_count(long value) {
    CollisionJNI.btGenericMemoryPool_allocated_count_set(swigCPtr, this, value);
  }

  public long getAllocated_count() {
    return CollisionJNI.btGenericMemoryPool_allocated_count_get(swigCPtr, this);
  }

  public void setFree_nodes_count(long value) {
    CollisionJNI.btGenericMemoryPool_free_nodes_count_set(swigCPtr, this, value);
  }

  public long getFree_nodes_count() {
    return CollisionJNI.btGenericMemoryPool_free_nodes_count_get(swigCPtr, this);
  }

  public void init_pool(long element_size, long element_count) {
    CollisionJNI.btGenericMemoryPool_init_pool(swigCPtr, this, element_size, element_count);
  }

  public void end_pool() {
    CollisionJNI.btGenericMemoryPool_end_pool(swigCPtr, this);
  }

  public btGenericMemoryPool(long element_size, long element_count) {
    this(CollisionJNI.new_btGenericMemoryPool(element_size, element_count), true);
  }

  public long get_pool_capacity() {
    return CollisionJNI.btGenericMemoryPool_get_pool_capacity(swigCPtr, this);
  }

  public long gem_element_size() {
    return CollisionJNI.btGenericMemoryPool_gem_element_size(swigCPtr, this);
  }

  public long get_max_element_count() {
    return CollisionJNI.btGenericMemoryPool_get_max_element_count(swigCPtr, this);
  }

  public long get_allocated_count() {
    return CollisionJNI.btGenericMemoryPool_get_allocated_count(swigCPtr, this);
  }

  public long get_free_positions_count() {
    return CollisionJNI.btGenericMemoryPool_get_free_positions_count(swigCPtr, this);
  }

  public long get_element_data(long element_index) {
    return CollisionJNI.btGenericMemoryPool_get_element_data(swigCPtr, this, element_index);
  }

  public long allocate(long size_bytes) {
    return CollisionJNI.btGenericMemoryPool_allocate(swigCPtr, this, size_bytes);
  }

  public boolean freeMemory(long pointer) {
    return CollisionJNI.btGenericMemoryPool_freeMemory(swigCPtr, this, pointer);
  }

}
