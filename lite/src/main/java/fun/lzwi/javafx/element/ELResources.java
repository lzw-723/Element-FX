package fun.lzwi.javafx.element;

import java.net.URL;

public class ELResources {
    
    public static String version() {
        return "0.0.1-dev";
    }

    public static URL load(String path) {
        return ELResources.class.getResource(path);
    }

    public static URL loadStyle() {
        return load("css/element.css");
    }
}
