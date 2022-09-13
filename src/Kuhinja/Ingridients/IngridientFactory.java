package Kuhinja.Ingridients;

public class IngridientFactory {
    public static WeightedIngridient addIngridient(String nazivSastojka, double weight, double pricePerUnit,int id){
        return new WeightedIngridient( nazivSastojka,weight,pricePerUnit );
    }
    public static WeightedIngridient addIngridentString(String nazivSastojka){
        return new WeightedIngridient(nazivSastojka);
    }
    public static WeightedIngridient addIngridientminusWeight(String nazivSastojka,double weight){
        return new WeightedIngridient(nazivSastojka,weight);
    }
    public static WeightedIngridient addIngridientnameprice(String nazivSastojka,double pricePerUnit){
        return new WeightedIngridient(nazivSastojka,pricePerUnit);
    }

}
