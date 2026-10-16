package com.pluralsight;
import java.util.*;
public class pointOfSale {
    public static void main(String[] args) {

        //Create copy of scanner
        Scanner input = new Scanner(System.in);

        //Ask the user if they want regular or large sandwich
        System.out.println("1: Regular: base price $5.45\n" +
                "2: Large: base price $8.95: ");
        int foodOrder = input.nextInt();
    }
}
