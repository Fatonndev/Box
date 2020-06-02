/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.math.Vector3;

public class btAxisSweep3InternalInt extends btBroadphaseInterface {
	private long swigCPtr;
	
	protected btAxisSweep3InternalInt(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btAxisSweep3InternalInt_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btAxisSweep3InternalInt, normally you should not need this constructor it's intended for low-level usage. */
	public btAxisSweep3InternalInt(long cPtr, boolean cMemoryOwn) {
		this("btAxisSweep3InternalInt", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btAxisSweep3InternalInt_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btAxisSweep3InternalInt obj) {
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
				CollisionJNI.delete_btAxisSweep3InternalInt(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return CollisionJNI.btAxisSweep3InternalInt_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    CollisionJNI.btAxisSweep3InternalInt_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return CollisionJNI.btAxisSweep3InternalInt_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    CollisionJNI.btAxisSweep3InternalInt_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return CollisionJNI.btAxisSweep3InternalInt_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    CollisionJNI.btAxisSweep3InternalInt_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return CollisionJNI.btAxisSweep3InternalInt_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    CollisionJNI.btAxisSweep3InternalInt_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  static public class Edge extends BulletBase {
  	private long swigCPtr;
  	
  	protected Edge(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new Edge, normally you should not need this constructor it's intended for low-level usage. */ 
  	public Edge(long cPtr, boolean cMemoryOwn) {
  		this("Edge", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(Edge obj) {
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
  				CollisionJNI.delete_btAxisSweep3InternalInt_Edge(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setPos(long value) {
      CollisionJNI.btAxisSweep3InternalInt_Edge_pos_set(swigCPtr, this, value);
    }
  
    public long getPos() {
      return CollisionJNI.btAxisSweep3InternalInt_Edge_pos_get(swigCPtr, this);
    }
  
    public void setHandle(long value) {
      CollisionJNI.btAxisSweep3InternalInt_Edge_handle_set(swigCPtr, this, value);
    }
  
    public long getHandle() {
      return CollisionJNI.btAxisSweep3InternalInt_Edge_handle_get(swigCPtr, this);
    }
  
    public long IsMax() {
      return CollisionJNI.btAxisSweep3InternalInt_Edge_IsMax(swigCPtr, this);
    }
  
    public Edge() {
      this(CollisionJNI.new_btAxisSweep3InternalInt_Edge(), true);
    }
  
  }

  static public class Handle extends btBroadphaseProxy {
  	private long swigCPtr;
  	
  	protected Handle(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, CollisionJNI.btAxisSweep3InternalInt_Handle_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new Handle, normally you should not need this constructor it's intended for low-level usage. */
  	public Handle(long cPtr, boolean cMemoryOwn) {
  		this("Handle", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(CollisionJNI.btAxisSweep3InternalInt_Handle_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(Handle obj) {
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
  				CollisionJNI.delete_btAxisSweep3InternalInt_Handle(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public long operatorNew(long sizeInBytes) {
      return CollisionJNI.btAxisSweep3InternalInt_Handle_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
    }
  
    public void operatorDelete(long ptr) {
      CollisionJNI.btAxisSweep3InternalInt_Handle_operatorDelete__SWIG_0(swigCPtr, this, ptr);
    }
  
    public long operatorNew(long arg0, long ptr) {
      return CollisionJNI.btAxisSweep3InternalInt_Handle_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
    }
  
    public void operatorDelete(long arg0, long arg1) {
      CollisionJNI.btAxisSweep3InternalInt_Handle_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
    }
  
    public long operatorNewArray(long sizeInBytes) {
      return CollisionJNI.btAxisSweep3InternalInt_Handle_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
    }
  
    public void operatorDeleteArray(long ptr) {
      CollisionJNI.btAxisSweep3InternalInt_Handle_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
    }
  
    public long operatorNewArray(long arg0, long ptr) {
      return CollisionJNI.btAxisSweep3InternalInt_Handle_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
    }
  
    public void operatorDeleteArray(long arg0, long arg1) {
      CollisionJNI.btAxisSweep3InternalInt_Handle_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
    }
  
    public void setMinEdges(long[] value) {
      CollisionJNI.btAxisSweep3InternalInt_Handle_minEdges_set(swigCPtr, this, value);
    }
  
    public long[] getMinEdges() {
      return CollisionJNI.btAxisSweep3InternalInt_Handle_minEdges_get(swigCPtr, this);
    }
  
    public void setMaxEdges(long[] value) {
      CollisionJNI.btAxisSweep3InternalInt_Handle_maxEdges_set(swigCPtr, this, value);
    }
  
    public long[] getMaxEdges() {
      return CollisionJNI.btAxisSweep3InternalInt_Handle_maxEdges_get(swigCPtr, this);
    }
  
    public void setDbvtProxy(btBroadphaseProxy value) {
      CollisionJNI.btAxisSweep3InternalInt_Handle_dbvtProxy_set(swigCPtr, this, btBroadphaseProxy.getCPtr(value), value);
    }
  
    public btBroadphaseProxy getDbvtProxy() {
  	return btBroadphaseProxy.internalTemp(CollisionJNI.btAxisSweep3InternalInt_Handle_dbvtProxy_get(swigCPtr, this), false);
  }
  
    public void SetNextFree(long next) {
      CollisionJNI.btAxisSweep3InternalInt_Handle_SetNextFree(swigCPtr, this, next);
    }
  
    public long GetNextFree() {
      return CollisionJNI.btAxisSweep3InternalInt_Handle_GetNextFree(swigCPtr, this);
    }
  
    public Handle() {
      this(CollisionJNI.new_btAxisSweep3InternalInt_Handle(), true);
    }
  
  }

  public btAxisSweep3InternalInt(Vector3 worldAabbMin, Vector3 worldAabbMax, long handleMask, long handleSentinel, long maxHandles, btOverlappingPairCache pairCache, boolean disableRaycastAccelerator) {
    this(CollisionJNI.new_btAxisSweep3InternalInt__SWIG_0(worldAabbMin, worldAabbMax, handleMask, handleSentinel, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache, disableRaycastAccelerator), true);
  }

  public btAxisSweep3InternalInt(Vector3 worldAabbMin, Vector3 worldAabbMax, long handleMask, long handleSentinel, long maxHandles, btOverlappingPairCache pairCache) {
    this(CollisionJNI.new_btAxisSweep3InternalInt__SWIG_1(worldAabbMin, worldAabbMax, handleMask, handleSentinel, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache), true);
  }

  public btAxisSweep3InternalInt(Vector3 worldAabbMin, Vector3 worldAabbMax, long handleMask, long handleSentinel, long maxHandles) {
    this(CollisionJNI.new_btAxisSweep3InternalInt__SWIG_2(worldAabbMin, worldAabbMax, handleMask, handleSentinel, maxHandles), true);
  }

  public btAxisSweep3InternalInt(Vector3 worldAabbMin, Vector3 worldAabbMax, long handleMask, long handleSentinel) {
    this(CollisionJNI.new_btAxisSweep3InternalInt__SWIG_3(worldAabbMin, worldAabbMax, handleMask, handleSentinel), true);
  }

  public long getNumHandles() {
    return CollisionJNI.btAxisSweep3InternalInt_getNumHandles(swigCPtr, this);
  }

  public long addHandle(Vector3 aabbMin, Vector3 aabbMax, long pOwner, int collisionFilterGroup, int collisionFilterMask, btDispatcher dispatcher) {
    return CollisionJNI.btAxisSweep3InternalInt_addHandle(swigCPtr, this, aabbMin, aabbMax, pOwner, collisionFilterGroup, collisionFilterMask, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void removeHandle(long handle, btDispatcher dispatcher) {
    CollisionJNI.btAxisSweep3InternalInt_removeHandle(swigCPtr, this, handle, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void updateHandle(long handle, Vector3 aabbMin, Vector3 aabbMax, btDispatcher dispatcher) {
    CollisionJNI.btAxisSweep3InternalInt_updateHandle(swigCPtr, this, handle, aabbMin, aabbMax, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public btAxisSweep3InternalInt.Handle getHandle(long index) {
    long cPtr = CollisionJNI.btAxisSweep3InternalInt_getHandle(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btAxisSweep3InternalInt.Handle(cPtr, false);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btAxisSweep3InternalInt_rayTest__SWIG_0(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback, aabbMin, aabbMax);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback, Vector3 aabbMin) {
    CollisionJNI.btAxisSweep3InternalInt_rayTest__SWIG_1(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback, aabbMin);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback) {
    CollisionJNI.btAxisSweep3InternalInt_rayTest__SWIG_2(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback);
  }

  public void quantize(java.nio.LongBuffer out, Vector3 point, int isMax) {
    assert out.isDirect() : "Buffer must be allocated direct.";
    {
      CollisionJNI.btAxisSweep3InternalInt_quantize(swigCPtr, this, out, point, isMax);
    }
  }

  public void unQuantize(btBroadphaseProxy proxy, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btAxisSweep3InternalInt_unQuantize(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy), proxy, aabbMin, aabbMax);
  }

  public boolean testAabbOverlap(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
    return CollisionJNI.btAxisSweep3InternalInt_testAabbOverlap(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1);
  }

  public void setOverlappingPairUserCallback(btOverlappingPairCallback pairCallback) {
    CollisionJNI.btAxisSweep3InternalInt_setOverlappingPairUserCallback(swigCPtr, this, btOverlappingPairCallback.getCPtr(pairCallback), pairCallback);
  }

  public btOverlappingPairCallback getOverlappingPairUserCallback() {
    long cPtr = CollisionJNI.btAxisSweep3InternalInt_getOverlappingPairUserCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new btOverlappingPairCallback(cPtr, false);
  }

}
