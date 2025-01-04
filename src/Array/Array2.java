package Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {89,90,44,32,12,56,77,99,900,456,51,311,566,76,};
        System.out.println("welcome to searching array:");
        System.out.println("enter your want the search number ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound){
            System.out.println("your number was found in your array ");

        } else {

            System.out.println("your number was not found  array");
        }

    }
    public  static  boolean isFound(int[] arr, int num){
        int index = 0;
        while (index < arr.length){
            if (arr[index] == num)
                return true;
            index++;

        }
        return  false;
    }

}
