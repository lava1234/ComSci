package com.pre;

import java.util.Scanner;

/**
 * Created by udeshya on 02/02/2017.
 */
public class pre2 {
    public static void main(String[] args) {
        int consignment;
        double cost = 0;
        double totalc = 0;
        double totalw = 0;
        int accepted = 0;
        int rejected = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Number of parcels");
        while (true) {
            try {
                consignment = s.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("That is not a valid number");
                s.next();
            }
        }
        for (int i = 0; i < consignment; i++) {
            System.out.println("********\nParcel number: " + (i+1)+ "\n********");
            double weight;
            int length;
            int width;
            int height;
            boolean fail = false;
            double sum;
            System.out.print("What is the weight of the parcel (kg)");
            while (true) {
                try {
                    weight = s.nextDouble();
                    if (weight > 10 || weight < 1) {
                        System.out.println("The weight does not fall between 10kg and 1kg");
                        fail = true;
                    }else if(weight <= 5){
                        cost += 10;
                    }else{
                        cost += 10;
                        double weightgrams = weight * 100;
                        while (weightgrams > 0){
                            weightgrams -= 100 ;
                            cost += 0.1;
                        }
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("That is not a number");
                    s.next();
                }
            }
            while (true) {
                System.out.print("What is the height of the parcel (cm) ");
                try {
                    height = s.nextInt();
                    if (height > 80) {
                        System.out.println("That is too tall");
                        fail = true;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("That is not a number");
                    s.next();
                }
            }
            while (true) {
                System.out.print("What is the length of the parcel (cm) ");
                try {
                    length = s.nextInt();
                    if (length > 80) {
                        System.out.println("That is too long");
                        fail = true;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("That is not a number");
                    s.next();
                }
            }
            while (true) {
                System.out.print("What is the width of the parcel (cm) ");
                try {
                    width = s.nextInt();
                    if (width > 80) {
                        System.out.println("That is too wide");
                        fail = true;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("That is not a number");
                    s.next();
                }
            }
            sum = length + width + height;
            if (sum > 200) {
                System.out.println("That he sum of all the dimensions is too big");
                fail = true;
            }
            if (fail) {
                System.out.println("The parcel has been rejected because of the above errors");
                rejected++;
            } else {
                System.out.println("This parcel has been accepted");
                accepted++;
                totalw += weight;
                totalc += cost;
            }
        }
        System.out.println(rejected + " parcels were rejected and " + accepted + " parcels were accepted which makes the total weight " + totalw + " kilograms");
        System.out.printf("The total cost is $%.2f", totalc);
    }
}