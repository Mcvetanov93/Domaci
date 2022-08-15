package Probnitest;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int x= sc.nextInt();

            int konacnaCifra=0;
            int broj1=0;
            for (int i=0;i<=x;i++){
                konacnaCifra=konacnaCifra+(x*x--);
                System.out.println(x*x--);


            }

            System.out.println(konacnaCifra);
    }
}
