import ru.obvilion.box.Window;

public class Launcher {
    public static Window window;

    public static void main(String[] args) {
        window = Window.get();
        window.run(new GameScreen());
    }
}
