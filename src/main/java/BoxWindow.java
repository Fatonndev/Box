public class BoxWindow {
    public String appName;
    public BoxApp appWindow;

    public int appHeight;
    public int appWidth;

    public BoxWindow(String name) {
        this(name, 800, 500);
    }

    public BoxWindow(int width, int height) {
        this("Box Application", width, height);
    }

    public BoxWindow(String name, int width, int height) {
        this.appName = name;
        this.appWidth = width;
        this.appHeight = height;
    }

    public void run() {
        BoxApp.setWinName(this.appName);

        BoxApp.setWinWidth(this.appWidth);
        BoxApp.setWinHeight(this.appHeight);

        new Thread(() -> {
            BoxApp.run(this);
        }).start();
    }
}
