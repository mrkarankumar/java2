package Dbu.com;

public class BloodDonation {

    public static void main(String[] args) {
        int  age = 16;
        float weight= 34.6f;
        if(age >=18){

            if(weight >=45){
                System.out.println("Allowed to the blood donation");

            }else {

                System.err.println("not allowed in the bcs of weight");
            }
        }else {

            System.err.println("not allowed in the bcs of age");
//            syntax
        }
    }
}
