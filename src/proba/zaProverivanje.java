package proba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zaProverivanje {
    public static void main(String[] args) {
        int[][] x = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 } };
        int suma = 0;
        int temp = 0;
        int temp2;
        int marker = 0;

        int [][] prototip=new int [(x.length)][];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i == 0) {
                    temp = temp + x[i][j];
                }
                suma = suma + x[i][j];
            }
            if (suma > temp && i != 0) {
                temp = suma;
            }
            suma = 0;

        }

        for (int i = 0; i < x.length; i++) {
            temp2 = 0;
            for (int j = 0; j < x[i].length; j++) {
                temp2 = temp2 + x[i][j];
                if (temp == temp2) {
                    marker = i;
                }
            }
        }
        int [][] rezultat=new int[x.length][4];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++){
                rezultat[i][j]=x[i][j];
            }
        }
        prototip[0]=x[marker];
        prototip[1]=x[0];
        rezultat[0]=prototip[0];
        rezultat[marker]=prototip[1];



    }
    }

