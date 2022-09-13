package Kuhinja;

import Kuhinja.Ingridients.WeightedIngridient;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public abstract class Baza {
    private static final List<WeightedIngridient> bazaSastojaka = new ArrayList<>();
    private static final List<Recipe> bazaRecepata = new ArrayList<>();
    private static final List<Recipe> bazaOmiljenihRecepata = new ArrayList<>();


    public static void addSastojak(WeightedIngridient x) {
        bazaSastojaka.add(x);
    }

    public static void addRecipe(Recipe x) {
        bazaRecepata.add(x);
    }


    public static void addSastojakintoRecipe(String name, WeightedIngridient x) {
        for (Recipe recipe : bazaRecepata) {
            if (recipe.getNazivRecepta().equals(name.toUpperCase())) {
                recipe.addIngridient(x);
            }

        }

    }


    public static ArrayList PokupiImena() {
        ArrayList<String> x = new ArrayList<>();
        for (var elementi : Baza.bazaSastojaka) {
            x.add(elementi.getNazivSastojka());
        }
        return x;
    }

    public static void proveraJela(Fridge x) {
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < Baza.getBazaRecepata().size(); i++) {
            if (x.mozeJelo(Baza.getBazaRecepata().get(i).getNazivRecepta())) {
                lista.add(Baza.getBazaRecepata().get(i).getNazivRecepta());
            }
        }
        System.out.println(lista);
    }


    public static void proveraJelaZaNovac(double x) {
        ArrayList<String> lista = new ArrayList<>();

        double cena;
        for (int i = 0; i < Baza.getBazaRecepata().size(); i++) {
            cena = 0;
            for (int v = 0; v < Baza.getBazaRecepata().get(i).getSastojak().size(); v++) {


                for (int y = 0; y < Baza.getBazaRecepata().get(i).getSastojak().size(); y++) {
                    for (int c = 0; c < Baza.getBazaSastojaka().size(); c++) {
                        if (Baza.getBazaSastojaka().get(c).getNazivSastojka().equals(Baza.getBazaRecepata().get(i).getSastojak().get(y).getNazivSastojka())) {
                            cena = cena + Baza.getBazaSastojaka().get(c).getWeight();
                        }
                    }
                }
            }
            if (cena <= x) {
                lista.add(Baza.getBazaRecepata().get(i).getNazivRecepta());
            }
        }
        System.out.println(lista);
    }

    public static void ProverapoTeziniINovcu(TezinaRecepta x, double u) {
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < Baza.getBazaRecepata().size(); i++) {
            if (Baza.getBazaRecepata().get(i).getTezina().equals(x)) {
                list1.add(Baza.getBazaRecepata().get(i).getNazivRecepta());
            }
        }
        ArrayList<String> list2 = new ArrayList<>();
        double cena;
        for (int i = 0; i < Baza.getBazaRecepata().size(); i++) {
            cena = 0;
            for (int v = 0; v < Baza.getBazaRecepata().get(i).getSastojak().size(); v++) {
                for (int y = 0; y < Baza.getBazaRecepata().get(i).getSastojak().size(); y++) {
                    for (int c = 0; c < Baza.getBazaSastojaka().size(); c++) {
                        if (Baza.getBazaSastojaka().get(c).getNazivSastojka().equals(Baza.getBazaRecepata().get(i).getSastojak().get(y).getNazivSastojka())) {
                            cena = cena + Baza.getBazaSastojaka().get(c).getWeight();
                        }
                    }
                }
            }
            if (cena <= u) {
                list2.add(Baza.getBazaRecepata().get(i).getNazivRecepta());
            }
        }
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list1) {
            for (String value : list2) {
                if (s.equals(value)) {
                    list3.add(s);
                }
            }
        }
        System.out.println(list3);


    }

    public static void SortirajPoTezini() {
        ArrayList<String> lista = new ArrayList<>();
        for (var x : Baza.getBazaRecepata()) {
            if (x.tezina.toString().equals("BEGINNER")) {
                lista.add(x.getNazivRecepta());
            }
        }
        for (var x : Baza.getBazaRecepata()) {
            if (x.tezina.toString().equals("EASY")) {
                lista.add(x.getNazivRecepta());
            }
        }
        for (var x : Baza.getBazaRecepata()) {
            if (x.tezina.toString().equals("MEDIUM")) {
                lista.add(x.getNazivRecepta());
            }
        }
        for (var x : Baza.getBazaRecepata()) {
            if (x.tezina.toString().equals("HARD")) {
                lista.add(x.getNazivRecepta());
            }
        }
        for (var x : Baza.getBazaRecepata()) {
            if (x.tezina.toString().equals("PRO")) {
                lista.add(x.getNazivRecepta());
            }
        }
        System.out.println(lista);


    }

    public static void ProveraJelaSkalirano(Fridge x) {
        ArrayList<Recipe> listaprva = new ArrayList<>();

        for (var elementi : Baza.getBazaRecepata()) {
            listaprva.add(Recipe.skalirajRecept(elementi, 50));
        }
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < listaprva.size(); i++) {
            if (x.mozeJelo(listaprva.get(i).getNazivRecepta())) {
                lista.add(listaprva.get(i).getNazivRecepta());
            }
        }
        System.out.println(lista);

    }

    public static void proveraJelaPoTezini(TezinaRecepta x) {
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < Baza.getBazaRecepata().size(); i++) {
            if (Baza.getBazaRecepata().get(i).getTezina().equals(x)) {
                lista.add(Baza.getBazaRecepata().get(i).getNazivRecepta());
            }
        }
        System.out.println(lista);
    }

    public static void sortirajPoNovcu() {
        ArrayList<Double> lista = new ArrayList<>();
        ArrayList<String> listadva = new ArrayList<>();
        for (int y = 0; y < Baza.getBazaRecepata().size(); y++) {
            double temp = 0;
            for (int i = 0; i < Baza.getBazaRecepata().get(y).getSastojak().size(); i++) {
                temp = temp + Baza.getBazaRecepata().get(y).getSastojak().get(i).getWeight();
            }
            lista.add(temp);
        }
        Collections.sort(lista);
        for (Double aDouble : lista) {
            for (int y = 0; y < Baza.getBazaRecepata().size(); y++) {
                double temp = 0;
                for (int z = 0; z < Baza.getBazaRecepata().get(y).getSastojak().size(); z++) {
                    temp = temp + Baza.getBazaRecepata().get(y).getSastojak().get(z).getWeight();
                }
                if (aDouble == temp) {
                    listadva.add(Baza.getBazaRecepata().get(y).getNazivRecepta());
                }
            }
        }
        System.out.println(listadva);
    }

    public static void pogledajOmiljene() {
        if (Baza.bazaOmiljenihRecepata.isEmpty()) {
            System.out.println("Trenutno nemate nikakvih dodatih recepata ");
        } else {
            System.out.println(Baza.getBazaOmiljenihRecepata());
        }
    }

    public static void dodajUOmiljene(String x) {
        boolean uslov = false;
        for (var elementi : Baza.bazaRecepata) {
            if (elementi.getNazivRecepta().equals(x.toUpperCase())) {
                uslov = true;
                break;
            }
        }

        if (uslov) {
            for (var elementi : Baza.bazaRecepata) {
                if (elementi.getNazivRecepta().equals(x.toUpperCase())) {
                    Baza.bazaOmiljenihRecepata.add(elementi);
                }
            }
        } else
            System.out.println("Taj recept ne postoji u bazi podataka");
    }

    public static void izbrisiUOmiljene(String x) {
        boolean uslov = false;
        for (var elementi : Baza.bazaOmiljenihRecepata) {
            if (elementi.getNazivRecepta().equals(x.toUpperCase())) {
                uslov = true;
                break;
            }
        }

        if (uslov) {
            for (int i = 0; i < Baza.bazaOmiljenihRecepata.size(); i++) {
                if (Baza.bazaOmiljenihRecepata.get(i).getNazivRecepta().equals(x.toUpperCase())) {
                    bazaOmiljenihRecepata.remove(i);
                    break;
                }
            }
        } else
            System.out.println("Taj recept ne u omiljenim receptima");
    }

    public static void proveraOmiljenihRecepataZaNovac(double x) {
        ArrayList<String> lista = new ArrayList<>();

        double cena;
        for (int i = 0; i < Baza.bazaOmiljenihRecepata.size(); i++) {
            cena = 0;
            for (int v = 0; v < Baza.bazaOmiljenihRecepata.get(i).getSastojak().size(); v++) {


                for (int y = 0; y < Baza.bazaOmiljenihRecepata.get(i).getSastojak().size(); y++) {
                    for (int c = 0; c < Baza.getBazaSastojaka().size(); c++) {
                        if (Baza.getBazaSastojaka().get(c).getNazivSastojka().equals(Baza.bazaOmiljenihRecepata.get(i).getSastojak().get(y).getNazivSastojka())) {
                            cena = cena + Baza.getBazaSastojaka().get(c).getWeight();
                        }
                    }
                }
            }
            if (cena <= x) {
                lista.add(Baza.bazaOmiljenihRecepata.get(i).getNazivRecepta());
            }
        }
        System.out.println(lista);
    }


    public static List<WeightedIngridient> getBazaSastojaka() {
        return bazaSastojaka;
    }

    public static List<Recipe> getBazaRecepata() {
        return bazaRecepata;
    }

    public static List<Recipe> getBazaOmiljenihRecepata() {
        return bazaOmiljenihRecepata;
    }

}
