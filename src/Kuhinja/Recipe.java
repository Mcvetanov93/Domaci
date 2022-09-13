package Kuhinja;

import Kuhinja.Ingridients.WeightedIngridient;

import java.util.*;

public class Recipe implements Priceable {
    private String nazivRecepta;
    TezinaRecepta tezina;
    private ArrayList<WeightedIngridient> sastojak;

    public Recipe(String nazivRecepta, TezinaRecepta tezina) {
        this.nazivRecepta = nazivRecepta.toUpperCase();
        this.tezina = tezina;
        this.sastojak = new ArrayList<>();

    }

    public TezinaRecepta getTezina() {
        return tezina;
    }

    public Recipe() {

    }

    public ArrayList<WeightedIngridient> getSastojak() {
        return sastojak;
    }

    public void addIngridient(WeightedIngridient x) {
        boolean uslov = false;
        for (int i = 0; i < sastojak.size(); i++) {
            if (sastojak.get(i).getId() == x.getId()) {
                uslov = true;
            }
        }
            if (!uslov) {
                sastojak.add(x);
            }

    }

    @Override
    public double getPrice() {
        double x = 0;
        for (WeightedIngridient weightedIngridient : sastojak) {
            x = x + weightedIngridient.getPrice();
        }
        return x;
    }


    @Override
    public String toString() {
        return "Recipe{" +
                "nazivRecepta='" + nazivRecepta + '\'' +
                ", tezina=" + tezina +
                ", sastojak=" + sastojak +
                '}';
    }

    public static Recipe skalirajRecept(Recipe x, double y) {
        Recipe z = new Recipe();
        z.nazivRecepta = x.nazivRecepta;
        z.tezina = x.tezina;
        z.sastojak = new ArrayList<>();
        for (int i = 0; i < x.sastojak.size(); i++) {
            x.sastojak.get(i).skaliranjenamirnica(x.getSastojak().get(i).getWeight(), y);
            z.sastojak.add(x.sastojak.get(i));
        }

        return z;
    }

    public static void skaliraj(Recipe x, double y) {
        for (int i = 0; i < x.getSastojak().size(); i++) {
            x.sastojak.get(i).skaliranjenamirnica(x.sastojak.get(i).getWeight(), y);
        }
    }

    public String getNazivRecepta() {
        return nazivRecepta;
    }
}
