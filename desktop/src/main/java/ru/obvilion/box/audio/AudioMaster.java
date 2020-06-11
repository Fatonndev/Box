package ru.obvilion.box.audio;

import org.lwjgl.openal.*;

import java.util.ArrayList;
import java.util.List;

public class AudioMaster {

    private static List<Integer> buffers = new ArrayList<Integer>();

    public static void init() {
        ALC.create();
    }

//    public static int loadSong() {
//        int buffer = AL10.alGenBuffers();
//        AL10.alBufferData(buffer, AL10.AL_FORMAT_STEREO16, );
//    }

    public static void dispose() {
        ALC.destroy();
    }
}
