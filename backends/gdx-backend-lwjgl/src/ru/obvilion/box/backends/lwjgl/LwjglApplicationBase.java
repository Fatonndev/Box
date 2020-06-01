package ru.obvilion.box.backends.lwjgl;

import ru.obvilion.box.Application;
import ru.obvilion.box.backends.lwjgl.audio.LwjglAudio;

public interface LwjglApplicationBase extends Application {

	LwjglAudio createAudio(LwjglApplicationConfiguration config);

	LwjglInput createInput(LwjglApplicationConfiguration config);
}
