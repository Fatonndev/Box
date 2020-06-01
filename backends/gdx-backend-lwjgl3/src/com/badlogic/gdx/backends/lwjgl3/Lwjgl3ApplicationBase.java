package com.badlogic.gdx.backends.lwjgl3;

import ru.obvilion.box.constructors.Application;
import com.badlogic.gdx.backends.lwjgl3.audio.Lwjgl3Audio;

public interface Lwjgl3ApplicationBase extends Application {

	Lwjgl3Audio createAudio(Lwjgl3ApplicationConfiguration config);

	Lwjgl3Input createInput(Lwjgl3Window window);
}
