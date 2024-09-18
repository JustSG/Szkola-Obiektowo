public sealed class Nauczyciel  extends Osoba implements Dyzurny permits Wychowawca { //sealed mówi że ograniczamy dziedziczenie Nauczyciel
    private String przedmiot;

    public Nauczyciel(String imie, String nazwisko, int wiek, String przedmiot) {
        super(imie, nazwisko, wiek);
        this.przedmiot = przedmiot;
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Spacer po korytarzu");
    }
}
