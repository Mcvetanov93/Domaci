package Nedelja2;

import java.util.Scanner;
//2. Написати програм који налази други највећи број у низу.
//        ● Низ бројева је 2,4,1,7,3,6;
//        ● Програм налази други највећи број и исписује га на екран.
//        Пример улаза и излаза.
//        Улаз:
//        низ 2,4,1,7,3,6
//        Излаз:
//        “Други највећи број је 6!”

public class Nedelja2domaci1 {
    public static void main(String[] args) {
        int [] x={20,556,234,56,100,864,-1234};
        System.out.println(drugiNajveci(x));


        }
        public static String drugiNajveci (int [] x){
        int najVeci=x [0];
        int druginajveci=x[0];


        for (int i=1;i<x.length;i++){
            if (x[i]>najVeci){
                najVeci=x[i];
            }
        }
        for (int j=1;j<x.length;j++){
            if (x[j]<najVeci&&x[j]>druginajveci){
                druginajveci=x[j];
            }

        }
            String izjava="Drugi najveci broje je "+druginajveci;

            return izjava;

        }


        }



