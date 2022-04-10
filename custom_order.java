// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
    //  System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	Scanner keyboard = new Scanner (System.in);  

	 
    // Introduce shop and prompt user to input first name
	String firstName;
	String itemOrder;
	String frostingType;
	String fillingType;
	String toppings;
	String input;
	
	double cost = 15.00;
	final double TAX_Rate = .08;
	double tax;
	
	// STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
	
	System.out.print("What is your firstname? ");
	firstName = keyboard.nextLine();
	
	System.out.print(firstName + " please see our MENU bellow: ");
	System.out.print("\n");
	
	// STEP 4 DISPLAY MENU
	
	System.out.println("_________________________________________");
	System.out.println("     MENU     QUANTITY     BASE COST     ");
	System.out.println("_________________________________________");
	System.out.println("     Cake     1     $15     ");
	System.out.println("     Set of cupcake     6     $15");
	System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
	System.out.println("Froststing (Vanilla, chocolate, strawberry, coco)");
	System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
	System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
	System.out.println("_________________________________________");
	
	// STEP 5 PROMPT USER TO ORDER
	
	System.out.println("Do you want CAKE or CUPCAKES?");
	itemOrder = keyboard.nextLine();
	
	// STEP 6 PROMPT USER TO CHOOSE FROSTING
	
	System.out.println("What type of FROSTING do you want? ");
    System.out.println("Vanilla, Chocolate, Strawberry or Coco");
    frostingType = keyboard.nextLine();
	
	// STEP 7 PROMPT USER TO CHOOSE FILLING
	
	System.out.println("What type of FILLING do you want? ");
	System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
	fillingType = keyboard.nextLine();
	
	// STEP 8 PROMPT USER TO CHOOSE TOPPINGS
	
	System.out.println("What type of TOPPINGS do you want? ");
	System.out.println("Sprinkles, Cinnamon, Cocoa, Nuts");
	toppings = keyboard.nextLine();
	
	
	// Introduce shop and promt user to input firstName
	
	System.out.println("Welcome to java's cake ande cupcake shop");
	System.out.println("we make cutom cakes with our secret cake better");
	System.out.println();
	System.out.println(firstName + " , your order is as follows: ");
	System.out.println("_________________________________________");
	System.out.println("Item ordered: " + itemOrder);
	System.out.println("Froststing: " + frostingType);
	System.out.println("Fillings: " + fillingType);
	System.out.println("Toppings:" + toppings);
	System.out.println("_________________________________________");
	
	//cost and sales tax of your order
	
	System.out.printf("The cost of your is: $%2f\n", cost );
	tax = cost * TAX_Rate;
	System.out.printf("The tax is: $%2f\n", tax);
	System.out.printf("The total due is: $%2f\n", (tax + cost));
	   
    // TEST CODE
      

  
    }   
}