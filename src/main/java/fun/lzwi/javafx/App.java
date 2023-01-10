package fun.lzwi.javafx;

import fun.lzwi.javafx.element.ELResources;
import fun.lzwi.javafx.element.base.ELButton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = SystemInfo.javaVersion();
        String javafxVersion = SystemInfo.javafxVersion();

        Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Button button = new Button(javafxVersion);
        Scene scene = new Scene(new StackPane(new StackPane(label)), 640, 480);
        scene.getStylesheets().add(ELResources.load("css/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}