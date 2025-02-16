package com.wipro.java.designpattern.factories;

import com.wipro.java.designpattern.buttons.Button;
import com.wipro.java.designpattern.buttons.MacOSButton;
import com.wipro.java.designpattern.checkboxes.CheckBox;
import com.wipro.java.designpattern.checkboxes.MacOsCheckBox;

/**
 * Each concrete factory extends the basic factory and is responsible for creating
 * products of a single variety.
 */
public class MacOsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOsCheckBox();
    }
}
