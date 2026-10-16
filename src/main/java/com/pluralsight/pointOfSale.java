package com.pluralsight;
import java.util.*;
public class pointOfSale {
    public static void main(String[] args) {

        //Create copy of scanner
        Scanner input = new Scanner(System.in);

        double totalPrice;

        //Ask the user if they want regular or large sandwich
        System.out.print("1: Regular: base price $5.45\n" +
                "2: Large: base price $8.95: ");
        int foodOrder = input.nextInt();
//        Prompt the user if they would like the sandwich "loaded" (yes/no). If so there is an
//        additional cost for a loaded sandwich
//        a. Regular: $1.00
//        b. Large: $1.75
        System.out.print("Do you want your sandwich loaded (y/n):");
        char loadSandwich = input.next().charAt(0);

        //Ask the user their age
        System.out.print("What is your age: ");
        int userAge = input.nextInt();

        //If user is under the age 17 add a discount of 10%
        if (userAge < 17){
            if (foodOrder == 1){
                if(loadSandwich == 'y'){
                    totalPrice = (5.45 - (5.45 * .10)) + 1;
                    //System.out.println("Sandwich Total: " + totalPrice);
                }else {
                    totalPrice = (5.45 - (5.45 * .10));
                    //System.out.println("Sandwich Total: " + totalPrice);
                }
            }else{
                if (loadSandwich == 'y'){
                    totalPrice = (8.95 - (8.95 * .10)) + 1.75;
                    //System.out.println("Sandwich Total: " + totalPrice);
                }else {
                    totalPrice = 8.95 - (8.95 * .10);
                    //System.out.println("Sandwich Total: " + totalPrice);
                }
            }
        //else user is older than 65 add 20%
        } else if (userAge > 65) {
            if (foodOrder == 1){
                if(loadSandwich == 'y'){
                    totalPrice = (5.45 - (5.45 * .20)) + 1;
                    //System.out.println("Sandwich Total: " + totalPrice);
                }else {
                    totalPrice = (5.45 - (5.45 * .20));
                    //System.out.println("Sandwich Total: " + totalPrice);
                }
                //totalPrice = 5.45 - (5.45 * .20);
                //System.out.println("Sandwich Total: " + totalPrice);
            }else{
                if(loadSandwich == 'y'){
                    totalPrice = (8.75 - (8.95 * .20)) + 1.25;
                    //System.out.println("Sandwich Total: " + totalPrice);
                }else {
                    totalPrice = (8.95 - (8.95 * .20));
                    //System.out.println("Sandwich Total: " + totalPrice);
                }
                //totalPrice = 8.85 - (8.95 * .20);
                //System.out.println("Sandwich Total: " + totalPrice);
            }
        //Else they do not get discount
        }else{
            if (foodOrder == 1){
                if(loadSandwich == 'y'){
                    totalPrice = 5.45 + 1;
                    //System.out.println("Sandwich Total: " + totalPrice);
                }else {
                    totalPrice = 5.45;
                    //System.out.println("Sandwich Total: " + totalPrice);
                }
                //totalPrice = 5.45;
                //System.out.println("Sandwich Total: " + totalPrice);
            }else{
                if(loadSandwich == 'y'){
                    totalPrice = 8.95 + 1;
                    //System.out.println("Sandwich Total: " + totalPrice);
                }else {
                    totalPrice = 8.95;
                    //System.out.println("Sandwich Total: " + totalPrice);
                }

                //System.out.println( + totalPrice);
            }

        }
        System.out.println("Sandwich Total: " + totalPrice);

    }
}
