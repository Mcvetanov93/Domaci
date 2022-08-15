package Nedelja2;

import java.util.Scanner;

public class Nizovi1 {
    public static void main(String[] args) {
        int[] niz1 = {123, 1234, 22, 55};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Niz(niz1, x));
        System.out.println(Nizzbir(niz1));


    }
    public static int Nizzbir(int [] x){
        int zbir=0;
        for (int element=0;element<x.length;element++){
          zbir=zbir+ x[element];
          }
        return zbir;

    }




    public static boolean Niz(int[] niz, int x) {



        for (int element : niz) {
            if (element == x) {
                return true;
            }



        }
        return false;

    }
}
