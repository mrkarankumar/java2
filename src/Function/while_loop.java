package Function;

public class while_loop {

    public static void main(String[] args) {
        System.out.println("welcome to while loop");
        print1();

    }
    public  static  void  print1() {

        int rows = 0;
        while (rows < 5){
            System.out.print("*");

            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;

        }


    }
}