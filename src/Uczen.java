public class Uczen extends Osoba{
    //dziedziczenie, musi dziedziczyć konstruktor od Osoba
    //Uczen to klasa potomna. Osoba to klasa bazowa. Uczen dziedziczy wszystko po klasie Osoba
    private int nrEwidencyjny;
    static int liczbaObiektow; //zmienna statyczna

    public Uczen(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);  //wywołujemy konstruktor klasy bazowej
        liczbaObiektow++;
        nrEwidencyjny = liczbaObiektow;
    }

    public Uczen(String imie, String nazwisko, int wiek, int nrEwidencyjny) {
        super(imie, nazwisko, wiek);
        this.nrEwidencyjny = nrEwidencyjny;
        liczbaObiektow++;
    }

    @Override // to string
    public String toString() {
        return "Uczen imie: " + getImie() + ", nazwisko: " + nazwisko + ", nrEwidencyjny: " + nrEwidencyjny;
    }
}
