package Chalange2;

import java.util.Scanner;

class OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd even calculator  ");
        System.out.println("please enter your number:");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("your number is an even  number  ");
        } else {
            System.out.println("your number is a odd number ");



        }


    }
}
