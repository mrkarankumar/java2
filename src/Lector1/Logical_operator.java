package Lector1;

import java.util.Scanner;

public class Logical_operator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to ticket Discount calculator ");
        System.out.println("please enter your age:");
        int age = input.nextInt();
        System.out.println("Are you a female? (true/false)");
        boolean isFemale = input.hasNextBoolean();
        if (age < 5) {
            System.out.println("you got 75% discount");

        } else  if (isFemale){

            System.out.println("you got 50% discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("you hot 25% discount");

        } else {

            System.out.println("you got no discount ");

        }


    }


}
