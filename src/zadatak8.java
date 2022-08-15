import java.util.Scanner;

public class zadatak8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("unesite broj ");
        int x= sc.nextInt();
        int suma=0;
        for (int a=0; a<=x;a++) {
            suma=suma+a;}
        System.out.println("Suma svih brojeva je " + suma);



    }
}
