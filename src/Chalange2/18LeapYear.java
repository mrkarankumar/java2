package Chalange2;

import java.util.Scanner;

class LeapYear {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("welcome to new year calculator\n");
   System.out.println("please enter the year that you want to  check:");
   int year = input.nextInt();
   if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )){
    System.out.println("your year is a leap year ");
//   } else if (year % 100 == 0) {
//    System.out.println("your year is not a leap,year ");
//
//   } else if (year % 4 == 0 && year % 100 != 0) {
//    System.out.println("your year is a leap year ");
   }else {
    System.out.println("your year is not a leap,year ");
   }

  }
}
