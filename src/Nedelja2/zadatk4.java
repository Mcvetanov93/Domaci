package Nedelja2;

import java.util.Scanner;

public class zadatk4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String prvi = "";
        boolean uslovPalindroma;
        System.out.println(x);

//        if (prvi==x) {

            for (int i = x.length()-1; i >= 0; i--) {
                prvi = prvi + x.charAt(i);

//                uslovPalindroma = true;

            }
        System.out.println(prvi);

//        }
//        else{
//            uslovPalindroma = false;}

//        System.out.println(uslovPalindroma);




    }
}

