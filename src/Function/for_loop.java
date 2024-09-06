package Function;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {

        System.out.println("welcome to for loop ");
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number ");
        int k = input.nextInt();

        int sum = 0;

        for(int i=1; i<=k; i++) {
            sum = sum + 4*i;
        }
            System.out.println("print sum value " + sum);

//            System.out.println(i*k);
//            System.out.println(k+" * "+1+"="+i*k);



    }
}
