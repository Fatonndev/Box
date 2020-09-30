import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class BoxApp extends Application {
    public static BoxApp current;
    public static BoxWindow currentApp;

    private static String windowName = "Box application";
    private static int windowWidth = 800;
    private static int windowHeight = 400;

    public WebView browser;
    public Stage mainStage;

    public static void setWinWidth(int value) {
        if (current != null) {
            current.browser.setPrefWidth(value);
        }

        windowWidth = value;
    }

    public static void setWinHeight(int value) {
        if (current != null) {
            current.browser.setPrefHeight(value);
        }

        windowHeight = value;
    }

    public static void setWinName(String value) {
        if (current != null) {
            current.mainStage.setTitle(value);
        }

        windowName = value;
    }

    public static void run(BoxWindow app) {
        currentApp = app;
        launch();
    }

    @Override
    public void start(Stage stage) {
        currentApp.appWindow = this;
        current = this;
        mainStage = stage;

        WebView browser = new WebView();
        Scene scene = new Scene(browser);

        scene.widthProperty().addListener(new ChangeListener<Number>() {
            @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
                browser.setPrefWidth((Double) newSceneWidth);
            }
        });
        scene.heightProperty().addListener(new ChangeListener<Number>() {
            @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
                browser.setPrefHeight((Double) newSceneHeight);
            }
        });
        stage.setScene(scene);

        stage.setTitle(windowName);
        stage.setWidth(windowWidth);
        stage.setHeight(windowHeight);

        stage.show();
    }
}
