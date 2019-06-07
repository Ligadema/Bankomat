package by.yandex.sidvlada;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Locale localeRu = new Locale("ru", "RU");

        ATM atm = new ATM();

        atm.addCash(5, 1, 2);
        atm.getCash(590);

    }
}

