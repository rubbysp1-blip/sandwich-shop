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
        if (userAge <= 17){
            //If user entered 1 place price accordingly
            if (foodOrder == 1){
                //And if they put y for yes add $1
                if(loadSandwich == 'y'){
                    totalPrice = (5.45 * (1 - .10)) + 1;
                }else {
                    totalPrice = 5.45 * (1 - .10);
                }
            }else{ //If they chose number 2 set to 8.95 with 10% or 8.95 + 1.75 plus 10%
                if (loadSandwich == 'y'){
                    totalPrice = (8.95 * (1 - .10)) + 1.75;
                }else {
                    totalPrice = 8.95 * (1 - .10);
                }

            }
        //else user is older than 65 add 20%
        } else if (userAge >= 65) {
            if (foodOrder == 1){
                if(loadSandwich == 'y'){
                    totalPrice = (5.45 * (1 - .20)) + 1;
                }else {
                    totalPrice = 5.45 * (1 - .20);
                }
            }else{
                if(loadSandwich == 'y'){
                    totalPrice = (8.95 * (1 - .20)) + 1.75;
                }else {
                    totalPrice = 8.95 * (1 - .20);
                }
            }
        //Else they do not get discount
        }else{
            //Give regular price if they do not meet conditions
            if (foodOrder == 1){
                //if they said yea 'y' then add $1
                if(loadSandwich == 'y'){
                    totalPrice = 5.45 + 1;
                }else {
                    totalPrice = 5.45;
                }

            }else{ //Section for when the user entered the number 2 and did not meet conditions
                if(loadSandwich == 'y'){
                    totalPrice = 8.95 + 1.75;
                }else {
                    totalPrice = 8.95;
                }
            }
        }
        //Print out the total price the user has to pay
        System.out.print("Sandwich Total: " + totalPrice);

    }
}
