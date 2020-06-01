package com.badlogic.gdx.backends.gwt;

import ru.obvilion.box.Input;

public interface GwtInput extends Input {

	/** Resets all Input events (called on main loop after rendering) */
	void reset();
}
