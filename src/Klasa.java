import java.util.ArrayList;

public class Klasa {
    private String nrKlasy;
    private ArrayList<Uczen> uczniowie;
    private Nauczyciel wychowawca;

    public Klasa(String nrKlasy, Nauczyciel wychowawca) {   //nowy obiekt
        this.nrKlasy = nrKlasy;
        this.wychowawca = wychowawca;
        uczniowie = new ArrayList<>();
    }
    public void dodajUczniaDoKlasy(Uczen uczen){
        if(uczniowie.contains(uczen)){
            System.out.println("Uczeń został już dodany");
        }else {
            uczniowie.add(uczen);
        }
    }
    public void wypiszListeUczniow(){
        for (int i = 0; i < uczniowie.size(); i++) {
            System.out.println(i+1 + ". " + uczniowie.get(i).getImie() + " " + uczniowie.get(i).getNazwisko());
        }
    }
    public void usunUczniaZKlasy(Uczen uczen){
        if(uczniowie.contains(uczen)) {
            uczniowie.remove(uczen);
        }else{
            System.out.println("Taka osoba nie istnieje!");
        }
    }

    @Override
    public String toString() {
        return "Klasa: " + "nrKlasy: '" + nrKlasy + '\'' + ", uczniowie: " + uczniowie + ", wychowawca: " + wychowawca;
    }
}
