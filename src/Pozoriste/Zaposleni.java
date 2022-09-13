package Pozoriste;

//apstraktna klasa
public abstract class Zaposleni {
    private String imeZaposlenog;
    private String pozoriste;

    public Zaposleni(String imeZaposlenog, String pozoriste) {
        this.imeZaposlenog = imeZaposlenog;
        this.pozoriste = pozoriste;
    }

    public abstract String imePosla();

    public String getImeZaposlenog() {
        return imeZaposlenog;
    }

    public String getPozoriste() {
        return pozoriste;
    }

}
