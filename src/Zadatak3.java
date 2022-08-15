import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite trocifreni broj");
        int x = sc.nextInt();
        int I = x / 100;
        int II = (x % 100) / 10;
        int III = (x % 100) % 10;
        if ((Math.pow(I, 3) + Math.pow(II, 3) + Math.pow(III, 3)) == x) {
            System.out.println("Broj jeste Armstrongov");
        } else {
            System.out.println("Broj nije Armstrongov");
        }


    }
}
