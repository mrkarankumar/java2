package Chalange2;

import java.util.Scanner;

 class Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("welcome to  multiplication  table ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter  your number:");
        int num = scanner.nextInt();
        print_Multiplication_Table(num);

    }

    public  static  void  print_Multiplication_Table( int num ){
        int i =1;
        while (i <= 10){

            System.out.println(num + "X" + i + "=" + (num * i));
            i++;


        }



    }

}
