
public class Main {

//    public void start(final Stage stage) {
//
//        Button buttonURL = new Button("Load site");
//        Button buttonHtmlString = new Button("Load HTML str");
//        Button buttonHtmlFile = new Button("Load HTML File");
//
//        final WebView browser = new WebView();
//        final WebEngine webEngine = browser.getEngine();
//
//        buttonURL.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                String url = "https://google.com";
//                webEngine.load(url);
//            }
//        });
//
//        buttonHtmlString.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                String html = "<html><h1>Hello</h1><h2>Hello</h2></html>";
//                // Load HTML String
//                webEngine.loadContent(html);
//            }
//        });
//        buttonHtmlFile.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                InputStream is = Main.class.getResourceAsStream("/index.html");
//
//                Scanner s = new Scanner(is).useDelimiter("\\A");
//                String result = s.hasNext() ? s.next() : "";
//
//                webEngine.loadContent(result);
//            }
//        });
//
//        HBox buttons = new HBox();
//        buttons.setPadding(new Insets(5));
//        buttons.setSpacing(5);
//        buttons.getChildren().addAll(buttonURL, buttonHtmlString, buttonHtmlFile);
//
//        VBox root = new VBox();
//        root.getChildren().addAll(buttons, browser);
//
//        Scene scene = new Scene(root);
//
//        scene.widthProperty().addListener(new ChangeListener<Number>() {
//            @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
//                browser.setPrefWidth((Double) newSceneWidth);
//            }
//        });
//        scene.heightProperty().addListener(new ChangeListener<Number>() {
//            @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
//                browser.setPrefHeight((Double) newSceneHeight);
//            }
//        });
//
//        stage.setTitle("Box Test");
//        stage.setScene(scene);
//        stage.setWidth(450);
//        stage.setHeight(300);
//
//        stage.show();
//    }

    public static void main(String[] args) {
        BoxWindow app = new BoxWindow("Test");

        app.run();
        app.run();
    }

}