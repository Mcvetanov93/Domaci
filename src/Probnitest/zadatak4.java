package Probnitest;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite 1 za sabiranje ili 2 za oduzimanje");
    double x = sc.nextDouble();
    double y;
    boolean uslov;
    double rezultat = 0;
         if (x == 1) {
        while (uslov=true) {
            y = sc.nextDouble();
            rezultat = rezultat + y;
        }
    }
         else if (x == 2) {
        while (uslov = true) {
            y = sc.nextDouble();
            rezultat = rezultat - y;

        }
    }
         else{
        System.out.println("Niste uneli 1 ili 2");
    }
         System.out.println(rezultat);
    }
}
