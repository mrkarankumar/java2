package com.dbu.loops;

public class Reverse_Number {

    public static void main(String[] args) {

        int  num = 12356;
        int reverse =0;

        while (num > 0){
            int rem = num % 10;
            reverse = reverse*10+rem;
            num= num / 10;

        }
        System.out.println("reverse no "+ reverse);

    }

}
