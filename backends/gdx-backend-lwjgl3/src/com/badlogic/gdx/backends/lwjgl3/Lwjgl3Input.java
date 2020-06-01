package com.badlogic.gdx.backends.lwjgl3;

import ru.obvilion.box.constructors.Input;
import com.badlogic.gdx.utils.Disposable;

public interface Lwjgl3Input extends Input, Disposable {

	void windowHandleChanged (long windowHandle);

	void update ();

	void prepareNext ();

	void resetPollingStates ();
}
