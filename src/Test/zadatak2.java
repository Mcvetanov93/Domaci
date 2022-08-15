package Test;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(proizvod(5,3));



    }
    public static int proizvod(int x,int y){
        Scanner sc=new Scanner(System.in);
        int zbir=1;
        int temp=0;
        if (y>x){
            temp=y;
            y=x;
            x=temp;
        }
        int [] niz=new int [x-y+1];
        for (int i=0;i< niz.length;i++){
            zbir=zbir*y++;
        }
        return zbir;
    }
}
