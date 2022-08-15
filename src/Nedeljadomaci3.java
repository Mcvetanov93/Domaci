import java.util.Scanner;

public class Nedeljadomaci3 {
//    3. Пребројати колико негативних бројева има у низу од локације1 до локације2.
//● Корисник прави низ карактера у ком су измешани позитивни и негативни
//                бројеви;
//● Корисник уноси локацију1 и локацију2;
//● Програм исписује колико негативних бројева имамо у низу од локације1
//        до локације2.
//        Пример улаза и излаза.
//        Улаз:
//        низ - 1,2,3,-6,-3,-2,5,8,-6,-2,-6
//“Локација1” - 2
//“Локација2” - 5
//        Излаз:
//“Од индекса 2 до индеска 5 налазе се 3 негативна броја.”

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] z = {12, 15, -20, 65, -40, 85, 100, -20, -655, 120};
        System.out.print("Unesite indexe: ");
        int x = sc.nextInt();
        System.out.print(" ");
        int y = sc.nextInt();

        int ukupnoNegativnih = 0;

        for (int i = x; i < y; i++) {
            if (z[i]<0) {
                ukupnoNegativnih++;
            }
        }
        System.out.println("Ovaj niz od indexa "+x+" do indexa "+y+" ima ukupno "+ukupnoNegativnih+" negativnih broja");

    }
}

