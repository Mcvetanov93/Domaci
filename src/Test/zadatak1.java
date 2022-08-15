package Test;

import java.util.Arrays;
import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int [] tablica=new int[10];
        for (int i=0;i<tablica.length;i++){
            tablica[i]=x*i;
        }
        System.out.println(Arrays.toString(tablica));

    }
}
