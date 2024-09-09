package Chalange2;

import java.util.Scanner;

public class natural_number_addition {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("welcome to natural number calculator ");
        System.out.println("please enter your number:");
        int karan= input.nextInt();
        int sum = 0;
        for (int i= 1; i<=karan; i++){
            sum= sum+i;

        }

        System.out.println("Add this number:"+sum);

    }


}
