package company.bank;

import pl.vavatech.Kobieta;
import pl.vavatech.Mezczyzna;

import java.math.BigDecimal;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto(new BigInteger("12345678912345678912345678"), new BigDecimal("0"), "PLN", new Mezczyzna("Jan", "Kowalski", 65, 12, 210));  // <---- Tu konstruktor został wywołany wymagane jest podanie wszystkich parametry które zostały zadeklarowane w konstruktorze.
       // konto.numerKonta = new BigInteger("12345678912345678912345678"); //<--- po stworzeniu konstruktora te parametry znajdują się w nawiasach linijka wyżej.
        Konto konto2 = new Konto(new BigInteger("1234567891234567891234666"), new BigDecimal("0"), "PLN", new Kobieta("Kasia", "Kowalska", 50, 10, 150));

                konto.wplac(new BigDecimal("1000.02"));

        System.out.println(konto.stanKonta);
    }
}
