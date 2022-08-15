package Nedelja2;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x= sc.next();
        System.out.println(emailProvera(x));


    }

    public static boolean emailProvera(String x) {




        boolean tackaat = x.contains("@") && x.contains(".");
        int pozicijaat = -1;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '@') {
                pozicijaat = i;
                break;
            }
        }
        int pozicijaslova = pozicijaat - 1;
        char dalijeslovo = x.charAt(pozicijaslova);
        boolean preatslovo = Character.isLetter(dalijeslovo);
        int pozicijatacke=-1;
        for (int j=0;j<x.length();j++){
            if (x.charAt(j)=='.'){
                pozicijatacke=j;

            }

        }
        int pozicijaposletacke=pozicijatacke+1;
        char posleTacke=x.charAt(pozicijaposletacke);
        boolean posleTackeSlovo=Character.isLetter(posleTacke);
        boolean izmedjuAtITacke=false;

        for (int k=pozicijaat;k<pozicijatacke;k++){
            izmedjuAtITacke = Character.isLetter(x.charAt(k));

        }
        for (int k=pozicijaat;k<pozicijatacke;k++){
            izmedjuAtITacke = Character.isLetter(x.charAt(k));

        }


        return preatslovo && tackaat && posleTackeSlovo&&izmedjuAtITacke;


    }
}









