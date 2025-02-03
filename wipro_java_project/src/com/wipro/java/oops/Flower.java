/**
 * 
 */
package com.wipro.java.oops;

/**
 * @author Sankeerth reddy
 *
 */
public class Flower {
	//properities and behaviours
	//name, color
	//rose, red
	//lotus, pink
	
	//member variables
	String nameValue;//data type-->string
	String colorValue;//data type--> string
     
	//constructor
	Flower(String name, String color) {
		this.nameValue=name;
		this.colorValue=color;
		
	}
	//method--> combination of propeerities & nehaviours
	void display() {
		System.out.println("Flower name:"+nameValue+"Flower color"+colorValue);
	}

//main-- method	
	public static void main(String args[]) {
		// Initializing color strings directly
        String red = "red";
        String pink = "pink";
		//object is instance of a Class
		//rose is a instance of flower
		//rose is type of flower
		//Class objectname=new Constructor(parameters)
		Flower flowerobject1=new Flower("rose", red);
		Flower flowerobject2=new Flower("lotus", pink);
		flowerobject1.display();
		flowerobject2.display();
		
	}

}
