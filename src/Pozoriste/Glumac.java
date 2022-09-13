package Pozoriste;


public class Glumac extends Zaposleni {
    public Glumac(String imeZaposlenog, String pozoriste) {
        super(imeZaposlenog, pozoriste);
    }

    @Override
    public String imePosla() {
        return "Glumac";
    }

}
