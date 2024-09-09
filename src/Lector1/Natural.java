package Lector1;


import java.util.Scanner;

public class  Natural{

        public static void main (String [] args ){

            System.out.print("please enter your natural number ");
            Scanner r= new Scanner (System.in);

            int n= r.nextInt();
            for(int i = 1; i<= n; i++){

                System .out.print(i+" ");
            }


        }


    }

