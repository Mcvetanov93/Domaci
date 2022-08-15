import java.util.Scanner;

public class zadatak16 {
    public static void main(String[] args) {
        System.out.println("Unesi 1,2,3 ili 4");
        Scanner sc=new Scanner(System.in);
        char input=sc.next().charAt(0);

        int a= sc.nextInt();
        switch (a){
            case 1:
                System.out.println("odg je 1");break;
            case 2:
                System.out.println("odg je 2"); break;
            case 3:
                System.out.println("odg je 3"); break;
            case 4:
                System.out.println("odg je 4"); break;
            default:
                System.out.println("niste uneli nista od navedenog");
        }
    }
}
