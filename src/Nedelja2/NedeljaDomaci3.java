package Nedelja2;

import java.util.Scanner;

public class NedeljaDomaci3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int y= sc.nextInt();
        int z= sc.nextInt();
        int [] x={123,5463,-123,654,-123,-127,234,56};
        System.out.println(negativnih(x,y,z));


    }
    public static int negativnih(int [] x,int y,int z){


        int ukupnoNegativnih = 0;

        for (int i = y; i < z; i++) {
            if (x[i]<0) {
                ukupnoNegativnih++;
            }
        }
        return ukupnoNegativnih;

    }

    }

