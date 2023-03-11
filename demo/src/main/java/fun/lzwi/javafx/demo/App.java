package fun.lzwi.javafx.demo;

import fun.lzwi.javafx.demo.sub.Demo;
import fun.lzwi.javafx.element.ELResources;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
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
        Hyperlink lite = new Hyperlink("View Lite");
        lite.setOnAction(e -> stage.setScene(Demo.get()));
        VBox vBox = new VBox(label, lite);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox, 540, 360);
        scene.getStylesheets().add(ELResources.loadStyle().toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Element-FX Demo");
        stage.getIcons().add(new Image(
                Launcher.class.getClassLoader().getResource("img/element-fx-logo-small.png").toExternalForm()));
        stage.show();
    }
}