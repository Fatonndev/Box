/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btCollisionObjectArray extends BulletBase {
	private long swigCPtr;
	
	protected btCollisionObjectArray(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCollisionObjectArray, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCollisionObjectArray(long cPtr, boolean cMemoryOwn) {
		this("btCollisionObjectArray", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCollisionObjectArray obj) {
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
				CollisionJNI.delete_btCollisionObjectArray(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btCollisionObjectArray operatorAssignment(btCollisionObjectArray other) {
    return new btCollisionObjectArray(CollisionJNI.btCollisionObjectArray_operatorAssignment(swigCPtr, this, btCollisionObjectArray.getCPtr(other), other), false);
  }

  public btCollisionObjectArray() {
    this(CollisionJNI.new_btCollisionObjectArray__SWIG_0(), true);
  }

  public btCollisionObjectArray(btCollisionObjectArray otherArray) {
    this(CollisionJNI.new_btCollisionObjectArray__SWIG_1(btCollisionObjectArray.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return CollisionJNI.btCollisionObjectArray_size(swigCPtr, this);
  }

  public btCollisionObject atConst(int n) {
	return btCollisionObject.getInstance(CollisionJNI.btCollisionObjectArray_atConst(swigCPtr, this, n), false);
}

  public SWIGTYPE_p_p_btCollisionObject at(int n) {
    return new SWIGTYPE_p_p_btCollisionObject(CollisionJNI.btCollisionObjectArray_at(swigCPtr, this, n), false);
  }

  public btCollisionObject operatorSubscriptConst(int n) {
	return btCollisionObject.getInstance(CollisionJNI.btCollisionObjectArray_operatorSubscriptConst(swigCPtr, this, n), false);
}

  public SWIGTYPE_p_p_btCollisionObject operatorSubscript(int n) {
    return new SWIGTYPE_p_p_btCollisionObject(CollisionJNI.btCollisionObjectArray_operatorSubscript(swigCPtr, this, n), false);
  }

  public void clear() {
    CollisionJNI.btCollisionObjectArray_clear(swigCPtr, this);
  }

  public void pop_back() {
    CollisionJNI.btCollisionObjectArray_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    CollisionJNI.btCollisionObjectArray_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, btCollisionObject fillData) {
    CollisionJNI.btCollisionObjectArray_resize__SWIG_0(swigCPtr, this, newsize, btCollisionObject.getCPtr(fillData), fillData);
  }

  public void resize(int newsize) {
    CollisionJNI.btCollisionObjectArray_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public SWIGTYPE_p_p_btCollisionObject expandNonInitializing() {
    return new SWIGTYPE_p_p_btCollisionObject(CollisionJNI.btCollisionObjectArray_expandNonInitializing(swigCPtr, this), false);
  }

  public SWIGTYPE_p_p_btCollisionObject expand(btCollisionObject fillValue) {
    return new SWIGTYPE_p_p_btCollisionObject(CollisionJNI.btCollisionObjectArray_expand__SWIG_0(swigCPtr, this, btCollisionObject.getCPtr(fillValue), fillValue), false);
  }

  public SWIGTYPE_p_p_btCollisionObject expand() {
    return new SWIGTYPE_p_p_btCollisionObject(CollisionJNI.btCollisionObjectArray_expand__SWIG_1(swigCPtr, this), false);
  }

  public void push_back(btCollisionObject _Val) {
    CollisionJNI.btCollisionObjectArray_push_back(swigCPtr, this, btCollisionObject.getCPtr(_Val), _Val);
  }

  public int capacity() {
    return CollisionJNI.btCollisionObjectArray_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    CollisionJNI.btCollisionObjectArray_reserve(swigCPtr, this, _Count);
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
  				CollisionJNI.delete_btCollisionObjectArray_less(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public boolean operatorFunctionCall(btCollisionObject a, btCollisionObject b) {
      return CollisionJNI.btCollisionObjectArray_less_operatorFunctionCall(swigCPtr, this, btCollisionObject.getCPtr(a), a, btCollisionObject.getCPtr(b), b);
    }
  
    public less() {
      this(CollisionJNI.new_btCollisionObjectArray_less(), true);
    }
  
  }

  public void swap(int index0, int index1) {
    CollisionJNI.btCollisionObjectArray_swap(swigCPtr, this, index0, index1);
  }

  public int findBinarySearch(btCollisionObject key) {
    return CollisionJNI.btCollisionObjectArray_findBinarySearch(swigCPtr, this, btCollisionObject.getCPtr(key), key);
  }

  public int findLinearSearch(btCollisionObject key) {
    return CollisionJNI.btCollisionObjectArray_findLinearSearch(swigCPtr, this, btCollisionObject.getCPtr(key), key);
  }

  public int findLinearSearch2(btCollisionObject key) {
    return CollisionJNI.btCollisionObjectArray_findLinearSearch2(swigCPtr, this, btCollisionObject.getCPtr(key), key);
  }

  public void removeAtIndex(int index) {
    CollisionJNI.btCollisionObjectArray_removeAtIndex(swigCPtr, this, index);
  }

  public void remove(btCollisionObject key) {
    CollisionJNI.btCollisionObjectArray_remove(swigCPtr, this, btCollisionObject.getCPtr(key), key);
  }

  public void initializeFromBuffer(long buffer, int size, int capacity) {
    CollisionJNI.btCollisionObjectArray_initializeFromBuffer(swigCPtr, this, buffer, size, capacity);
  }

  public void copyFromArray(btCollisionObjectArray otherArray) {
    CollisionJNI.btCollisionObjectArray_copyFromArray(swigCPtr, this, btCollisionObjectArray.getCPtr(otherArray), otherArray);
  }

}
