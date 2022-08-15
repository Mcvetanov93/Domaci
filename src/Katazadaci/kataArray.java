package Katazadaci;

import java.util.Arrays;
import java.util.Scanner;

public class kataArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();

        System.out.println(Arrays.toString(between(x,y)));


    }
    public static int [] between (int x,int y){
      int temp=0;

      if (x>y){
          temp=x;
          x=y;
          y=temp;
      }
        int [] niz=new int[y-x+1];
      for (int i=0;i<niz.length;i++){
          niz[i]=x++;

      }
      return niz;
    }
}
