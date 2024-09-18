import java.util.Scanner;

public abstract class Osoba {
    //klasa abstrakcyjna nie pozwala na utworzenie obiektów tej klasy
    //hermetyzacja - zmiana, na tylko co chcemy pokazać lub zmieniać
    //modyfikator dostępu: private, protected
    //private - czyli widoczne tylko wewnątrz klasy
    private String imie;
    protected String nazwisko;
    private int wiek;

    //przeciążanie konstruktora, 3 konstruktory o rónych argumentach
    public Osoba(String imie, String nazwisko, int wiek) { //konstruktor
        this.imie = imie;
        this.nazwisko = nazwisko;

    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek = 7;
    }

    public Osoba() {
        imie = "";
        nazwisko = "";
    }

    //metody dostępowe:
    //gettery i settery (xd?)

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }


    public void setImie(String imie) {
        //zabezpieczenia, przed nieporządaną zmianą
        System.out.println("Podaj hasło:");
        Scanner klawiatura = new Scanner(System.in);
        String haslo = klawiatura.next();
        if(haslo.equals("qwe123")){
            this.imie = imie;
        }else{
            System.out.println("Błędne hasło.");
        }
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba " +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek;
    }
}
