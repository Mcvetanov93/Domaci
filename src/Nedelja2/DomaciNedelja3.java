package Nedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class DomaciNedelja3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite recenicu");
        String x= sc.nextLine();
        System.out.println(obr(x));

    }
    public static String obr(String x){
        String obrnuti="";
        for (int i=x.length()-1;i>=0;i--){
            obrnuti=obrnuti+x.charAt(i);



        }
        return obrnuti;
    }
}
