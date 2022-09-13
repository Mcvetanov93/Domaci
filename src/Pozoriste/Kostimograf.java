package Pozoriste;

//kostimograf nasledjuje zaposlenog
public class Kostimograf extends Zaposleni {

    public Kostimograf(String imeZaposlenog, String pozoriste) {
        super(imeZaposlenog, pozoriste);

    }


    @Override
    public String imePosla() {
        return "Kostimograf";
    }


}
