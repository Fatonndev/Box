package com.badlogic.gdx.backends.lwjgl;

import ru.obvilion.box.constructors.Application;
import com.badlogic.gdx.backends.lwjgl.audio.LwjglAudio;

public interface LwjglApplicationBase extends Application {

	LwjglAudio createAudio(LwjglApplicationConfiguration config);

	LwjglInput createInput(LwjglApplicationConfiguration config);
}
