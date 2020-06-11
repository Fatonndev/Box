package ru.obvilion.box.io.input;

import ru.obvilion.box.Window;

public class ResizeListener {

    public static void sizeCallback(long l, int x, int y) {
        Window.tecScreen.resize(x, y);
    }
}
