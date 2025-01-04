package com.dbu.loops;

public class Nested_ForEx {

    public static void main(String[] args) {
//        int count = 0;
//
//        for (int i = 1; i <= 4; i++) {
//
//            for (int j = 1; j <= 4; j++){
//
//
//                System.out.print("*  ");
////                count++;
//            }

        for (int i =0; i <=4; i++){
            for(int j = 0; j <= 4; j++){
                if(i==0 || i==4 || j==0 || j==4){
                    System.out.print("*  ");

            } else {

                System.out.print("   ");

            }


        }
            System.out.println();
        }

    }
}