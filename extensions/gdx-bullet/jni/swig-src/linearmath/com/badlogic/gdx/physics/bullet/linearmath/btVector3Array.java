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

public class btVector3Array extends BulletBase {
	private long swigCPtr;
	
	protected btVector3Array(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btVector3Array, normally you should not need this constructor it's intended for low-level usage. */ 
	public btVector3Array(long cPtr, boolean cMemoryOwn) {
		this("btVector3Array", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btVector3Array obj) {
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
				LinearMathJNI.delete_btVector3Array(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btVector3Array operatorAssignment(btVector3Array other) {
    return new btVector3Array(LinearMathJNI.btVector3Array_operatorAssignment(swigCPtr, this, btVector3Array.getCPtr(other), other), false);
  }

  public btVector3Array() {
    this(LinearMathJNI.new_btVector3Array__SWIG_0(), true);
  }

  public btVector3Array(btVector3Array otherArray) {
    this(LinearMathJNI.new_btVector3Array__SWIG_1(btVector3Array.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return LinearMathJNI.btVector3Array_size(swigCPtr, this);
  }

  public Vector3 atConst(int n) {
	return LinearMathJNI.btVector3Array_atConst(swigCPtr, this, n);
}

  public Vector3 at(int n) {
	return LinearMathJNI.btVector3Array_at(swigCPtr, this, n);
}

  public Vector3 operatorSubscriptConst(int n) {
	return LinearMathJNI.btVector3Array_operatorSubscriptConst(swigCPtr, this, n);
}

  public Vector3 operatorSubscript(int n) {
	return LinearMathJNI.btVector3Array_operatorSubscript(swigCPtr, this, n);
}

  public void clear() {
    LinearMathJNI.btVector3Array_clear(swigCPtr, this);
  }

  public void pop_back() {
    LinearMathJNI.btVector3Array_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    LinearMathJNI.btVector3Array_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, Vector3 fillData) {
    LinearMathJNI.btVector3Array_resize__SWIG_0(swigCPtr, this, newsize, fillData);
  }

  public void resize(int newsize) {
    LinearMathJNI.btVector3Array_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public Vector3 expandNonInitializing() {
	return LinearMathJNI.btVector3Array_expandNonInitializing(swigCPtr, this);
}

  public Vector3 expand(Vector3 fillValue) {
	return LinearMathJNI.btVector3Array_expand__SWIG_0(swigCPtr, this, fillValue);
}

  public Vector3 expand() {
	return LinearMathJNI.btVector3Array_expand__SWIG_1(swigCPtr, this);
}

  public void push_back(Vector3 _Val) {
    LinearMathJNI.btVector3Array_push_back(swigCPtr, this, _Val);
  }

  public int capacity() {
    return LinearMathJNI.btVector3Array_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    LinearMathJNI.btVector3Array_reserve(swigCPtr, this, _Count);
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
  				LinearMathJNI.delete_btVector3Array_less(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public boolean operatorFunctionCall(Vector3 a, Vector3 b) {
      return LinearMathJNI.btVector3Array_less_operatorFunctionCall(swigCPtr, this, a, b);
    }
  
    public less() {
      this(LinearMathJNI.new_btVector3Array_less(), true);
    }
  
  }

  public void swap(int index0, int index1) {
    LinearMathJNI.btVector3Array_swap(swigCPtr, this, index0, index1);
  }

  public int findBinarySearch(Vector3 key) {
    return LinearMathJNI.btVector3Array_findBinarySearch(swigCPtr, this, key);
  }

  public int findLinearSearch(Vector3 key) {
    return LinearMathJNI.btVector3Array_findLinearSearch(swigCPtr, this, key);
  }

  public int findLinearSearch2(Vector3 key) {
    return LinearMathJNI.btVector3Array_findLinearSearch2(swigCPtr, this, key);
  }

  public void removeAtIndex(int index) {
    LinearMathJNI.btVector3Array_removeAtIndex(swigCPtr, this, index);
  }

  public void remove(Vector3 key) {
    LinearMathJNI.btVector3Array_remove(swigCPtr, this, key);
  }

  public void initializeFromBuffer(long buffer, int size, int capacity) {
    LinearMathJNI.btVector3Array_initializeFromBuffer(swigCPtr, this, buffer, size, capacity);
  }

  public void copyFromArray(btVector3Array otherArray) {
    LinearMathJNI.btVector3Array_copyFromArray(swigCPtr, this, btVector3Array.getCPtr(otherArray), otherArray);
  }

}
