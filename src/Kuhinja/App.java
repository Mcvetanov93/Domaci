package Kuhinja;


import Kuhinja.Ingridients.IngridientFactory;
import Kuhinja.Ingridients.WeightedIngridient;


import java.util.Scanner;

public class App {


    public static void Aplikacija() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dobrodosli u kuhinju");
        System.out.println();
        System.out.println("Unesite sledece brojeve za sledece funkcije: ");
        System.out.println();
        Fridge fridge = new Fridge();
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("krastavac", 50));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("paradajz", 45));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("kupus", 80));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("piletina", 600));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("svinjetina", 500));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("teletina", 1200));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("sir", 400));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("hleb", 50));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("salama", 300));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("kackavalj", 600));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("jaja", 12));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("luk", 60));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("mleko", 150));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("jogurt", 170));
        Baza.addSastojak(IngridientFactory.addIngridientnameprice("testenina", 130));


        Baza.addRecipe(new Recipe("Bolonjeze", TezinaRecepta.MEDIUM));
        Baza.addSastojakintoRecipe("bolonjeze", IngridientFactory.addIngridientminusWeight("paradajz", 5));
        Baza.addSastojakintoRecipe("bolonjeze", IngridientFactory.addIngridientminusWeight("luk", 7));
        Baza.addSastojakintoRecipe("bolonjeze", IngridientFactory.addIngridientminusWeight("svinjetina", 7));
        Baza.addRecipe(new Recipe("Salata", TezinaRecepta.EASY));
        Baza.addSastojakintoRecipe("salata", IngridientFactory.addIngridientminusWeight("paradajz", 5));
        Baza.addSastojakintoRecipe("salata", IngridientFactory.addIngridientminusWeight("krastavac", 5));
        Baza.addSastojakintoRecipe("salata", IngridientFactory.addIngridientminusWeight("luk", 2));
        Baza.addRecipe(new Recipe("omlet", TezinaRecepta.EASY));
        Baza.addSastojakintoRecipe("omlet", IngridientFactory.addIngridientminusWeight("jaja", 5));
        Baza.addSastojakintoRecipe("omlet", IngridientFactory.addIngridientminusWeight("sir", 2));
        Baza.addRecipe(new Recipe("TeletinaPodSacem", TezinaRecepta.HARD));
        Baza.addSastojakintoRecipe("TeletinaPodSacem", IngridientFactory.addIngridientminusWeight("teletina", 5));
        Baza.addSastojakintoRecipe("TeletinaPodSacem", IngridientFactory.addIngridientminusWeight("luk", 5));
        Baza.addSastojakintoRecipe("TeletinaPodSacem", IngridientFactory.addIngridientminusWeight("paradajz", 2));
        Baza.addSastojakintoRecipe("TeletinaPodSacem", IngridientFactory.addIngridientminusWeight("hleb", 2));
        Baza.addRecipe(new Recipe("Lazanje", TezinaRecepta.HARD));
        Baza.addSastojakintoRecipe("lazanje", IngridientFactory.addIngridientminusWeight("luk", 2));
        Baza.addSastojakintoRecipe("lazanje", IngridientFactory.addIngridientminusWeight("svinjetina", 5));
        Baza.addSastojakintoRecipe("lazanje", IngridientFactory.addIngridientminusWeight("teletina", 5));
        Baza.addSastojakintoRecipe("lazanje", IngridientFactory.addIngridientminusWeight("paradajz", 2));
        Baza.addSastojakintoRecipe("lazanje", IngridientFactory.addIngridientminusWeight("kackavalj", 3));


        boolean uslov = true;

        while (uslov) {
            System.out.println("Unesite 1 da bi ste uneli novu namirnicu u frizider" + "\n" +
                    "Unesite 2 da bi ste obrisali ili smanjili kolicinu namernice u frizideru" + "\n" +
                    "Unesite 3 da bi ste proverili koja sve jela mozete napraviti sa namirnicama u frizideru" + "\n" +
                    "Unesite 4 da bi ste proverili koja sve skalirana jela mozete napraviti" + "\n" +
                    "Unesite 5 da bi ste napravili jelo" + "\n" +
                    "Unesite 6 da bi ste proverili koja sve jela mogu da se naprave za odredjenu sumu novca" + "\n" +
                    "Unesite 7 da bi ste proverili koja su sva jela odredjene tezine" + "\n" +
                    "Unesite 8 da bi ste proverili koja sva jela odredjene cene i tezine mogu da se naprave" + "\n" +
                    "Unesite 9 da bi ste sortirali sva jela po odredjenoj tezini" + "\n" +
                    "Unesite 10 da bi ste sortirali sve jela po cenama" + "\n" +
                    "Unesite 11 da bi ste usli u meni sa omiljenim receptima" + "\n" +
                    "Unesite 0 da bi ste izasli iz programa");


            switch (sc.nextInt()) {
                case 0:
                    uslov = false;
                    break;
                case 1:

                    System.out.println("Unesite jednu on ponudjenih namernica" + Baza.PokupiImena());
                    fridge.addIngridient(IngridientFactory.addIngridientminusWeight(sc.next().toUpperCase(), sc.nextDouble()));
                    break;
                case 2:
                    System.out.println("Unesite 1 da smanjite kolicinu namirnice ili 2. da je obrisete ");
                    switch (sc.nextInt()) {
                        case 1 -> fridge.reduceWeight(sc.next(), sc.nextDouble());
                        case 2 -> fridge.removieIngridient(sc.next());
                    }
                case 3:
                    Baza.proveraJela(fridge);
                    break;
                case 4:Baza.ProveraJelaSkalirano(fridge);
                    break;
                case 5:
                    fridge.napraviJelo(fridge);
                    break;
                case 6:
                    System.out.println("Unesite iznos novca");
                    Baza.proveraJelaZaNovac(sc.nextDouble());
                    break;
                case 7:
                    System.out.println("Unesite jednu od ponudjenih opcija" + TezinaRecepta.values());
                    Baza.proveraJelaPoTezini(TezinaRecepta.valueOf(sc.next().toUpperCase()));
                    break;
                case 8:
                    System.out.println("Unesite tezinu recepta i iznos novca");
                    Baza.ProverapoTeziniINovcu(TezinaRecepta.valueOf(sc.next().toUpperCase()), sc.nextDouble());
                    break;
                case 9:Baza.SortirajPoTezini();
                    break;
                case 10:
                    Baza.sortirajPoNovcu();
                    break;
                case 11:
                    System.out.println("Unesite 1 za prikaz omiljenih recepata" + "\n" + "Unesite 2 da dodate ili ili izbrisete neki recept" + "\n" + "Unesite 3 da vidite koje recepte mozete spremiti za odredjen iznos novca");
                    switch (sc.nextInt()) {
                        case 1:
                            Baza.pogledajOmiljene();
                            break;
                        case 2:
                            System.out.println("Unesite 1 da dodate recept ili 2 da izbrisete recept");
                            switch (sc.nextInt()) {
                                case 1 -> {
                                    System.out.println("Unesite naziv recepta");
                                    Baza.dodajUOmiljene(sc.next());
                                    System.out.println();
                                    break;
                                }
                                case 2 -> {
                                    System.out.println("Unesite naziv recepta");
                                    Baza.izbrisiUOmiljene(sc.next());
                                    System.out.println();
                                    break;
                                }
                                default -> {
                                }
                            }
                        case 3:
                            System.out.println("Unesite iznos novca");
                            Baza.proveraOmiljenihRecepataZaNovac(sc.nextDouble());
                            break;
                    }
            }
        }

    }
}
