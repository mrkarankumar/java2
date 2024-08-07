package Lector1;

import java.util.Scanner;

public class Relational {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to drive licence ");
        System.out.println("please enter your age :");
        int age = input.nextInt();

        if (age >=18){
            System.out.println("you are eligible to drive licence");

        }  else {

            System.out.println("not drive to moter cycle but cycle is drive ");

        }

    }

}
