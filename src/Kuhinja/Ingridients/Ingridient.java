package Kuhinja.Ingridients;

import Kuhinja.Priceable;

public abstract class Ingridient implements Priceable {
    public  int id;
    private static int idBrojac=0;
    private String nazivSastojka;

    public Ingridient( String nazivSastojka) {
        this.id = idBrojac++;
        this.nazivSastojka = nazivSastojka.toUpperCase();
    }
    public Ingridient( ) {}

    public int getId() {
        return id;
    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }
}
