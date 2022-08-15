package Nedelja3;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] niz= new int[3][3];
        int suma=0;
        for (int i=0;i< niz.length;i++){
            for (int j=0;i<niz[i].length;j++){
                System.out.println();
                niz[i][j]=sc.nextInt();

            }


        }


//
//
//
//        for (int[] row : niz) {
//            for (int el : row) {
//                System.out.print(el + " ");
//            }
//            System.out.println();
//        }

    }
}
//import java.util.Arrays;
//        import java.util.Scanner;
//
//public class Program1 {
//
//    public static void main(String[] args) {
//
//        //uneti 2d niz [3][3]
//        //suma svih elemenata 2d niza
//
//        final int M = 3;
//        Scanner sc = new Scanner(System.in);
//        int suma = 0 ;
//
//        int[][] niz = new int[M][M];
//
//        for (int i = 0 ; i<niz.length;i++){
//            for (int j = 0; j< niz[i].length;j++) {
//                int broj = 0;
//                System.out.print("Unesti [" + i +"]" + "[" + j+ "] - " );
//                broj = sc.nextInt();
//                niz[i][j] = broj;
//
//            }
//        }
//
//        for (int i = 0 ; i<niz.length;i++){
//            for (int j = 0; j< niz[i].length;j++) {
//                System.out.print(niz[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0 ; i<niz.length;i++){
//            for (int j = 0; j< niz[i].length;j++) {
//                suma = suma + niz[i][j];
//            }
//        }
//
//        System.out.println("Suma elemenata matrice - " + suma);
//
//    }
//
//}
