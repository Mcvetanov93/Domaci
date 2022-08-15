package Test;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class zadatak5 {
    public static void main(String[] args) {
        int [] x={12,645,23,5,12,45,76,12,34,23,5,45};
        System.out.println(Arrays.toString(bezDuplikata(x)));




    }
    public static int [] bezDuplikata(int[]x){
        int brojDuplikata=0;

        Arrays.sort(x);


        for (int i=0;i<x.length-1;i++){
            if (x[i]==x[i+1]){


                brojDuplikata++;
            }
        }
        int [] nizBezDuplikata=new int[x.length-brojDuplikata];

        for (int j=0;j<x.length-1;j++){
            if (x[j]!=x[j+1]){
                nizBezDuplikata[j]=x[j];
            }
        }

        return nizBezDuplikata;
        }



    }

