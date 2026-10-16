package com.pluralsight;
import java.util.*;
public class pointOfSale {
    public static void main(String[] args) {

        //Create copy of scanner
        Scanner input = new Scanner(System.in);

        double totalPrice, discount;

        //Ask the user if they want regular or large sandwich
        System.out.println("1: Regular: base price $5.45\n" +
                "2: Large: base price $8.95: ");
        int foodOrder = input.nextInt();

        //Ask the user their age
        System.out.println("What is your age:");
        int userAge = input.nextInt();

        if (userAge < 17){
            if (foodOrder == 1){
                totalPrice = 5.45 - (5.45 * .10);
                System.out.println(totalPrice);
            }else{
                totalPrice = 8.95 - (8.95 * .10);
                System.out.println(totalPrice);
            }

        } else if (userAge > 65) {
            if (foodOrder == 1){
                totalPrice = 5.45 - (5.45 * .20);
                System.out.println(totalPrice);
            }else{
                totalPrice = 8.85 - (8.95 * .20);
                System.out.println(totalPrice);
            }

        }else{
            if (foodOrder == 1){
                totalPrice = 5.45;
                System.out.println(totalPrice);
            }else{
                totalPrice = 8.95;
                System.out.println(totalPrice);
            }


        }




        // Student (17 years old or younger) – receive a 10% discount
        // Seniors (65 years old or older) – receive a 20% discount
        // Everyone else won't receive a discount
    }
}
