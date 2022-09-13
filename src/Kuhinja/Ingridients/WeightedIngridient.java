package Kuhinja.Ingridients;

import Kuhinja.Baza;
import Kuhinja.Ingridients.Ingridient;

public class WeightedIngridient extends Ingridient {
    private double weight;
    private double pricePerUnit;
    private int id;


    public WeightedIngridient( String nazivSastojka, double weight, double pricePerUnit) {
        super( nazivSastojka);
        this.weight = weight;
        this.pricePerUnit = pricePerUnit;
        this.id=super.id;
    }


    public WeightedIngridient( String nazivSastojka) {
        super( nazivSastojka);
    }
    public WeightedIngridient() {}




    public WeightedIngridient( String nazivSastojka,double weight) {
        super( nazivSastojka);
        this.weight=weight;
    }




    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public double getPrice() {
        return weight*pricePerUnit;
    }

    @Override
    public String toString() {
        return "WeightedIngridient{" +
                "name="+ getNazivSastojka()+", "+
                "weight=" + weight +
                ", pricePerUnit=" + pricePerUnit +
                ", id=" + id +
                '}';
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void skaliranjenamirnica(double weight, double x){

        this.weight = weight-((weight*x)/100);
    }

    public double getWeight() {
        return weight;
    }
}

