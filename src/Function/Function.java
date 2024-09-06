package Function;

public class Function {
    public static void main(String[] args) {
//        System.out.println("in maim method ");
//        greetUser();
//        System.out.println("method calling complete by karan coder ");
//        greetUser();
//        greetUser();
        printFirstPattern();
//        printSecondPattern();
//        printThirdPattern();


    }
    public  static  void printThirdPattern(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
    public  static void printSecondPattern(){
        System.out.println("* * * * *");
        System.out.println("* * * * ");
        System.out.println("* * * ");
        System.out.println("* * ");
        System.out.println("* ");
    }
    public  static  void printFirstPattern(){
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *");

        int rows = 0;
        while (rows < 5){
            System.out.print("*");

            int i = 0;
            while (i< rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }



    }

    public static void  greetUser(){
        System.out.println("welcome good  morning my cute brother ");

    }
}
