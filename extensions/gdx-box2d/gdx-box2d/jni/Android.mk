LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)
 
LOCAL_MODULE    := gdx-box2d
LOCAL_C_INCLUDES := 
 
LOCAL_CFLAGS := $(LOCAL_C_INCLUDES:%=-I%) -O2 -Wall -D__ANDROID__
LOCAL_CPPFLAGS := $(LOCAL_C_INCLUDES:%=-I%) -O2 -Wall -D__ANDROID__
LOCAL_LDLIBS := -lm
LOCAL_ARM_MODE  := arm
 
LOCAL_SRC_FILES := Shape.cpp\
	CircleShape.cpp\
	RopeJoint.cpp\
	GearJoint.cpp\
	Manifold.cpp\
	Contact.cpp\
	memcpy_wrap.c\
	Body.cpp\
	MotorJoint.cpp\
	RevoluteJoint.cpp\
	PolygonShape.cpp\
	PulleyJoint.cpp\
	World.cpp\
	WheelJoint.cpp\
	ContactImpulse.cpp\
	DistanceJoint.cpp\
	EdgeShape.cpp\
	ChainShape.cpp\
	Fixture.cpp\
	PrismaticJoint.cpp\
	Joint.cpp\
	Box2D/Dynamics/b2Body.cpp\
	Box2D/Dynamics/b2World.cpp\
	Box2D/Dynamics/b2Fixture.cpp\
	Box2D/Dynamics/Contacts/b2ChainAndPolygonContact.cpp\
	Box2D/Dynamics/Contacts/b2EdgeAndPolygonContact.cpp\
	Box2D/Dynamics/Contacts/b2ChainAndCircleContact.cpp\
	Box2D/Dynamics/Contacts/b2PolygonAndCircleContact.cpp\
	Box2D/Dynamics/Contacts/b2PolygonContact.cpp\
	Box2D/Dynamics/Contacts/b2ContactSolver.cpp\
	Box2D/Dynamics/Contacts/b2CircleContact.cpp\
	Box2D/Dynamics/Contacts/b2EdgeAndCircleContact.cpp\
	Box2D/Dynamics/Contacts/b2Contact.cpp\
	Box2D/Dynamics/b2WorldCallbacks.cpp\
	Box2D/Dynamics/Joints/b2WeldJoint.cpp\
	Box2D/Dynamics/Joints/b2MouseJoint.cpp\
	Box2D/Dynamics/Joints/b2FrictionJoint.cpp\
	Box2D/Dynamics/Joints/b2DistanceJoint.cpp\
	Box2D/Dynamics/Joints/b2WheelJoint.cpp\
	Box2D/Dynamics/Joints/b2MotorJoint.cpp\
	Box2D/Dynamics/Joints/b2RevoluteJoint.cpp\
	Box2D/Dynamics/Joints/b2GearJoint.cpp\
	Box2D/Dynamics/Joints/b2Joint.cpp\
	Box2D/Dynamics/Joints/b2PrismaticJoint.cpp\
	Box2D/Dynamics/Joints/b2PulleyJoint.cpp\
	Box2D/Dynamics/Joints/b2RopeJoint.cpp\
	Box2D/Dynamics/b2Island.cpp\
	Box2D/Dynamics/b2ContactManager.cpp\
	Box2D/Rope/b2Rope.cpp\
	Box2D/Common/b2Draw.cpp\
	Box2D/Common/b2BlockAllocator.cpp\
	Box2D/Common/b2Settings.cpp\
	Box2D/Common/b2Timer.cpp\
	Box2D/Common/b2StackAllocator.cpp\
	Box2D/Common/b2Math.cpp\
	Box2D/Collision/b2Distance.cpp\
	Box2D/Collision/b2CollideCircle.cpp\
	Box2D/Collision/b2CollidePolygon.cpp\
	Box2D/Collision/b2DynamicTree.cpp\
	Box2D/Collision/Shapes/b2ChainShape.cpp\
	Box2D/Collision/Shapes/b2EdgeShape.cpp\
	Box2D/Collision/Shapes/b2CircleShape.cpp\
	Box2D/Collision/Shapes/b2PolygonShape.cpp\
	Box2D/Collision/b2TimeOfImpact.cpp\
	Box2D/Collision/b2BroadPhase.cpp\
	Box2D/Collision/b2CollideEdge.cpp\
	Box2D/Collision/b2Collision.cpp\
	MouseJoint.cpp\
	FrictionJoint.cpp\
	WeldJoint.cpp
 
include $(BUILD_SHARED_LIBRARY)
