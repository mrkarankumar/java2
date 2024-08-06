package Chalange2;

import java.util.Scanner;

class FahrenheitToCelsius {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Temperature converter ");
         System.out.println("Enter your temp in f:");
         float fah = input.nextFloat();
         float cel = (fah - 32) * 5.0f/ 9.0f;
         System.out.println("your temperature is :" +cel + "c");



     }


}
