package com.wipro.java.designpattern.buttons;

/**
* All product families have the same varieties (MacOS/Windows).
*
* This is a MacOS variant of a button.
*/
public class MacOSButton implements Button {

   @Override
   public void paint() {
       System.out.println("You have created MacOSButton.");
   }
}
