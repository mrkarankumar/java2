package Chalange2;

import java.util.Scanner;

class SimpleInterest {

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to simple Interest calculator\n");
  System.out.println("please enter principle amount rs");
  int principle = input.nextInt();
  System.out.println("Now tell me  your rate of interest:");
  float rate = input.nextFloat();
  System.out.println("Now tell me your  brr");
  float years = input.nextFloat();

  float interest = (principle * rate *years)/100;
  System.out.println("\n\n your simple interest :" +interest);



 }
}