package Chalange2;

import java.util.Scanner;

class PositiveNegativeZero {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("welcome to number checker ");
   System.out.println("please enter your number ");
   int num = input.nextInt();
   if (num > 0 ){
    System.out.println("your number is positive ");
   } else if (num  == 0) {
    System.out.println("your number is zero ");
    
   }else {

    System.out.println("your number is negative ");
   }


  }

}
