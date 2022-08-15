package Nedelja2;

import java.util.Scanner;

public class DomaciSreda3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();
        System.out.println(veciliimanji(x,y));


    }
    public static String veciliimanji(int x, int y){
        String rezultat="";
        if (x>y){
            rezultat="Broj je veci od drugog broja";
        }
        else if (x<y){
            rezultat="Broj je manji od drugog broja";
        }
        else {
            rezultat="Broj je jednak drugom broju";
        }
        return rezultat;
    }
}
