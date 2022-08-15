package Katazadaci;

import java.util.Scanner;

public class katazvokali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println(noVowels(x));
    }

    public static String noVowels(String x) {
        String bezVokala = "";
        for (int i = 0; i < x.length(); i++) {


            if (x.charAt(i) != 'a' && x.charAt(i) != 'e' && x.charAt(i) != 'o' && x.charAt(i) != 'i' && x.charAt(i) != 'u') {
                bezVokala = bezVokala + x.charAt(i);
            }
        }
        return bezVokala;
    }
}
