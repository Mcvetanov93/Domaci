import java.util.Scanner;

public class zadatk7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi nosivost i broj automoblia");
        int nosivost = sc.nextInt();
        int brAuto = sc.nextInt();
        int zbirmase=0;

        for (int i = 0; i <= brAuto; i++) {
            System.out.println("Unesi masu: ");
            int masAut = sc.nextInt();
            zbirmase=zbirmase+masAut;
        }
        if (nosivost<=zbirmase){
            System.out.println("Most nece moci da izdrzi broj automobila");
        }
        else {
            System.out.println("Most ce moci da izdrzi");
        }



    }
}
