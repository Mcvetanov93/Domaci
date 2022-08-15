package Nedelja2;

import java.util.Scanner;

public class domacisreda1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite godinu");
        int x= sc.nextInt();
        System.out.println(prestupnaGodina(x));

        }

    public static boolean prestupnaGodina(int x){
        boolean prestupna;
        if (x%400==0){
            prestupna=true;
        } else if (x%4==0 && x%100!=0) {
            prestupna=true;
        }
        else {prestupna=false;}
        return prestupna;
    }
}
