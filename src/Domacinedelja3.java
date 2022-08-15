import java.util.Scanner;

public class Domacinedelja3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int tajniBroj=(int) (Math.random()*10);

        for (int i=0;i<10;i++) {
            System.out.println(tajniBroj);
            System.out.println("Unesite neki broj od 1-10 ");
            int broj= sc.nextInt();
            if (broj>=0&&broj<=10) {
                if (broj == tajniBroj) {
                    System.out.println("Pogodili ste broj");
                    break;
                } else {
                    if (tajniBroj < broj) {
                        System.out.println("tajni broj je veci od broja");
                    } else {
                        System.out.println("tajni broj je manji od broja");
                    }
                }
            }
            else {
                System.out.println("Broj koji ste uneli nije ispravan");
            }


        }
    }
}
