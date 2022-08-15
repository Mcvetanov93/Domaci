package Nedelja3;

import java.util.Arrays;

public class DomaciNedelja1 {
    public static void main(String[] args) {
        int[][] x = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 } };

        System.out.println(Arrays.toString(matrix(x)));


    }

    public static int[] matrix(int[][] x) {

        int suma = 0;
        int temp = 0;
        int temp2;
        int marker=0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i == 0) {
                    temp = temp + x[i][j];
                }
                suma = suma + x[i][j];
            }
            if (suma > temp && i != 0){
                temp = suma;}
                suma=0;

        }

        for (int i = 0; i < x.length; i++) {
            temp2=0;
            for (int j = 0; j < x[i].length; j++){
                temp2=temp2+ x[i][j];
                if (temp==temp2){
                    marker=i;
                }
            }

        }
        int[] niz = new int[x[marker].length];
        for (int j = 0; j < x[marker].length; j++){

            niz[j]=x[marker][j];
        }
        return niz;
    }

}