package com.wipro.java.oops.encapsulation;

public class Animal {

		public Animal(String name, int weight) {
			super();//calls the root parent class=object
			this.name = name;
			this.weight = weight;
		}
		
		private String name;
		private int weight;
		
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			
			if(weight>0) {
				this.weight=weight;
			}
			else
			System.out.println("Weight must be positive");
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	 
		
		public static void main(String a[]) {
			
			Animal p1=new Animal("Lion", 24);
			System.out.println(p1.getWeight());
			System.out.println(p1.getName());
			
			p1.setWeight(30);
			System.out.println(p1.getWeight());
			System.out.println(p1.getName());
			
			
		}
			
			
	
		
	}

