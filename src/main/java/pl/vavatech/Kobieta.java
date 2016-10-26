package pl.vavatech;

public class Kobieta extends Osoba {


    public Kobieta(String imie, String nazwisko, int wiek, int waga, int wzrost) {
        super(imie, nazwisko, wiek, waga, Plec.KOBIETA,wzrost);
    }

    @Override
    public boolean czyJestWysoka() {
        System.out.println("KOBIETA");
        return wzrost >= 150;
    }


}

