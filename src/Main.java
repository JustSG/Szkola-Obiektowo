public class Main {
    public static void main(String[] args) {
        Osoba osobaJas = new Osoba("Jaś", "Kowalski", 12);
        System.out.println("imie: " + osobaJas.getImie());
        osobaJas.setImie("Jan");
        System.out.println("zmienione imie: " + osobaJas.getImie());
        Osoba osobaIsia = new Osoba("Isia","Iksińska");
        Osoba osobaX = new Osoba();
        System.out.println(osobaIsia.getWiek());
        System.out.println(osobaX.getWiek());
        System.out.println(osobaIsia);

        Uczen uczenEmil = new Uczen("Emil", "Smolasty", 7, 66);
        System.out.println(uczenEmil);

        System.out.println("Liczba utworzonych obiektów: " + Uczen.liczbaObiektow);
        Uczen uczen2 = new Uczen("Artur", "Rachubiński", 15);
        System.out.println("Liczba utworzonych obiektów: " + Uczen.liczbaObiektow);
        Uczen uczen3 = new Uczen("Piotr", "Morański", 17);
        System.out.println("Liczba utworzonych obiektów: " + Uczen.liczbaObiektow);
        Uczen uczen4 = new Uczen("Wiktor", "Cebula", 17);
        System.out.println("Liczba utworzonych obiektów: " + Uczen.liczbaObiektow);
    }
}