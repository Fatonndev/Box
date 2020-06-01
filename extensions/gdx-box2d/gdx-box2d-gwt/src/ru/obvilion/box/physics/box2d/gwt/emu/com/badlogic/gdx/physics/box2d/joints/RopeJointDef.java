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

package ru.obvilion.box.physics.box2d.gwt.emu.com.badlogic.gdx.physics.box2d.joints;

import ru.obvilion.box.math.Vector2;
import ru.obvilion.box.physics.box2d.gwt.emu.com.badlogic.gdx.physics.box2d.JointDef;

/** Rope joint definition. This requires two body anchor points and a maximum lengths. Note: by default the connected objects will
 * not collide. see collideConnected in b2JointDef.
 * @author mzechner */
public class RopeJointDef extends JointDef {
	public RopeJointDef () {
		type = JointType.RopeJoint;
	}

	/** The local anchor point relative to bodyA's origin. **/
	public final Vector2 localAnchorA = new Vector2(-1, 0);

	/** The local anchor point relative to bodyB's origin. **/
	public final Vector2 localAnchorB = new Vector2(1, 0);

	/** The maximum length of the rope. Warning: this must be larger than b2_linearSlop or the joint will have no effect. */
	public float maxLength = 0;

	@Override
	public ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointDef toJBox2d () {
		ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.RopeJointDef fd = new ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.RopeJointDef();
		fd.bodyA = bodyA.body;
		fd.bodyB = bodyB.body;
		fd.collideConnected = collideConnected;
		fd.maxLength = maxLength;
		fd.localAnchorA.set(localAnchorA.x, localAnchorA.y);
		fd.localAnchorB.set(localAnchorB.x, localAnchorB.y);
		fd.type = ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.joints.JointType.ROPE;
		return fd;
	}
}
