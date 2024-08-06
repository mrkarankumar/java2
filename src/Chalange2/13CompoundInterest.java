package Chalange2;

import java.util.Scanner;

class CompoundInterest {
  public static void main(String[] args) {

   Scanner input =new Scanner(System.in);
   System.out.println("Welcome to compound Interest calculator\n");
   System.out.println("please enter principle amount rs");
   int principle = input.nextInt();
   System.out.println("Now tell me  your rate of interest:");
   float rate = input.nextFloat();
   System.out.println("Now tell me your  brr");
   float years = input.nextFloat();
   double compoundInt = principle * Math.pow((1+ rate / 100), years);
   System.out.println("your  compound int  is rs : " +compoundInt);


  }


}
