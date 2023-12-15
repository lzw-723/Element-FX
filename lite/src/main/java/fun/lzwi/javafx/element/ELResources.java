package fun.lzwi.javafx.element;

import java.net.URL;

public class ELResources {

    public static String version() {
        return ELResources.class.getPackage().getImplementationVersion();
    }

    public static URL load(String path) {
        return ELResources.class.getResource(path);
    }

    public static URL loadStyle() {
        return load("css/element.css");
    }
}
