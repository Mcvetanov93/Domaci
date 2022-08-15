package Katazadaci;

import java.util.Scanner;

public class kataXiO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x= sc.nextLine();
        System.out.println(proveraXiO(x));

    }
    public static boolean proveraXiO(String x){
        int zaO=0;
        int zaX=0;
        String zaProveru=x.toUpperCase();
        for (int i=0;i<zaProveru.length();i++){
            if (zaProveru.charAt(i)=='X'){
                zaX++;
            } else if (zaProveru.charAt(i)=='O') {
                zaO++;
            }



        }

        return zaO == zaX;


    }
}
