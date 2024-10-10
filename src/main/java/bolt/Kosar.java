package bolt;

import java.util.ArrayList;
import java.util.List;

public class Kosar {

    List<Termek> termekek = new ArrayList<>();

    public List<Termek> getTermekek() {
        return termekek;
    }

    public void setTermekek(List<Termek> termekek) {
        this.termekek = termekek;
    }

    public int szamolOsszeg() {
        int osszeg = 0;
        for (Termek termek: termekek) {
            osszeg += termek.getAr();
        }
        return osszeg;
    }
}
