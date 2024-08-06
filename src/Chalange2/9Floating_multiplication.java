package Chalange2;

import java.util.Scanner;

class Floating_multiplication {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("We are doing floating multiplication\n");
   System.out.println("Please enter yur first decimal number: ");
   double first = input.nextDouble();
   System.out.println(first);

   System.out.println("Please enter yur second decimal number: ");
   double second = input.nextDouble();
   System.out.println(second);
   double mul = first * second;
   System.out.println("\n my result is :" + mul);

  }
}
