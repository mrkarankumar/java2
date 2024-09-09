package Chalange2;

import java.util.Scanner;

public class Odd {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter your number ");
        int karan= input.nextInt();

        for (int i = 1; i<=karan; i=i+2){

            System.out.println(i);
        }

    }
}
