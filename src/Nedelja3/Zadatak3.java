package Nedelja3;

import java.util.ArrayList;


public class Zadatak3 {
    public static void main(String[] args) {
        String x="dpj";
        int y=7;
        ArrayList <String> x1=new ArrayList<String>();
        x1.add("as");
        x1.add("asfds");
        x1.add("a");
        x1.add("avzx");
        x1.add("abgf");

        System.out.println(prosirujedesno(x,y));
        System.out.println(prosirujelevo(x,y));
        System.out.println(nule(x1));


    }
    public static String prosirujedesno(String x,int y){
        String prosiren=null;
        prosiren=x;
        for (int i=0;i<y;i++){
            if (i>(x.length()-1)){
                prosiren=prosiren+'0';
            }

        }
        return prosiren;
    }
    public static String prosirujelevo(String x,int y){
        String prosiren=null;
        prosiren=x;
        for (int i=0;i<y;i++){
            if (i>(x.length()-1)){
                prosiren='0'+prosiren;
            }

        }
        return prosiren;
    }
    public static ArrayList<String> nule(ArrayList<String> x){
        ArrayList <String> noviNiz=new ArrayList<String>();
        for (var element:x) {
            if (element.length()<4){
                while (element.length()!=4){
                    element=element+'0';
                }
            }
        noviNiz.add(element);
        }


        return noviNiz;
    }

}
