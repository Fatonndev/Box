package com.badlogic.gdx.backends.android;

import ru.obvilion.box.constructors.Audio;
import ru.obvilion.box.utils.Disposable;

public interface AndroidAudio extends Audio, Disposable {

	/** Pauses all playing sounds and musics **/
	void pause();

	/** Resumes all playing sounds and musics **/
	void resume();

	/** Notifies the AndroidAudio if an AndroidMusic is disposed **/
	void notifyMusicDisposed (AndroidMusic music);
}
