
import java.sql.SQLOutput;
import java.util.Scanner;

public class Domacinedelja2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stop="";


        do {

            System.out.println("unesite broj ");
            int n = sc.nextInt();
            sc.nextLine();



            if (n % 2 == 0) {
                System.out.println("Broj je deljiv sa 2");
            } else {
                System.out.println("Broj nije deljiv sa 2");
                }
            System.out.println("uneiste stop");;
            stop= sc.next();








        }

        while (stop != "stop");
        System.out.println("program zavrsen");


    }


}


