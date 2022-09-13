package Pozoriste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Predstava {
    private String nazivPredstave;
    private String pozoriste;
    private ArrayList zaposleni;


    //atribute:
    //naziv predstave
    //Pozorište kao atribut
    //listu zaposlenih

    public Predstava(String nazivPredstave, String pozoriste, Reditelj x) {
        this.nazivPredstave = nazivPredstave;
        this.pozoriste = pozoriste;
        this.zaposleni=new ArrayList<>();
        zaposleni.add(x);
    }

    public String getNazivPredstave() {
        return nazivPredstave;
    }

    public String getPozoriste() {
        return pozoriste;
    }

    public ArrayList getZaposleni() {
        return zaposleni;
    }

    @Override
    public String toString() {
        return "Predstava{" +
                "nazivPredstave='" + nazivPredstave + '\'' +
                ", pozoriste='" + pozoriste + '\'' +
                ", zaposleni=" + zaposleni +
                '}';
    }
//konstruktor (naziv, Pozoriste, reditelja koji se dodaje u listu zaposlenih)

    //TODO samo za onoga ko zeli ! nije obavezno!
    // TODO: dodaj(Glumac glumac) - boolean
    // da li vec postoji isti glumac  zaposleni.contains(glumac)
    // this.zaposleni.add(glumac);
    public void dodajGlumca(){
//        this.zaposleni.add(Glumac);
    }
    //
    // TODO: dodaj(Kostimograf k) - boolean

    //get naziv i pozoriste metode
   //to string metodu
}
