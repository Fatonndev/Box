/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btStridingMeshInterface extends BulletBase {
	private long swigCPtr;
	
	protected btStridingMeshInterface(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btStridingMeshInterface, normally you should not need this constructor it's intended for low-level usage. */ 
	public btStridingMeshInterface(long cPtr, boolean cMemoryOwn) {
		this("btStridingMeshInterface", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btStridingMeshInterface obj) {
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
				CollisionJNI.delete_btStridingMeshInterface(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return CollisionJNI.btStridingMeshInterface_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    CollisionJNI.btStridingMeshInterface_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return CollisionJNI.btStridingMeshInterface_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    CollisionJNI.btStridingMeshInterface_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return CollisionJNI.btStridingMeshInterface_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    CollisionJNI.btStridingMeshInterface_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return CollisionJNI.btStridingMeshInterface_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    CollisionJNI.btStridingMeshInterface_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public void InternalProcessAllTriangles(btInternalTriangleIndexCallback callback, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btStridingMeshInterface_InternalProcessAllTriangles(swigCPtr, this, btInternalTriangleIndexCallback.getCPtr(callback), callback, aabbMin, aabbMax);
  }

  public void calculateAabbBruteForce(Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btStridingMeshInterface_calculateAabbBruteForce(swigCPtr, this, aabbMin, aabbMax);
  }

  public void getLockedVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int stride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype, int subpart) {
    CollisionJNI.btStridingMeshInterface_getLockedVertexIndexBase__SWIG_0(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(stride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype), subpart);
  }

  public void getLockedVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int stride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype) {
    CollisionJNI.btStridingMeshInterface_getLockedVertexIndexBase__SWIG_1(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(stride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype));
  }

  public void getLockedReadOnlyVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int stride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype, int subpart) {
    CollisionJNI.btStridingMeshInterface_getLockedReadOnlyVertexIndexBase__SWIG_0(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(stride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype), subpart);
  }

  public void getLockedReadOnlyVertexIndexBase(SWIGTYPE_p_p_unsigned_char vertexbase, SWIGTYPE_p_int numverts, SWIGTYPE_p_PHY_ScalarType type, SWIGTYPE_p_int stride, SWIGTYPE_p_p_unsigned_char indexbase, SWIGTYPE_p_int indexstride, SWIGTYPE_p_int numfaces, SWIGTYPE_p_PHY_ScalarType indicestype) {
    CollisionJNI.btStridingMeshInterface_getLockedReadOnlyVertexIndexBase__SWIG_1(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(vertexbase), SWIGTYPE_p_int.getCPtr(numverts), SWIGTYPE_p_PHY_ScalarType.getCPtr(type), SWIGTYPE_p_int.getCPtr(stride), SWIGTYPE_p_p_unsigned_char.getCPtr(indexbase), SWIGTYPE_p_int.getCPtr(indexstride), SWIGTYPE_p_int.getCPtr(numfaces), SWIGTYPE_p_PHY_ScalarType.getCPtr(indicestype));
  }

  public void unLockVertexBase(int subpart) {
    CollisionJNI.btStridingMeshInterface_unLockVertexBase(swigCPtr, this, subpart);
  }

  public void unLockReadOnlyVertexBase(int subpart) {
    CollisionJNI.btStridingMeshInterface_unLockReadOnlyVertexBase(swigCPtr, this, subpart);
  }

  public int getNumSubParts() {
    return CollisionJNI.btStridingMeshInterface_getNumSubParts(swigCPtr, this);
  }

  public void preallocateVertices(int numverts) {
    CollisionJNI.btStridingMeshInterface_preallocateVertices(swigCPtr, this, numverts);
  }

  public void preallocateIndices(int numindices) {
    CollisionJNI.btStridingMeshInterface_preallocateIndices(swigCPtr, this, numindices);
  }

  public boolean hasPremadeAabb() {
    return CollisionJNI.btStridingMeshInterface_hasPremadeAabb(swigCPtr, this);
  }

  public void setPremadeAabb(Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btStridingMeshInterface_setPremadeAabb(swigCPtr, this, aabbMin, aabbMax);
  }

  public void getPremadeAabb(btVector3 aabbMin, btVector3 aabbMax) {
    CollisionJNI.btStridingMeshInterface_getPremadeAabb(swigCPtr, this, btVector3.getCPtr(aabbMin), aabbMin, btVector3.getCPtr(aabbMax), aabbMax);
  }

  public Vector3 getScaling() {
	return CollisionJNI.btStridingMeshInterface_getScaling(swigCPtr, this);
}

  public void setScaling(Vector3 scaling) {
    CollisionJNI.btStridingMeshInterface_setScaling(swigCPtr, this, scaling);
  }

  public int calculateSerializeBufferSize() {
    return CollisionJNI.btStridingMeshInterface_calculateSerializeBufferSize(swigCPtr, this);
  }

  public String serialize(long dataBuffer, btSerializer serializer) {
    return CollisionJNI.btStridingMeshInterface_serialize(swigCPtr, this, dataBuffer, btSerializer.getCPtr(serializer), serializer);
  }

}
