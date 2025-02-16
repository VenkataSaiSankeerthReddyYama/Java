package com.wipro.java.designpattern.app;

import com.wipro.java.designpattern.buttons.Button;
import com.wipro.java.designpattern.checkboxes.CheckBox;
import com.wipro.java.designpattern.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
