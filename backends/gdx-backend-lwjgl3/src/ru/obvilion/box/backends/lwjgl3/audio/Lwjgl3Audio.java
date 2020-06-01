package ru.obvilion.box.backends.lwjgl3.audio;

import ru.obvilion.box.Audio;
import ru.obvilion.box.utils.Disposable;

public interface Lwjgl3Audio extends Audio, Disposable {

	void update ();
}
