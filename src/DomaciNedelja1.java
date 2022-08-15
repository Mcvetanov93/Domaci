import java.util.Scanner;

public class DomaciNedelja1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite w,a,s ili d");
        char strelica=sc.next().charAt(0);
        int w = 0;
        int a = 0;
        int s = 0;
        int d = 0;

        boolean uslov = true;
        while (uslov) {



            switch (strelica) {
                case 'w':
                    w += 1;
                    strelica=sc.next().charAt(0);
                    break;
                case 'a':
                    a += 1;
                    strelica=sc.next().charAt(0);
                    break;
                case 's':
                    s += 1;
                    strelica=sc.next().charAt(0);
                    break;
                case 'd':
                    d += 1;
                    strelica=sc.next().charAt(0);
                    break;
                default:uslov=false;break;




            }


        }
        System.out.println("Korisnik je prosao "+w+" koraka na gore, "+s+" koraka na dole, "+d+" na desno i "+a+" koraka na levo");



    }
}
