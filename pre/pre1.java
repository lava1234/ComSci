package com.pre;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by udeshya on 26/01/2017.
 */
public class pre1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int weight = 0;
        int length = 0;
        int width = 0;
        int height = 0;
        boolean fail = false;
        int sum = 0;
        System.out.print("What is the weight of the parcel (kg)");
        while(true) {
            try {
                weight = s.nextInt();
                if (weight > 10 || weight < 1){
                    System.out.println("The weight does not fall between 10kg and 1kg");
                    fail = true;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a number");
                s.next();
            }
        }
        while(true) {
            System.out.print("What is the height of the parcel (cm) ");
            try {
                height = s.nextInt();
                if (height > 80){
                    System.out.println("That is too tall");
                    fail = true;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a number");
                s.next();
            }
        }
    while(true) {
        System.out.print("What is the length of the parcel (cm) ");
        try {
            length = s.nextInt();
            if (length > 80){
                System.out.println("That is too long");
                fail = true;
            }
            break;
        } catch (InputMismatchException e) {
            System.out.println("That is not a number");
            s.next();
        }
    }
        while(true) {
            System.out.print("What is the width of the parcel (cm) ");
            try {
                width = s.nextInt();
                if (width > 80){
                    System.out.println("That is too wide");
                    fail = true;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a number");
                s.next();
            }
            sum = length + width + height;
        }
        if (sum > 200){
            System.out.println("The sum of all the dimensions is too big");
            fail = true;
        }
        if (fail){
            System.out.println("The parcel has been rejected because of the above errors");
        }else {
            System.out.println("This parcel has been accepted");
        }

    }


}
