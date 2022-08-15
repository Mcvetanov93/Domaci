import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("unesite N");
        int n= sc.nextInt();
        int neparni=0;
        int parni=0;

        for (int i=1 ; i<n ; i+=2 ) {
            neparni=neparni+i;
        }

        for ( int e=0; e<n ; e+=2){
            parni=parni+e;
        }
        System.out.println(parni);
        System.out.println(neparni);




    }

}
