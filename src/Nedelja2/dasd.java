package Nedelja2;

import java.util.Scanner;

public class dasd {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String x= sc.nextLine();
        int y= sc.nextInt();
        System.out.println(tarabica(x,y));


    }
//    public static String piramidica(String x, int y){
//
//    }
    public static String tarabica ( String x, int y){
        x="#";
        for (int i=1;i<=y;i++){
            System.out.println(x + " "+ x );
            for (int j=1;j<=i;j++){
                System.out.print(x + " "+x);
            }
        }
        return x;
    }

}
