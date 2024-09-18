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
    }
}