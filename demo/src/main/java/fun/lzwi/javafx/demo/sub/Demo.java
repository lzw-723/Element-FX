package fun.lzwi.javafx.demo.sub;

import java.io.IOException;

import fun.lzwi.javafx.demo.Launcher;
import fun.lzwi.javafx.element.ELResources;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class Demo {

    public static Scene get() {
        try {
            FXMLLoader loader = new FXMLLoader(Launcher.class.getClassLoader().getResource("fxml/demo.fxml"));
            Scene scene = new Scene(loader.load(), 640, 480);
            scene.getStylesheets().add(ELResources.loadStyle().toExternalForm());
            return scene;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
