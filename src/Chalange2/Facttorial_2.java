package Chalange2;

import java.sql.SQLType;
import java.util.Scanner;

public class Facttorial_2 {
    public static void main(String[] args) {
        System.out.println("please enter your number ");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        for (int i = 1; i<= n; i++)
        {
           if (n%i ==0){

               System.out.print(i+" ");
           }
        }


    }
}
