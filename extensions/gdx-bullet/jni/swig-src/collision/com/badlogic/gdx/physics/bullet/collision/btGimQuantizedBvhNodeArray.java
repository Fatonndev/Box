/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btGimQuantizedBvhNodeArray extends BulletBase {
	private long swigCPtr;
	
	protected btGimQuantizedBvhNodeArray(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGimQuantizedBvhNodeArray, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGimQuantizedBvhNodeArray(long cPtr, boolean cMemoryOwn) {
		this("btGimQuantizedBvhNodeArray", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGimQuantizedBvhNodeArray obj) {
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
				CollisionJNI.delete_btGimQuantizedBvhNodeArray(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btGimQuantizedBvhNodeArray operatorAssignment(btGimQuantizedBvhNodeArray other) {
    return new btGimQuantizedBvhNodeArray(CollisionJNI.btGimQuantizedBvhNodeArray_operatorAssignment(swigCPtr, this, btGimQuantizedBvhNodeArray.getCPtr(other), other), false);
  }

  public btGimQuantizedBvhNodeArray() {
    this(CollisionJNI.new_btGimQuantizedBvhNodeArray__SWIG_0(), true);
  }

  public btGimQuantizedBvhNodeArray(btGimQuantizedBvhNodeArray otherArray) {
    this(CollisionJNI.new_btGimQuantizedBvhNodeArray__SWIG_1(btGimQuantizedBvhNodeArray.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return CollisionJNI.btGimQuantizedBvhNodeArray_size(swigCPtr, this);
  }

  public BT_QUANTIZED_BVH_NODE atConst(int n) {
    return new BT_QUANTIZED_BVH_NODE(CollisionJNI.btGimQuantizedBvhNodeArray_atConst(swigCPtr, this, n), false);
  }

  public BT_QUANTIZED_BVH_NODE at(int n) {
    return new BT_QUANTIZED_BVH_NODE(CollisionJNI.btGimQuantizedBvhNodeArray_at(swigCPtr, this, n), false);
  }

  public BT_QUANTIZED_BVH_NODE operatorSubscriptConst(int n) {
    return new BT_QUANTIZED_BVH_NODE(CollisionJNI.btGimQuantizedBvhNodeArray_operatorSubscriptConst(swigCPtr, this, n), false);
  }

  public BT_QUANTIZED_BVH_NODE operatorSubscript(int n) {
    return new BT_QUANTIZED_BVH_NODE(CollisionJNI.btGimQuantizedBvhNodeArray_operatorSubscript(swigCPtr, this, n), false);
  }

  public void clear() {
    CollisionJNI.btGimQuantizedBvhNodeArray_clear(swigCPtr, this);
  }

  public void pop_back() {
    CollisionJNI.btGimQuantizedBvhNodeArray_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    CollisionJNI.btGimQuantizedBvhNodeArray_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, BT_QUANTIZED_BVH_NODE fillData) {
    CollisionJNI.btGimQuantizedBvhNodeArray_resize__SWIG_0(swigCPtr, this, newsize, BT_QUANTIZED_BVH_NODE.getCPtr(fillData), fillData);
  }

  public void resize(int newsize) {
    CollisionJNI.btGimQuantizedBvhNodeArray_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public BT_QUANTIZED_BVH_NODE expandNonInitializing() {
    return new BT_QUANTIZED_BVH_NODE(CollisionJNI.btGimQuantizedBvhNodeArray_expandNonInitializing(swigCPtr, this), false);
  }

  public BT_QUANTIZED_BVH_NODE expand(BT_QUANTIZED_BVH_NODE fillValue) {
    return new BT_QUANTIZED_BVH_NODE(CollisionJNI.btGimQuantizedBvhNodeArray_expand__SWIG_0(swigCPtr, this, BT_QUANTIZED_BVH_NODE.getCPtr(fillValue), fillValue), false);
  }

  public BT_QUANTIZED_BVH_NODE expand() {
    return new BT_QUANTIZED_BVH_NODE(CollisionJNI.btGimQuantizedBvhNodeArray_expand__SWIG_1(swigCPtr, this), false);
  }

  public void push_back(BT_QUANTIZED_BVH_NODE _Val) {
    CollisionJNI.btGimQuantizedBvhNodeArray_push_back(swigCPtr, this, BT_QUANTIZED_BVH_NODE.getCPtr(_Val), _Val);
  }

  public int capacity() {
    return CollisionJNI.btGimQuantizedBvhNodeArray_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    CollisionJNI.btGimQuantizedBvhNodeArray_reserve(swigCPtr, this, _Count);
  }

  static public class less extends BulletBase {
  	private long swigCPtr;
  	
  	protected less(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new less, normally you should not need this constructor it's intended for low-level usage. */ 
  	public less(long cPtr, boolean cMemoryOwn) {
  		this("less", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(less obj) {
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
  				CollisionJNI.delete_btGimQuantizedBvhNodeArray_less(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public less() {
      this(CollisionJNI.new_btGimQuantizedBvhNodeArray_less(), true);
    }
  
  }

  public void swap(int index0, int index1) {
    CollisionJNI.btGimQuantizedBvhNodeArray_swap(swigCPtr, this, index0, index1);
  }

  public void removeAtIndex(int index) {
    CollisionJNI.btGimQuantizedBvhNodeArray_removeAtIndex(swigCPtr, this, index);
  }

  public void initializeFromBuffer(long buffer, int size, int capacity) {
    CollisionJNI.btGimQuantizedBvhNodeArray_initializeFromBuffer(swigCPtr, this, buffer, size, capacity);
  }

  public void copyFromArray(btGimQuantizedBvhNodeArray otherArray) {
    CollisionJNI.btGimQuantizedBvhNodeArray_copyFromArray(swigCPtr, this, btGimQuantizedBvhNodeArray.getCPtr(otherArray), otherArray);
  }

}
