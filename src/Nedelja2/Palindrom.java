package Nedelja2;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println(Palindrom1(x));


    }

    public static boolean Palindrom1(String x) {
        String prvi = "";
        boolean uslovPalindroma;



            for (int i = x.length()-1; i >= 0; i--) {
                prvi = prvi + x.charAt(i);
            }
        uslovPalindroma = prvi.equals(x);

        return uslovPalindroma;


    }
}
