import java.util.Scanner;

public class zadatk10 {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Unesite broj ");
//        int broj=sc.nextInt();
//        int x1=broj%20;
//        System.out.println(x1);
//
//    }
//}
// Унос и испис бројева док се не унесе 0, hint:Boolean вредност као услов
        for (int i = 1; i <= 3; i++) {
            if (i == 1)
                continue;
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    } }