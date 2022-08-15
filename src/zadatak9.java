import java.util.Scanner;

public class zadatak9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite  broj ");
        int x = sc.nextInt();
        int parni=0;
        int neparni=0;

       for (int i=0;i<=x;i+=2){
           parni=parni+i;
       }
       for (int i=1;i<x;i+=2){
           neparni=neparni+i;
       }
        System.out.println(parni);
        System.out.println(neparni);

    }
}
//zbir svih parnih i neparnih