public class Uczen extends Osoba{
    //dziedziczenie, musi dziedziczyć konstruktor od Osoba
    //Uczen to klasa potomna. Osoba to klasa bazowa. Uczen dziedziczy wszystko po klasie Osoba
    private int nrEwidencyjny;

    public Uczen(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);  //wywołujemy konstruktor klasy bazowej
    }

    public Uczen(String imie, String nazwisko, int wiek, int nrEwidencyjny) {
        super(imie, nazwisko, wiek);
        this.nrEwidencyjny = nrEwidencyjny;
    }
}
