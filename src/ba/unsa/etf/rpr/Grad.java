package ba.unsa.etf.rpr;

public class Grad {
    private int id;
    private String naziv;
    private int brojStanovnika;
    private Drzava drzava;
    private int nadmorska_visina=0;



    public Grad(int id, String naziv, int brojStanovnika, Drzava drzava, int nadmorska_visina) {
        this.id = id;
        this.naziv = naziv;
        this.brojStanovnika = brojStanovnika;
        this.drzava = drzava;
        this.nadmorska_visina=nadmorska_visina;
    }

    public Grad() {
    }
    public int getNadmorskaVisina() {
        return nadmorska_visina;
    }

    public void setNadmorskaVisina(int nadmorska_visina) {
        this.nadmorska_visina = nadmorska_visina;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
    }

    @Override
    public String toString() { return naziv; }
}
