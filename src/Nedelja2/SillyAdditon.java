package Nedelja2;

import java.util.Scanner;
//https://www.codewars.com/kata/5effa412233ac3002a9e471d/java

public class SillyAdditon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dva broja");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(assertEquals(x, y));

    }

    public static String assertEquals(int x, int y) {
        int dvocifreni = (x % 100) / 10;
        int jednocifreni = (x % 100) % 10;
        int trocifreni = x / 100;
        int trocifreniy = y / 100;
        int dvocifreniy = (y % 100) / 10;
        int jednocifreniy = (y % 100) % 10;
        int zbirjedinicnih;
        int zbirdvocifrenih;
        int zbirtrocifrenih;
        String zbir;


        if (trocifreni == 0 && trocifreniy == 0) {
            zbirjedinicnih = jednocifreni + jednocifreniy;
            zbirdvocifrenih = dvocifreni + dvocifreniy;
            zbir = "" + zbirdvocifrenih + zbirjedinicnih;


        } else if (trocifreni == 0) {
            zbirjedinicnih = jednocifreni + jednocifreniy;
            zbirdvocifrenih = dvocifreni + dvocifreniy;
            zbirtrocifrenih = trocifreniy;
            zbir = "" + zbirtrocifrenih + zbirdvocifrenih + zbirjedinicnih;


        } else if (trocifreniy == 0) {
            zbirjedinicnih = jednocifreni + jednocifreniy;
            zbirdvocifrenih = dvocifreni + dvocifreniy;
            zbirtrocifrenih = trocifreni;
            zbir = "" + zbirtrocifrenih + zbirdvocifrenih + zbirjedinicnih;

        } else {
            zbirjedinicnih = jednocifreni + jednocifreniy;
            zbirdvocifrenih = dvocifreni + dvocifreniy;
            zbirtrocifrenih = trocifreni + trocifreniy;
            zbir = "" + zbirtrocifrenih + zbirdvocifrenih + zbirjedinicnih;


        }


        return zbir;


    }
}
