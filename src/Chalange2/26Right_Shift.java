package Chalange2;

import java.util.Scanner;

class Right_Shift {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to showcase RightShift Operator\n");
   System.out.print("Please enter your number ");
   int num = input.nextInt();

   int result = num >> 1;
   System.out.println("Your result is: " + result);
  }
}
