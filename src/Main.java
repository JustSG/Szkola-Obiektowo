public class Main {
    public static void main(String[] args) {
        /*
        Osoba osobaJas = new Osoba("Jaś", "Kowalski", 12);
        System.out.println("imie: " + osobaJas.getImie());
        osobaJas.setImie("Jan");
        System.out.println("zmienione imie: " + osobaJas.getImie());
        Osoba osobaIsia = new Osoba("Isia","Iksińska");
        Osoba osobaX = new Osoba();
        System.out.println(osobaIsia.getWiek());
        System.out.println(osobaX.getWiek());
        System.out.println(osobaIsia);
        */

        Uczen uczenEmil = new Uczen("Emil", "Smolasty", 7, 66);
        System.out.println(uczenEmil);

        System.out.println("Liczba utworzonych obiektów: " + Uczen.liczbaObiektow);
        Uczen uczen2 = new Uczen("Artur", "Rachubiński", 15);
        System.out.println("Liczba utworzonych obiektów: " + Uczen.liczbaObiektow);
        Uczen uczen3 = new Uczen("Piotr", "Morański", 17);
        System.out.println("Liczba utworzonych obiektów: " + Uczen.liczbaObiektow);
        Uczen uczen4 = new Uczen("Wiktor", "Cebula", 17);
        System.out.println("Liczba utworzonych obiektów: " + Uczen.liczbaObiektow);

        Nauczyciel nauczyciel = new Nauczyciel("Ryszard", "Koleski", 57, "Geografia");
        Klasa klasaProgramistyczna = new Klasa("3P", nauczyciel);
        Klasa klasaBiologiczna = new Klasa("3B", nauczyciel);

        klasaProgramistyczna.dodajUczniaDoKlasy(uczenEmil);
        klasaProgramistyczna.dodajUczniaDoKlasy(uczen2);
        klasaProgramistyczna.dodajUczniaDoKlasy(uczen3);
        klasaProgramistyczna.dodajUczniaDoKlasy(uczen4);

        System.out.println(klasaProgramistyczna);
        klasaProgramistyczna.wypiszListeUczniow();

        Szkola zs10 = Szkola.getSzkola();
        klasaProgramistyczna.usunUczniaZKlasy(uczen3);

        klasaProgramistyczna.wypiszListeUczniow();
    }
}