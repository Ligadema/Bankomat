package by.yandex.sidvlada;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ATM {

    ResourceBundle ru = ResourceBundle.getBundle("Bundle", new Locale("ru", "RU"));
    //Locale localeRu = new Locale("ru", "RU");

    private int hundred;
    private int fifty;
    private int twenty;


    public void addCash(int hundred, int fifty, int twenty) {
        this.hundred = hundred;
        this.fifty = fifty;
        this.twenty = twenty;
    }

    void getCash(int a) {

        System.out.println ("Choose language, please: EN (enter 1) or RU (enter 2)" + "\nПожалуйста, выберите язык: Английский (нажмите 1) или Русский (нажмите 2)");
        Scanner scanner = new Scanner(System.in);
        int language = scanner.nextInt();

        while (language != 1 && language != 2) {
            System.out.println("Incorrect count \nНекорректное значение" );
            return;
        }

        boolean b;
        if (a % 50 != 0 && a % 20 != 0 && (a-20)%50 !=0 && (a-40)%50 !=0 || a==0) {
            if (language == 1) {
                System.out.println("Please enter correct nominal (multiple of 20 or 50). Thanks!");
                return;}
            else if (language == 2){
                System.out.println ("Пожалуйста, введите корректную сумму (кратную 20 или 50). Спасибо!");}
            return;
        } else {
            if ((hundred * 100 + fifty * 50 + twenty * 20) >= a) {
                b = true;
                if (language == 1) {
                    System.out.println("Wait a few seconds please"); } //Wait a few seconds please"
                else if (language == 2){
                    System.out.println (ru.getString("Wait"));} //"Подождите несколько секунд, пожалуйста"
            } else {
                b = false;
                if (language == 1) {
                    System.out.println(("Sorry, no money :("));
                    return;}
                else if (language == 2){
                    System.out.println ("Извините, денег нет. Но вы держитесь:)");
                    return;}
            }
            final int h = 100;
            final int f = 50;
            final int t = 20;

            int d;

            if (a >= h) {
                d = a / h;
                int c = a % h;
                if (c >= (f+t)) {
                    int x = c / f;
                    int e = c % f;
                    int g = e/t;
                    if (language == 1) {
                        System.out.println("Take your money, please\n" + "nominal of money: " + h + " " + "count: "  +  d + " and " + "nominal of money: " + f + " count: " + x + " and " + "nominal of money: " + t + " count: " + g );
                    }
                    else if (language == 2){
                        System.out.println("Пожалуйста, возьмите деньги\n" + "номинал: " + h + " " + " количество: "  +  d + " и " + "номинал: " + f + " количество: " + x + " и " + "номинал: " + t + " количество: " + g );
                    }
                }
                if (c >= f && c < (f+t)) {
                    int x = c / f;
                    if (language == 1) {
                        System.out.println("Take your money, please\n" + "nominal of money: " + h + " " + "count: " + d + " and " + "nominal of money: " + f + " count: " + x);
                    } else if (language == 2) {
                        System.out.println("Пожалуйста, возьмите деньги\n" + "номинал: " + h + " " + " количество: " + d + " и " + "номинал: " + f + " количество: " + x);
                    }
                }
                if (c < f && c >= t) {
                    int x = c / t;
                    if (language == 1) {
                        System.out.println("Take your money, please\n" + "nominal of money: " + h + " " +  "count: " + d + " and " + "nominal of money: " + t + " count: " + x);
                    } else if (language == 2) {
                        System.out.println("Пожалуйста, возьмите деньги\n" + "номинал: " + h + " " + " количество: " + d + " и " + "номинал: " + t + " количество: " + x);
                    }
                }
                if (c == 0)
                    if (language == 1) {
                        System.out.println("Take your money, please\n" + "nominal of money: " + h + " count: " + d);
                    } else if (language == 2) {
                        System.out.println("Пожалуйста, возьмите деньги\n" + "номинал: " + h + " " + " количество: " + d);
                    }
            }
            if (a <h && a>f || a==(f+t) || a==(f+2*t) ) {
                d = a/f;
                int c = a % f;
                if (c>=t){
                    int x = c/t;
                    if (language == 1) {
                        System.out.println("Take your money, please\n" + "nominal of money: " + f + " " +  "count: " + d + " and " + "nominal of money: " + t + " count: " + x);
                    } else if (language == 2) {
                        System.out.println("Пожалуйста, возьмите деньги\n" + "номинал: " + f + " " + " количество: " + d + " и " + "номинал: " + t + " количество: " + x);
                    }
                }
                if (a==f) {
                    d=a/f;
                    if (language == 1) {
                        System.out.println("Take your money, please\n" + "nominal of money: " + f + " " +  "count: " + d);
                    } else if (language == 2) {
                        System.out.println("Пожалуйста, возьмите деньги\n" + "номинал: " + f + " " + " количество: " + d);
                    }
                }
                if (a<f) {
                    d = a / t;
                    if (language == 1) {
                        System.out.println("Take your money, please\n" + "nominal of money: " + t + " " + "count: " + d);
                    } else if (language == 2) {
                        System.out.println("Пожалуйста, возьмите деньги\n" + "номинал: " + t + " " + " количество: " + d);
                    }
                }
            }
        }
    }
}
