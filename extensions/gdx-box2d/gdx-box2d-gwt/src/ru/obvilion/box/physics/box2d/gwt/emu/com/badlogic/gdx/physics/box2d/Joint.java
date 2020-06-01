/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package ru.obvilion.box.physics.box2d.gwt.emu.com.badlogic.gdx.physics.box2d;

import ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.common.Vec2;

import ru.obvilion.box.math.Vector2;

public abstract class Joint {
	World world;
	ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.Joint joint;
	Object userData;
	JointEdge jointEdgeA;
	JointEdge jointEdgeB;

	/** Constructs a new joint
	 * @param addr the address of the joint */
	protected Joint (World world, ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.Joint joint) {
		this.world = world;
		this.joint = joint;
	}

	/** Get the type of the concrete joint. */
	public JointDef.JointType getType () {
		ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType type2 = joint.getType();
		if (type2 == ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.DISTANCE) return JointDef.JointType.DistanceJoint;
		if (type2 == ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.FRICTION) return JointDef.JointType.FrictionJoint;
		if (type2 == ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.GEAR) return JointDef.JointType.GearJoint;
		if (type2 == ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.MOUSE) return JointDef.JointType.MouseJoint;
		if (type2 == ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.PRISMATIC) return JointDef.JointType.PrismaticJoint;
		if (type2 == ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.PULLEY) return JointDef.JointType.PulleyJoint;
		if (type2 == ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.REVOLUTE) return JointDef.JointType.RevoluteJoint;
		if (type2 == ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.ROPE) return JointDef.JointType.RopeJoint;
		if (type2 == ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.UNKNOWN) return JointDef.JointType.Unknown;
		if (type2 == ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.WELD) return JointDef.JointType.WeldJoint;
		if (type2 == ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.WHEEL) return JointDef.JointType.WheelJoint;
		return JointDef.JointType.Unknown;
	}

	/** Get the first body attached to this joint. */
	public Body getBodyA () {
		return world.bodies.get(joint.getBodyA());
	}

	/** Get the second body attached to this joint. */
	public Body getBodyB () {
		return world.bodies.get(joint.getBodyB());
	}

	/** Get the anchor point on bodyA in world coordinates. */
	final Vec2 tmp = new Vec2();
	private final Vector2 anchorA = new Vector2();

	public Vector2 getAnchorA () {
		joint.getAnchorA(tmp);
		return anchorA.set(tmp.x, tmp.y);
	}

	/** Get the anchor point on bodyB in world coordinates. */
	private final Vector2 anchorB = new Vector2();

	public Vector2 getAnchorB () {
		joint.getAnchorB(tmp);
		return anchorB.set(tmp.x, tmp.y);
	}

	public boolean getCollideConnected () {
		return joint.getCollideConnected();
	}

	/** Get the reaction force on body2 at the joint anchor in Newtons. */
	private final Vector2 reactionForce = new Vector2();

	public Vector2 getReactionForce (float inv_dt) {
		joint.getReactionForce(inv_dt, tmp);
		return reactionForce.set(tmp.x, tmp.y);
	}

	/** Get the reaction torque on body2 in N*m. */
	public float getReactionTorque (float inv_dt) {
		return joint.getReactionTorque(inv_dt);
	}

	/** Get the user data */
	public Object getUserData () {
		return userData;
	}

	/** Set the user data */
	public void setUserData (Object userData) {
		this.userData = userData;
	}

	/** Short-cut function to determine if either body is inactive. */
	public boolean isActive () {
		return joint.isActive();
	}

	public ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.Joint getJBox2DJoint () {
		return joint;
	}

}
