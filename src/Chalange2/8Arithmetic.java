package Chalange2;

import java.util.Scanner;

class Arithmetic {

  public static void main(String[] args) {

   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Arithmetic Operator\n");
   System.out.println("Please Enter your First number");
   int first = input.nextInt();
   System.out.println("Please Enter your second number");
   int second = input.nextInt();

   int add = first + second;
   int sub = first - second;
   int mul = first * second;
   int div = first / second;
   int mod = first % second;
   System.out.println("my Addition number is :" +add);
   System.out.println("my Subtraction number is :" +sub);
   System.out.println("my Multiplication number is :" +mul);
   System.out.println("my Division number is :" +div);
   System.out.println("my Modulus number is :" +mod);

  }
}
