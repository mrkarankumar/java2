package Chalange2;

import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your character :");
        ch=input.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

            System.out.println("vowel");
        }

        else {
            System.out.println("consonant all");


        }

    }
}
