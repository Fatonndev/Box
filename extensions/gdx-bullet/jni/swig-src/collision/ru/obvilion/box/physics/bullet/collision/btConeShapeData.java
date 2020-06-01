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

public class btConeShapeData extends BulletBase {
	private long swigCPtr;
	
	protected btConeShapeData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConeShapeData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btConeShapeData(long cPtr, boolean cMemoryOwn) {
		this("btConeShapeData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btConeShapeData obj) {
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
				CollisionJNI.delete_btConeShapeData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setConvexInternalShapeData(btConvexInternalShapeData value) {
    CollisionJNI.btConeShapeData_convexInternalShapeData_set(swigCPtr, this, btConvexInternalShapeData.getCPtr(value), value);
  }

  public btConvexInternalShapeData getConvexInternalShapeData() {
    long cPtr = CollisionJNI.btConeShapeData_convexInternalShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexInternalShapeData(cPtr, false);
  }

  public void setUpIndex(int value) {
    CollisionJNI.btConeShapeData_upIndex_set(swigCPtr, this, value);
  }

  public int getUpIndex() {
    return CollisionJNI.btConeShapeData_upIndex_get(swigCPtr, this);
  }

  public void setPadding(String value) {
    CollisionJNI.btConeShapeData_padding_set(swigCPtr, this, value);
  }

  public String getPadding() {
    return CollisionJNI.btConeShapeData_padding_get(swigCPtr, this);
  }

  public btConeShapeData() {
    this(CollisionJNI.new_btConeShapeData(), true);
  }

}
