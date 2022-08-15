import java.util.Scanner;

public class zadatak19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("unesite nosivost mosta");
        int nosivostMosta= sc.nextInt();
        System.out.println("unesite broj automobila");
        int brojAutomobila= sc.nextInt();
        int ukupnaMasa=0;
        for (int i=0;i<brojAutomobila;i++){
            System.out.println("Unesite masu automobila ");
            int masaAutomobila=sc.nextInt();
            ukupnaMasa=ukupnaMasa+masaAutomobila;
        }
        if (nosivostMosta<ukupnaMasa){
            System.out.println("Most ne moze izdrzati");
        }
        else {
            System.out.println("Moze izdrzati");}


        System.out.println("Ukupna masa autobmobila je " + ukupnaMasa);
    }
}
// Мост има носивост M, написати програм који учитава број аутомобила на мосту,а затим и масу сваког од њих.
// Затим исписати да ли мост може да издржи све аутомобиле или не