package com.dbu.loops;

public class Febonoci_series {

    public static void main(String[] args) {
        int num1=0;
        int num2= 1;

        for (int i=2; i<= 8; i++){

            int sum= num1+num2;
            System.out.println( "" + sum);
            num1= num2;
            num2= sum;

        }
    }
}
