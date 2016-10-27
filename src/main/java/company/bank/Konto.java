package company.bank;

import pl.vavatech.Osoba; ////// <---- zaimportowano klasę Osoba

import java.math.BigDecimal;
import java.math.BigInteger;

public class Konto {


    BigInteger numerKonta;
    BigDecimal stanKonta;
    String waluta;
    Osoba właściciel;

    public Konto(BigInteger numerKonta, BigDecimal stanKonta, String waluta, Osoba właściciel) { //<--- konstruktor pilnuje aby zostały wypełnione wymienione parametry
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
        this.waluta = waluta;
        this.właściciel = właściciel;
    }

    public Konto(String numerKonta, BigDecimal stanKonta, String waluta, Osoba właściciel) { //<--- konstruktor pilnuje aby zostały wypełnione wymienione parametry
        this.numerKonta = new BigInteger(numerKonta);
        this.stanKonta = stanKonta;
        this.waluta = waluta;
        this.właściciel = właściciel;
    }


    public void wplac(BigDecimal kwota) {
        stanKonta = stanKonta.add(kwota);
    }
}

