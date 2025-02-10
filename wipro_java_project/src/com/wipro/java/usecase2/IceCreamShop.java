package com.wipro.java.usecase2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//main Class
public class IceCreamShop {
 public static void main(String[] args) {
     // Using List to Store IceCream Objects
     List<IceCream> iceCreamList = new ArrayList<>();
     iceCreamList.add(new ConeIceCream("Vanilla", 4.5, "Medium", "Waffle Cone"));
     iceCreamList.add(new ConeIceCream("Chocolate", 5.0, "Large", "Sugar Cone"));
     iceCreamList.add(new CupIceCream("Strawberry", 4.0, "Small", "Chocolate Chips"));
     iceCreamList.add(new CupIceCream("Mango", 3.8, "Medium", "Nuts"));

     // Using Streams & Lambda to Filter Ice Creams with Price > $4
     System.out.println("Ice Creams priced above Rs.4.00:");
     iceCreamList.stream()
             .filter(i -> i.getPrice() > 4)
             .forEach(i -> i.IceCreamDetails()); // Corrected here

     // Using Map to Store and Retrieve Ice Creams by Flavor
     Map<String, IceCream> iceCreamMap = iceCreamList.stream()
             .collect(Collectors.toMap(IceCream::getFlavor, i -> i, (i1, i2) -> i1));

     // Displaying Map Entries
     System.out.println("Ice Creams Stored in Map:");
     iceCreamMap.forEach((flavor, iceCream) -> {
         System.out.print(flavor + " -> ");
         iceCream.IceCreamDetails();
     });

     // Sorting Ice Creams by Price using Comparator & Streams
     System.out.println("Sorted Ice Creams by Price:");
     iceCreamList.stream()
             .sorted(Comparator.comparingDouble(IceCream::getPrice))
             .forEach(i -> i.IceCreamDetails()); 
 }
}
