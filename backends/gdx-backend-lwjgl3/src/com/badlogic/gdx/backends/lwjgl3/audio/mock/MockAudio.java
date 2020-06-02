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

package com.badlogic.gdx.backends.lwjgl3.audio.mock;

import ru.obvilion.box.audio.AudioDevice;
import ru.obvilion.box.audio.AudioRecorder;
import ru.obvilion.box.audio.Music;
import ru.obvilion.box.audio.Sound;
import com.badlogic.gdx.backends.lwjgl3.audio.Lwjgl3Audio;
import ru.obvilion.box.files.FileHandle;

/** The headless backend does its best to mock elements. This is intended to make code-sharing between
 * server and client as simple as possible.
 */
public class MockAudio implements Lwjgl3Audio {

	@Override
	public AudioDevice newAudioDevice(int samplingRate, boolean isMono) {
		return new MockAudioDevice();
	}

	@Override
	public AudioRecorder newAudioRecorder(int samplingRate, boolean isMono) {
		return new MockAudioRecorder();
	}

	@Override
	public Sound newSound(FileHandle fileHandle) {
		return new MockSound();
	}

	@Override
	public Music newMusic(FileHandle file) {
		return new MockMusic();
	}

	@Override
	public void update () {}

	@Override
	public void dispose () {}
}
