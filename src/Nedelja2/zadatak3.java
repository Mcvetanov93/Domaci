package Nedelja2;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x= sc.nextLine();
        String y= sc.nextLine();
        char a=x.charAt(1);
        char b=y.charAt(1);
        System.out.println(a+b);





    }


}













        //        String inicijali="";
//        String inicijal1="";
//        String zajendo=inicijal1+inicijali;
//
//        for (int i=0;i<x.length();i++) {
//            if (i==x.charAt(0)){
//                inicijali=inicijali+i;
//            }
//            break;
//        }
//        for (int j=0;j<=y.charAt(0);j++){
//            if (j==y.charAt(0)){
//               inicijal1=inicijal1+j;
//            break;
//        }
//
//}
//
//        return zajendo;
//    } }




//    public static boolean contains2(String str, char c){
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == c){
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public static int indexOf2(String str, char c){
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == c){
//                return i;
//            }
//        }
//
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String s = sc.nextLine();
//
//        System.out.println(contains2(s, '%'));
//        System.out.println(indexOf2(s, '%'));
//    }