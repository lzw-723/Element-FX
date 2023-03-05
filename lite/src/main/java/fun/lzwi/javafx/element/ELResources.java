package fun.lzwi.javafx.element;

import java.net.URI;
import java.net.URL;

public class ELResources {
    public static URL load(String path) {
        return ELResources.class.getResource(path);
    }
}
