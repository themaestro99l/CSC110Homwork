
package hw2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
      
            // Just a fun Introduction
        System.out.println("Are you ready to SKRAP?\n");
        
            //STEP #1 Telling the users the product, how much you can buy, and the Price  
        System.out.print("   The new cleaning item the Skrapper is $4.50\n    each customer can buy up to 35 at a time");
            //STEP #2 Prompt user to select desired quantity
        System.out.println("\n\nSelect desired amount down below.");
        
        Scanner console = new Scanner(System.in);
        int amount = console.nextInt();
        
        if (amount > 35){               // Here I use an if statement to determine whether or not the amount selected is above 35 or not  
            System.out.println("\n!!WARNING!! No more than 35 Skrappers can be purchased at once.\nAmount selected 35");      // Printing a warning that an amount was invalid so it will be considered 35
            System.out.println("Cost is $" + (35 * 4.50));   // STEP #3 Here I calculate and print the cost of the the amount selected if its greater than 35
        }  else if (amount <= 0){
            System.out.println("\n!!WARNING!! No less than 1 Skrapper can be purchased at once.\nSelected amount is 0");     //I am printing a warning using an if else statement that the amount selected is less than 0 so it will be counted as 0
            System.out.println("Cost is $" + (0 * 4.50));    // STEP #3 Here I calculate and print the cost of the amount selected if its less than or equal to 0 
        }
        else {
                 System.out.println("\nSelected amount is " + amount); // Printing the sellected amount if valid quantity
                 System.out.println("Cost is $" + (amount * 4.50)); // STEP #3 Here i calculate and print the amount selected times the price of 4.50
       }
                
 
                
                
    }
}
