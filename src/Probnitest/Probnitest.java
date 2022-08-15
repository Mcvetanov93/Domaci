package Probnitest;


import java.util.Scanner;

public class Probnitest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(faktorijel(x));



    }
        public static  int faktorijel (int x){
        int zbir=1;
        for (int i=1;i<=x;i++){
            zbir=zbir*i;
        }


    return zbir;
    }
    public static String piramida(int x,int y){
        String pir="";
        for (int i=0;i<x;i++){
            for (int j=0;j<y;i++){
                pir="* ";
            }

                System.out.println();
        }
        return pir;

    }




}