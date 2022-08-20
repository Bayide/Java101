/*
Çin Zodyaðý nedir?

4000 bin yýldýr kullanýlan bir astroloji çeþididir Çin astrolojisi ve insanlarý 12 deðiþik burç ve sembollerle tanýmlar. Çin Zodyaðý bu 12 burcun eþit aralýklarla(10 derece geniþliðinde) sýralandýðý bir hayvan halkasýdýr ve yýldýzlarla pek bir ilgisi yoktur.

Çin Zodyaðý nasýl hesaplanýr?

Çin zodyaðý hesaplanýrken kiþinin doðum yýlýnýn 12 ile bölümünde kalana göre bulunur.

Doðum Tarihi %12 = 0 ? Maymun

Doðum Tarihi %12 = 1 ? Horoz

Doðum Tarihi %12 = 2 ? Köpek

Doðum Tarihi %12 = 3 ? Domuz

Doðum Tarihi %12 = 4 ? Fare

Doðum Tarihi %12 = 5 ? Öküz

Doðum Tarihi %12 = 6 ? Kaplan

Doðum Tarihi %12 = 7 ? Tavþan

Doðum Tarihi %12 = 8 ? Ejderha

Doðum Tarihi %12 = 9 ? Yýlan

Doðum Tarihi %12 = 10 ? At

Doðum Tarihi %12 = 11 ? Koyun
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, remainder;
        String horoscope ="";
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Doðum yýlýnýzý Giriniz:");
        year = input.nextInt();
        remainder=year% 12;

        switch (remainder) {
            case 0:
                horoscope = "Maymun";
                break;
            case 1:
                horoscope = "Horoz";
                break;
            case 2:
                horoscope = "Köpek";
                break;
            case 3:
                horoscope = "Domuz";
                break;
            case 4:
                horoscope = "Fare";
                break;
            case 5:
                horoscope = "Öküz";
                break;
            case 6:
                horoscope = "Kaplan";
                break;
            case 7:
                horoscope = "Tavþan";
                break;
            case 8:
                horoscope = "Ejderha";
                break;
            case 9:
                horoscope = "Yýlan";
                break;
            case 10:
                horoscope = "At";
                break;
            case 11:
                horoscope = "Koyun";
                break;
        }
            System.out.print("Çin Zodyaðý Burcunuz:" + horoscope);
    }
}


