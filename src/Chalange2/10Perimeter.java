package Chalange2;

import java.util.Scanner;

class Perimeter {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to perimeter calculator");
   System.out.print("please enter all 4 sides cms: ");
   double a = input.nextDouble();
   double b = input.nextDouble();
   double c = input.nextDouble();
   double d = input.nextDouble();
   double  perimeter = a+b+c+d;
   System.out.println("Perimeter of your rectangle is  :" +perimeter +"cm");



  }
}
