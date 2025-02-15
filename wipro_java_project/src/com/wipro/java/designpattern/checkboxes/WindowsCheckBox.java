package com.wipro.java.designpattern.checkboxes;

/**
 * All product families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkBox.
 */
public class WindowsCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
