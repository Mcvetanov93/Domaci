package Nedelja2;

import java.util.Scanner;

public class zadatk2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String u = sc.nextLine();
        int o = sc.nextInt();

        sc.nextLine();

        System.out.println(repeat(u, o));
        System.out.println(row(u, o));


    }

    public static String repeat(String x, int y) {

        String ispisano = "";
        for (int i = 0; i < y; i++) {
            ispisano = ispisano + x;

        }
        return ispisano;


    }


    public static String row(String x, int y) {

        for (int i = 0; i < y; i++) {


            System.out.println(x);


        }
        return x;


    }
}