import java.util.Scanner;

public class zadatarndm {
    public static void main(String[] args) {
        System.out.println("Unesite neki broj ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = Math.random() * 100;
        System.out.println(b);
        if (a == b) {
            System.out.println("vas broj je isti kao random");

        } else {
            System.out.println("vas broj nije isti kao random");
        }

    }
}
