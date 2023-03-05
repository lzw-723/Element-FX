package fun.lzwi.javafx.element.base;

import fun.lzwi.javafx.element.ELResources;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.util.Duration;

public class ELButton extends Button {
    private static final String DEFAULT_STYLE_CLASS = "el-button";
    private static final String USER_AGENT_STYLESHEET = ELResources.load("css/el-button.css").toExternalForm();
    private static final PseudoClass PSEUDO_CLASS_CANCEL = PseudoClass.getPseudoClass("cancel");

    public enum State {
        none, primary, success, info, warning, danger
    }

    public enum Type {
        none, plain, round, circle
    }

    /**
     * 
     */
    public ELButton() {
        init();
    }

    private void init() {
        getStyleClass().setAll(DEFAULT_STYLE_CLASS);
        Animation transition = new Transition() {
            double size;
            {
                size = getFont().getSize();
                setCycleDuration(Duration.millis(200));
            }

            @Override
            protected void interpolate(double frac) {
                // ELButton.this.setFont(new Font(frac * size));
                // setBorder(new Border(new BorderStroke()));
            }

        };
        addEventHandler(ActionEvent.ACTION, e -> transition.play());
    }

    /**
     * @param text
     * @param graphic
     */
    public ELButton(String text, Node graphic) {
        super(text, graphic);
        init();
    }

    /**
     * @param text
     */
    public ELButton(String text) {
        super(text);
        init();
    }

    @Override
    public String getUserAgentStylesheet() {
        return USER_AGENT_STYLESHEET;
    }
}
