package Kuhinja;


import Kuhinja.Ingridients.WeightedIngridient;

import java.util.*;


public class Fridge {
    private final ArrayList<WeightedIngridient>  namirnice;

    public Fridge() {
        this.namirnice = new ArrayList<>();
    }

    public void addIngridient(WeightedIngridient x) {
        boolean uslov = true;
        for (WeightedIngridient weightedIngridient : this.namirnice) {
            if (weightedIngridient.getNazivSastojka().equals(x.getNazivSastojka())) {
                weightedIngridient.setWeight(weightedIngridient.getWeight() + x.getWeight());
                uslov = false;
                System.out.println("Ta namirnica vec postoji,dodata je kolicina!");
                break;
            }
        }

        for (int i=0;i<Baza.getBazaSastojaka().size();i++){
            if (Baza.getBazaSastojaka().get(i).getNazivSastojka().equals(x.getNazivSastojka())){
                uslov=true;
                break;
            }
            else
                uslov=false;
        }
        if (uslov) {
            namirnice.add(x);
            System.out.println("Namirnica je uneta!");
        }
        else
            System.out.println("Sastojak koji ste uneli se ne nalazi na listi dozvoljenih sastojaka i ne moze biti unet u frizider");

    }

    public void reduceWeight(String x, double y) {
        for (var element : this.namirnice) {
            if (element.getNazivSastojka().equals(x.toUpperCase())) {
                element.setWeight(element.getWeight() - y);
            }
        }
    }


    public void removieIngridient(String x) {
        for (int i = 0; i < this.namirnice.size(); i++) {
            if (this.namirnice.get(i).getNazivSastojka().equals(x.toUpperCase())) {
                namirnice.remove(namirnice.get(i));
                break;
            }
        }
    }

    public  boolean mozeJelo(String x) {
        int y=0;
        int q=0;
        for (int i = 0; i < Baza.getBazaRecepata().size(); i++) {
            if (Baza.getBazaRecepata().get(i).getNazivRecepta().equals(x.toUpperCase())){
                q=i;
                for (int z=0;z<Baza.getBazaRecepata().get(i).getSastojak().size();z++) {
                    for (WeightedIngridient weightedIngridient : this.namirnice) {
                        if (Baza.getBazaRecepata().get(i).getSastojak().get(z).getNazivSastojka().equals(weightedIngridient.getNazivSastojka()) && Baza.getBazaRecepata().get(i).getSastojak().get(z).getWeight() <= weightedIngridient.getWeight()) {
                            y++;
                        }

                    }

                }
                break;
            }
            }


        return y==Baza.getBazaRecepata().get(q).getSastojak().size();
    }



    public void napraviJelo(Fridge x) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite naziv jela");
        String p=sc.nextLine();
        if (mozeJelo(p.toUpperCase())) {
            for (int i=0;i<Baza.getBazaRecepata().size();i++){
                if (p.toUpperCase().equals(Baza.getBazaRecepata().get(i).getNazivRecepta())){
                    for (int y=0;y<Baza.getBazaRecepata().get(i).getSastojak().size();y++){
                        x.reduceWeight(Baza.getBazaRecepata().get(i).getSastojak().get(y).getNazivSastojka(),(Baza.getBazaRecepata().get(i).getSastojak().get(y).getWeight()));
                    }
                    break;
                }
            }
            System.out.println("Jelo je napravljeno!");
        }
        else {
            System.out.println("Jelo nije moguce napraviti!");
        }

    }



    @Override
    public String toString() {
        return "Fridge{" +
                "namirnice=" + namirnice +
                '}';
    }

}


