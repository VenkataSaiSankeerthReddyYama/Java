package com.wipro.java.designpattern.factories;

import com.wipro.java.designpattern.buttons.Button;
import com.wipro.java.designpattern.buttons.WindowsButton;
import com.wipro.java.designpattern.checkboxes.CheckBox;
import com.wipro.java.designpattern.checkboxes.WindowsCheckBox; // Ensure correct import

/**
 * Each concrete factory extends the basic factory and is responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox(); // Ensure correct class name (capital "C")
    }
}
