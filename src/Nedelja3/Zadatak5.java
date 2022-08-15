package Nedelja3;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final int broj=3;
        int suma=0;
        int [][] niz=new int [broj][broj];
        for (int i = 0 ; i<niz.length;i++){
            for (int j = 0; j< niz[i].length;j++) {
                int broj1 = 0;
                System.out.print("Unesti [" + i +"]" + "[" + j+ "] - " );
                broj1 = sc.nextInt();
                niz[i][j] = broj1;

            }
        }

        for (int i = 0 ; i<niz.length;i++){
            for (int j = 0; j< niz[i].length;j++) {
                if (niz[i]==niz[j]){
                suma = suma + niz[i][j];}
            }

        }

        System.out.println(suma);

    }
}
