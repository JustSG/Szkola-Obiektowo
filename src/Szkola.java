import java.util.ArrayList;

public class Szkola {
    private static Szkola szkola = new Szkola();
    private ArrayList<Uczen> uczniowie = new ArrayList<>();
    private ArrayList<Klasa> klasy = new ArrayList<>();
    private Szkola(){
    }

    public static Szkola getSzkola() {  //metoda, jest statyczna | statyczna tylko dla klasy
        return szkola;
    }
    public void dodajUczniaDoSzkoly(Uczen uczen){
        uczniowie.add(uczen);
    }
    public void dodajUczniaDoSzkoly(String imie, String nazwisko, int wiek){
        uczniowie.add(new Uczen(imie, nazwisko, wiek));
    }
    public void przypiszUczniaDoKlasy(Klasa klasa, Uczen uczen){
        klasa.dodajUczniaDoKlasy(uczen);
    }
    public void przeniesUczniaDoInnejKlasy(Klasa dodajUczniaDoKlasy, Klasa usunUczniaZKlasy){
        uczniowie.
    }
}
