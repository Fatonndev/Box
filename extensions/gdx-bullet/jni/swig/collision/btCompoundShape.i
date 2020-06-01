%module btCompoundShape

%{
#include <BulletCollision/CollisionShapes/btCompoundShape.h>
%}

%typemap(javaimports) btCompoundShape %{
import Array;
import Vector3;
import Quaternion;
import Matrix3;
import Matrix4;
%}

%rename(internalAddChildShape) btCompoundShape::addChildShape;
%javamethodmodifiers btCompoundShape::addChildShape "private";
%rename(internalRemoveChildShape) btCompoundShape::removeChildShape;
%javamethodmodifiers btCompoundShape::removeChildShape "private";
%rename(internalRemoveChildShapeByIndex) btCompoundShape::removeChildShapeByIndex;
%javamethodmodifiers btCompoundShape::removeChildShapeByIndex "private";
%ignore btCompoundShape::getChildShape;

%rename(getChildTransformConst) btCompoundShape::getChildTransform(int) const;
%rename(getDynamicAabbTreeConst) btCompoundShape::getDynamicAabbTree() const;

%typemap(javacode) btCompoundShape %{
	protected Array<btCollisionShape> children = new Array<btCollisionShape>();
	
	public void addChildShape(Matrix4 localTransform, btCollisionShape shape) {
		internalAddChildShape(localTransform, shape);
		children.add(shape);
		shape.obtain();
	}
	
	public void removeChildShape(btCollisionShape shape) {
		internalRemoveChildShape(shape);
		final int idx = children.indexOf(shape, false);
		if (idx >= 0)
			children.removeIndex(idx).release();
	}
	
	public void removeChildShapeByIndex(int index) {
		internalRemoveChildShapeByIndex(index);
		children.removeIndex(index).release();
	}
	
	public btCollisionShape getChildShape(int index) {
		return children.get(index);
	}
	
	@Override
	public void dispose() {
		for (btCollisionShape child : children)
			child.release();
		children.clear();
		super.dispose();
	}
%}

%include "BulletCollision/CollisionShapes/btCompoundShape.h"
