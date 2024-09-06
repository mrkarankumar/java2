package Chalange2;

import java.util.Scanner;

class Grading {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to grade calculator\n");
   System.out.println("please inter your percentage :");
   float percentage = input.nextFloat();
   if (percentage >= 90){
    System.out.println("grate, you have got A");
   } else if (percentage >= 75) {

    System.out.println("good, you have got B");
   } else if (percentage >= 60) {
    System.out.println("you have got c, work harder next time ");
    
   } else if (percentage >= 30) {
    System.out.println("you have got d. you are seriously  need to hard work  ");
    
   }else {

    System.out.println("sorry you are fail ,yoy need to most hard work ");
   }


  }

}
