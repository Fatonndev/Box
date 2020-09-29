
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(final Stage stage) {

        Button buttonURL = new Button("Load site");
        Button buttonHtmlString = new Button("Load HTML str");
        Button buttonHtmlFile = new Button("Load HTML File");

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        buttonURL.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String url = "https://google.com";
                webEngine.load(url);
            }
        });

        buttonHtmlString.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String html = "<html><h1>Hello</h1><h2>Hello</h2></html>";
                // Load HTML String
                webEngine.loadContent(html);
            }
        });
        buttonHtmlFile.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    File file = new File("C:/test/a.html");
                    URL url = file.toURI().toURL();
                    System.out.println("Local URL: " + url.toString());
                    webEngine.load(url.toString());
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            }
        });

        HBox buttons = new HBox();
        buttons.setPadding(new Insets(5));
        buttons.setSpacing(5);
        buttons.getChildren().addAll(buttonURL, buttonHtmlString, buttonHtmlFile);

        VBox root = new VBox();
        root.getChildren().addAll(buttons, browser);

        Scene scene = new Scene(root);

        stage.setTitle("Box Test");
        stage.setScene(scene);
        stage.setWidth(450);
        stage.setHeight(300);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}