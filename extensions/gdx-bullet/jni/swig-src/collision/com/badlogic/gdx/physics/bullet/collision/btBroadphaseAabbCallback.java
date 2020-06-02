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

public class btBroadphaseAabbCallback extends BulletBase {
	private long swigCPtr;
	
	protected btBroadphaseAabbCallback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btBroadphaseAabbCallback, normally you should not need this constructor it's intended for low-level usage. */ 
	public btBroadphaseAabbCallback(long cPtr, boolean cMemoryOwn) {
		this("btBroadphaseAabbCallback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btBroadphaseAabbCallback obj) {
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
				CollisionJNI.delete_btBroadphaseAabbCallback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    CollisionJNI.btBroadphaseAabbCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    CollisionJNI.btBroadphaseAabbCallback_change_ownership(this, swigCPtr, true);
  }

  public boolean process(btBroadphaseProxy proxy) {
    return CollisionJNI.btBroadphaseAabbCallback_process(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy), proxy);
  }

  public btBroadphaseAabbCallback() {
    this(CollisionJNI.new_btBroadphaseAabbCallback(), true);
    CollisionJNI.btBroadphaseAabbCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
