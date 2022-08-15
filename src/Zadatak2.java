import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite godinu: ");
        int x=sc.nextInt();
        if (x%400==0) {
            System.out.println("Godina je prestupna");
        } else if (x%4==0 && x%100!=0) {
        System.out.println("Godina je prestupna");}
        else {
            System.out.println("Godina nije prestupna");
        }
        }
    }


