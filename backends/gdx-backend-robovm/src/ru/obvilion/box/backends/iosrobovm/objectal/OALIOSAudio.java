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

package ru.obvilion.box.backends.iosrobovm.objectal;

import ru.obvilion.box.Box;
import ru.obvilion.box.audio.AudioDevice;
import ru.obvilion.box.audio.AudioRecorder;
import ru.obvilion.box.audio.Music;
import ru.obvilion.box.audio.Sound;
import ru.obvilion.box.backends.iosrobovm.IOSApplicationConfiguration;
import ru.obvilion.box.backends.iosrobovm.IOSAudio;
import ru.obvilion.box.backends.iosrobovm.IOSMusic;
import ru.obvilion.box.backends.iosrobovm.IOSSound;
import ru.obvilion.box.files.FileHandle;
import ru.obvilion.box.utils.GdxRuntimeException;

public class OALIOSAudio implements IOSAudio {

	public OALIOSAudio (IOSApplicationConfiguration config) {
		if (!config.useAudio) return;
		OALSimpleAudio audio = OALSimpleAudio.sharedInstance();
		if (audio != null) {
			audio.setAllowIpod(config.allowIpod);
			audio.setHonorSilentSwitch(!config.overrideRingerSwitch);
		} else
			Box.app.error("IOSAudio", "No OALSimpleAudio instance available, audio will not be availabe");
	}

	@Override
	public AudioDevice newAudioDevice (int samplingRate, boolean isMono) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AudioRecorder newAudioRecorder (int samplingRate, boolean isMono) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sound newSound (FileHandle fileHandle) {
		return new IOSSound(fileHandle);
	}

	@Override
	public Music newMusic (FileHandle fileHandle) {
		String path = fileHandle.file().getPath().replace('\\', '/');
		OALAudioTrack track = OALAudioTrack.create();
		if (track != null) {
			if (track.preloadFile(path)) {
				return new IOSMusic(track);
			}
		}
		throw new GdxRuntimeException("Error opening music file at " + path);
	}

}
