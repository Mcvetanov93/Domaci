import java.util.Scanner;

public class zadatakbrojac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite brojeve od 0-9");
        int x= sc.nextInt();
        boolean uslov=true;
        if (x>=0 && x<=9){
            while(true){
                switch (x) {
                    case 1:
                        System.out.println("Uneli ste broj 1 ovoliko puta " );
                        x = sc.nextInt();
                        break;

                }
            }

        }
        else {
            System.out.println("Broj koji ste uneli nije ponudjen");
        }


    }
}
