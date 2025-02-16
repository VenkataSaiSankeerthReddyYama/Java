package com.wipro.java.designpattern.factories;

import com.wipro.java.designpattern.buttons.*;
import com.wipro.java.designpattern.checkboxes.CheckBox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}