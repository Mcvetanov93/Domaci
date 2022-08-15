package Nedelja3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean uslov=true;
        ArrayList <Integer> brojevi=new ArrayList<Integer>();
        while(uslov){
            System.out.println("Unesite brojeve za prosek ili 0 za prekid");
            int x= sc.nextInt();
            if (x==0){
                uslov=false;
            }

            brojevi.add(x);


        }
        int zbirbrojeva=0;
        for (var elementi:brojevi){
            zbirbrojeva=zbirbrojeva+elementi;
        }
        int brBrojeva=brojevi.size()-1;
        double prosek= (double)zbirbrojeva/(double) brBrojeva*1.00;
        System.out.println(prosek);

    }
}
