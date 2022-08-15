import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vase prihode i rashode");
        int prihod=sc.nextInt();
        int rashod=sc.nextInt();
        int rezultat=prihod-rashod;

        if (rezultat<0) {
            System.out.println("Gubitak je" + rezultat);
        }
        else {
            System.out.println("Vas prihod je " + rezultat);
        }




    }
}
