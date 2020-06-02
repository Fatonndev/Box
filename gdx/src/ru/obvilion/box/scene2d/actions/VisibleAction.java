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

package ru.obvilion.box.scene2d.actions;

import ru.obvilion.box.scene2d.Action;
import ru.obvilion.box.scene2d.Actor;

/** Sets the actor's {@link Actor#setVisible(boolean) visibility}.
 * @author Nathan Sweet */
public class VisibleAction extends Action {
	private boolean visible;

	public boolean act (float delta) {
		target.setVisible(visible);
		return true;
	}

	public boolean isVisible () {
		return visible;
	}

	public void setVisible (boolean visible) {
		this.visible = visible;
	}
}
