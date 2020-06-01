/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.obvilion.box.physics.bullet.softbody;

import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.physics.bullet.linearmath.*;
import ru.obvilion.box.physics.bullet.collision.*;
import ru.obvilion.box.physics.bullet.dynamics.*;

public class SoftBodyMaterialData extends BulletBase {
	private long swigCPtr;
	
	protected SoftBodyMaterialData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new SoftBodyMaterialData, normally you should not need this constructor it's intended for low-level usage. */ 
	public SoftBodyMaterialData(long cPtr, boolean cMemoryOwn) {
		this("SoftBodyMaterialData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(SoftBodyMaterialData obj) {
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
				SoftbodyJNI.delete_SoftBodyMaterialData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setLinearStiffness(float value) {
    SoftbodyJNI.SoftBodyMaterialData_linearStiffness_set(swigCPtr, this, value);
  }

  public float getLinearStiffness() {
    return SoftbodyJNI.SoftBodyMaterialData_linearStiffness_get(swigCPtr, this);
  }

  public void setAngularStiffness(float value) {
    SoftbodyJNI.SoftBodyMaterialData_angularStiffness_set(swigCPtr, this, value);
  }

  public float getAngularStiffness() {
    return SoftbodyJNI.SoftBodyMaterialData_angularStiffness_get(swigCPtr, this);
  }

  public void setVolumeStiffness(float value) {
    SoftbodyJNI.SoftBodyMaterialData_volumeStiffness_set(swigCPtr, this, value);
  }

  public float getVolumeStiffness() {
    return SoftbodyJNI.SoftBodyMaterialData_volumeStiffness_get(swigCPtr, this);
  }

  public void setFlags(int value) {
    SoftbodyJNI.SoftBodyMaterialData_flags_set(swigCPtr, this, value);
  }

  public int getFlags() {
    return SoftbodyJNI.SoftBodyMaterialData_flags_get(swigCPtr, this);
  }

  public SoftBodyMaterialData() {
    this(SoftbodyJNI.new_SoftBodyMaterialData(), true);
  }

}
