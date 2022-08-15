package Nedelja2;

import java.util.Scanner;

public class DomaciSreda2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(armstrongovBroj(x));

    }

    public static boolean armstrongovBroj(int x) {
        boolean brojjesteilinije;

        int I = x / 100;
        int II = (x % 100) / 10;
        int III = (x % 100) % 10;
        brojjesteilinije = (Math.pow(I, 3) + Math.pow(II, 3) + Math.pow(III, 3)) == x;
        return brojjesteilinije;

    }
}
