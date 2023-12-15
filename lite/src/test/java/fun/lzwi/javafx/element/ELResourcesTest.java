package fun.lzwi.javafx.element;

import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class ELResourcesTest {

    @Test
    void version() {
        // 测试时为空
        assertNull(ELResources.version());
    }

    @Test
    void load() {
        URL load = ELResources.load("css/element.css");
        assertNotNull(load);
    }

    @Test
    void loadStyle() {
        URL style = ELResources.loadStyle();
        URL load = ELResources.load("css/element.css");
        assertNotNull(style);
        assertEquals(load, style);
    }
}