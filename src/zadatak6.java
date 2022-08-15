import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println("unesite broj: ");
        if (x%5==0 && x%11==0){
            System.out.println("broj je deljiv i sa 5 i sa 11");}
            else if (x%5==0 && x%11!=0) {System.out.println("broj je deljiv sa 5");
        }
            else if (x%11==0 && x%5!=0){
            System.out.println("broj je deljiv samo sa 11");
        }
            else {
            System.out.println("broj nije deljiv ni sa 11 ni sa 5");
        }

    }
}

















//1. Да ли је број дељив са 5 или са 11 или са оба (или није ни са чим од наведеног)