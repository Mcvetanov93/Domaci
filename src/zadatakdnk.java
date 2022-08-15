import java.util.Scanner;

public class zadatakdnk {
    public static void main(String[] args) {
        System.out.println("Unesite nesto odgovarajuci znak A,T,C,G ili e za izlazak iz programa");
        Scanner sc = new Scanner(System.in);

        char input = sc.next().charAt(0);
        while (input != 'e') {

            switch (input) {
                case 'A':
                    System.out.println("Adenanin");
                    input = sc.next().charAt(0);
                    break;

                case 'C':
                    System.out.println("Citozin");
                    input = sc.next().charAt(0);
                    break;

                case 'G':
                    System.out.println("Guanin ");
                    input = sc.next().charAt(0);
                    break;

                case 'T':
                    System.out.println("Timin");
                    input = sc.next().charAt(0);
                    break;


                default:
                    System.out.println("Niste uneli nijedan odgovarajuci znak");
                    input = sc.next().charAt(0);
            }

        }
        System.out.println("Program zavrsen");
    }
}
