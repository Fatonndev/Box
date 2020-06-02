/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import ru.obvilion.box.physics.bullet.BulletBase;

public class btGimPairArray extends BulletBase {
	private long swigCPtr;
	
	protected btGimPairArray(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGimPairArray, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGimPairArray(long cPtr, boolean cMemoryOwn) {
		this("btGimPairArray", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGimPairArray obj) {
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
				CollisionJNI.delete_btGimPairArray(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btGimPairArray operatorAssignment(btGimPairArray other) {
    return new btGimPairArray(CollisionJNI.btGimPairArray_operatorAssignment(swigCPtr, this, btGimPairArray.getCPtr(other), other), false);
  }

  public btGimPairArray() {
    this(CollisionJNI.new_btGimPairArray__SWIG_0(), true);
  }

  public btGimPairArray(btGimPairArray otherArray) {
    this(CollisionJNI.new_btGimPairArray__SWIG_1(btGimPairArray.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return CollisionJNI.btGimPairArray_size(swigCPtr, this);
  }

  public GIM_PAIR atConst(int n) {
    return new GIM_PAIR(CollisionJNI.btGimPairArray_atConst(swigCPtr, this, n), false);
  }

  public GIM_PAIR at(int n) {
    return new GIM_PAIR(CollisionJNI.btGimPairArray_at(swigCPtr, this, n), false);
  }

  public GIM_PAIR operatorSubscriptConst(int n) {
    return new GIM_PAIR(CollisionJNI.btGimPairArray_operatorSubscriptConst(swigCPtr, this, n), false);
  }

  public GIM_PAIR operatorSubscript(int n) {
    return new GIM_PAIR(CollisionJNI.btGimPairArray_operatorSubscript(swigCPtr, this, n), false);
  }

  public void clear() {
    CollisionJNI.btGimPairArray_clear(swigCPtr, this);
  }

  public void pop_back() {
    CollisionJNI.btGimPairArray_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    CollisionJNI.btGimPairArray_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, GIM_PAIR fillData) {
    CollisionJNI.btGimPairArray_resize__SWIG_0(swigCPtr, this, newsize, GIM_PAIR.getCPtr(fillData), fillData);
  }

  public void resize(int newsize) {
    CollisionJNI.btGimPairArray_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public GIM_PAIR expandNonInitializing() {
    return new GIM_PAIR(CollisionJNI.btGimPairArray_expandNonInitializing(swigCPtr, this), false);
  }

  public GIM_PAIR expand(GIM_PAIR fillValue) {
    return new GIM_PAIR(CollisionJNI.btGimPairArray_expand__SWIG_0(swigCPtr, this, GIM_PAIR.getCPtr(fillValue), fillValue), false);
  }

  public GIM_PAIR expand() {
    return new GIM_PAIR(CollisionJNI.btGimPairArray_expand__SWIG_1(swigCPtr, this), false);
  }

  public void push_back(GIM_PAIR _Val) {
    CollisionJNI.btGimPairArray_push_back(swigCPtr, this, GIM_PAIR.getCPtr(_Val), _Val);
  }

  public int capacity() {
    return CollisionJNI.btGimPairArray_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    CollisionJNI.btGimPairArray_reserve(swigCPtr, this, _Count);
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
  				CollisionJNI.delete_btGimPairArray_less(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public less() {
      this(CollisionJNI.new_btGimPairArray_less(), true);
    }
  
  }

  public void swap(int index0, int index1) {
    CollisionJNI.btGimPairArray_swap(swigCPtr, this, index0, index1);
  }

  public void removeAtIndex(int index) {
    CollisionJNI.btGimPairArray_removeAtIndex(swigCPtr, this, index);
  }

  public void initializeFromBuffer(long buffer, int size, int capacity) {
    CollisionJNI.btGimPairArray_initializeFromBuffer(swigCPtr, this, buffer, size, capacity);
  }

  public void copyFromArray(btGimPairArray otherArray) {
    CollisionJNI.btGimPairArray_copyFromArray(swigCPtr, this, btGimPairArray.getCPtr(otherArray), otherArray);
  }

}
