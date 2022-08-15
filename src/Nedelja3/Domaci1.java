package Nedelja3;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> brojevi = new ArrayList<String>();

        boolean uslov=true;
        while(uslov) {
            System.out.println("Unesite parametre ");

           String x = sc.nextLine();
            if (x.equals("stop")){
                uslov=false;
            }

            brojevi.add(x);

        }
        System.out.println(funkcija(brojevi));


    }
    public static int funkcija(ArrayList<String> x){
        if (x.size()<2){
            System.out.println("Niste uneli dovoljno parametara");
        }
        int brojac=0;
        for (var elementi:x){
            if (elementi.charAt(0)==elementi.charAt(elementi.length()-1)){
                brojac++;
            }

        }
        return brojac;
    }
}
