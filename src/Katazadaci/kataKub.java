package Katazadaci;

import java.util.Scanner;

public class kataKub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(cubeSum(x,y));

    }
    public static int cubeSum(int n,int m){
        int zbir=0;
        int temp=0;
        if (m<n){
            temp=m;
            m=n;
            n=temp;
        }

        if (n!=m) {
            for (int i = n + 1;i<=m;i++ ){
                zbir=zbir+i*i*i;
            }
        }
        else
            zbir=0;
        return zbir;
    }

}
