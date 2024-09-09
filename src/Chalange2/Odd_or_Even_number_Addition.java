package Chalange2;

import java.util.Scanner;

public class Odd_or_Even_number_Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to even or odd number to by calculate to the sum : ");
        int karan= input.nextInt();
        int sum=0;
        if (karan%2==0){
            for (int i=0;i<=karan;i=i+2){
                sum=sum+i;
            }
            System.out.println("sum of even number "+sum);
        }
        else {
            for (int i=1; i<=karan;i=i+2){
                sum=sum+i;
            }
            System.out.println("sum of odd number "+sum);
        }
    }
}
