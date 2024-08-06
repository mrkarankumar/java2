package Chalange2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("Please enter your first number: ");
        int firstNum = input.nextInt();
        System.out.println("Please enter your second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("sum of your number is: " +sum);


    }
}
