package Nedelja3;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList <Integer> x=new ArrayList<Integer>();

    }

    public static ArrayList<Integer> izbacujeParne (ArrayList<Integer> x){
        ArrayList <Integer> noviNiz=new ArrayList<Integer>();
        for (var elemnti:x){
            if (elemnti!=0){
                noviNiz.add(elemnti);
            }
        }
        return noviNiz;

    }
    public static ArrayList<Integer>pozitivniiNegativni (ArrayList<Integer>x){
        ArrayList <Integer> noviNiz=new ArrayList<Integer>();
        ArrayList <Integer> noviNiz1=new ArrayList<Integer>();
        for (var elementi:x){
            if (elementi>=0){
                noviNiz.add(elementi);
            }
            else if (elementi<0){
                noviNiz1.add(elementi);
            }
        }
        return noviNiz;
    }
    public static ArrayList<String>manjeOd4 (ArrayList<String>x) {
        ArrayList <String> noviNiz=new ArrayList<String>();
        for (var elementi:x){
            if (elementi.length()<4){
                noviNiz.add(elementi);
            }
        }



    return noviNiz;
    }
    }
