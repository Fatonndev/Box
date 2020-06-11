package ru.obvilion.box;

import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.opengl.GL;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryUtil;
import ru.obvilion.box.graphics.components.Camera;
import ru.obvilion.box.io.input.KeyListener;
import ru.obvilion.box.io.input.MouseListener;
import ru.obvilion.box.io.input.ResizeListener;
import ru.obvilion.box.util.IOUtil;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.NULL;

public class Window {
    private static Window window = null;
    public static Screen tecScreen;
    public static Camera camera;

    private int width, height;
    private long glfwWindow;    // Window id
    private Screen screen;
    private String title;

    public Window(int width, int height, String title) {
        this.width = width;
        this.height = height;
        this.title = title;
    }

    public Window(int width, int height) {
        this(width, height, "untitled");
    }
    public Window(String title) {
        this(1280, 720, title);
    }
    public Window() {
        this(1280, 720, "untitled");
    }

    public static Window get() {
        if (Window.window == null)
            Window.window = new Window();
        return Window.window;
    }
    public static void setCamera(Camera camera1) {
        camera = camera1;
    }

    public void run(Screen screen) {
        Window.tecScreen = this.screen = screen;

        init();
        loop();
    }

    public void init() {
        screen.show();

        // Setup an error callback
        GLFWErrorCallback.createPrint(System.err).set();

        // Initialize GLFW
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW.");
        }

        // Configure GLFW
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, 0);
        glfwWindowHint(GLFW_RESIZABLE, 1);
        glfwWindowHint(GLFW_MAXIMIZED, 1);

        // Create the window
        glfwWindow = glfwCreateWindow(this.width, this.height, this.title, NULL, NULL);
        if (glfwWindow == NULL) {
            throw new IllegalStateException("Failed to create the GLFW window.");
        }

        glfwSetCursorPosCallback(glfwWindow, MouseListener::mousePosCallback);
        glfwSetMouseButtonCallback(glfwWindow, MouseListener::mouseButtonCallback);
        glfwSetScrollCallback(glfwWindow, MouseListener::mouseScrollCallback);
        glfwSetKeyCallback(glfwWindow, KeyListener::keyCallback);
        glfwSetWindowSizeCallback(glfwWindow, ResizeListener::sizeCallback);

        // Make the OpenGL context current
        glfwMakeContextCurrent(glfwWindow);

        // Make the window visible
        glfwShowWindow(glfwWindow);

        // This line is critical for LWJGL's interoperation with GLFW's
        // OpenGL context, or any context that is managed externally.
        // LWJGL detects the context that is current in the current thread,
        // creates the GLCapabilities instance and makes the OpenGL
        // bindings available for use.
        GL.createCapabilities();

        glEnable(GL_BLEND);
        glBlendFunc(GL_ONE, GL_ONE_MINUS_SRC_ALPHA);

        screen.load();
    }

    public void loop() {
        float beginTime = (float)glfwGetTime();
        float endTime;
        float dt = -1.0f;

        while (!glfwWindowShouldClose(glfwWindow)) {
            // Poll events
            glfwPollEvents();

            glClear(GL_COLOR_BUFFER_BIT);

            screen.draw(dt);

            glfwSwapBuffers(glfwWindow);

            endTime = (float)glfwGetTime();
            dt = endTime - beginTime;
            beginTime = endTime;
        }
    }

    public void close() {
        screen.dispose();

        // Free the memory
        glfwFreeCallbacks(glfwWindow);
        glfwDestroyWindow(glfwWindow);

        // Terminate GLFW and the free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    /* Getters */
    public Screen getScreen() {
        return screen;
    }

    public long getId() {
        return glfwWindow;
    }

    public float getOpacity() {
        return glfwGetWindowOpacity(glfwWindow);
    }

    /* Setters */
    public void setIcon(String path16, String path32) {
        ByteBuffer icon16;
        ByteBuffer icon32;

        try {
            icon16 = IOUtil.ioResourceToByteBuffer(path16, 2048);
            icon32 = IOUtil.ioResourceToByteBuffer(path32, 4096);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        IntBuffer w = MemoryUtil.memAllocInt(1);
        IntBuffer h = MemoryUtil.memAllocInt(1);
        IntBuffer comp = MemoryUtil.memAllocInt(1);

        try ( GLFWImage.Buffer icons = GLFWImage.malloc(2) ) {
            ByteBuffer pixels16 = STBImage.stbi_load_from_memory(icon16, w, h, comp, 4);
            icons
                 .position(0)
                 .width(w.get(0))
                 .height(h.get(0))
                 .pixels(pixels16);

            ByteBuffer pixels32 = STBImage.stbi_load_from_memory(icon32, w, h, comp, 4);
            icons
                 .position(1)
                 .width(w.get(0))
                 .height(h.get(0))
                 .pixels(pixels32);

            icons.position(0);
            glfwSetWindowIcon(glfwWindow, icons);

            STBImage.stbi_image_free(pixels32);
            STBImage.stbi_image_free(pixels16);
        }
    }

    public void setVSync(boolean isOn) {
        if(isOn) glfwSwapInterval(1);
        else glfwSwapInterval(0);
    }

    public void setTitle(String name) {
        glfwSetWindowTitle(glfwWindow, name);
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setPosition(int xPos, int yPos) {
        glfwSetWindowPos(glfwWindow, xPos, yPos);
    }

    public void setOpacity(float level) {
        glfwSetWindowOpacity(glfwWindow, level);
    }
}
