package Nedelja3;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci2 {

    public static boolean niz(ArrayList x, ArrayList y){

        for(int i=0;i<x.size();i++){
            for (int j=0;j<y.size();j++){
                if (x.get(i)==(y.get(j))){
                    return true;
                }
            }
        }




        return false;
    }
}
