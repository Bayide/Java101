/*
�in Zodya�� nedir?

4000 bin y�ld�r kullan�lan bir astroloji �e�ididir �in astrolojisi ve insanlar� 12 de�i�ik bur� ve sembollerle tan�mlar. �in Zodya�� bu 12 burcun e�it aral�klarla(10 derece geni�li�inde) s�raland��� bir hayvan halkas�d�r ve y�ld�zlarla pek bir ilgisi yoktur.

�in Zodya�� nas�l hesaplan�r?

�in zodya�� hesaplan�rken ki�inin do�um y�l�n�n 12 ile b�l�m�nde kalana g�re bulunur.

Do�um Tarihi %12 = 0 ? Maymun

Do�um Tarihi %12 = 1 ? Horoz

Do�um Tarihi %12 = 2 ? K�pek

Do�um Tarihi %12 = 3 ? Domuz

Do�um Tarihi %12 = 4 ? Fare

Do�um Tarihi %12 = 5 ? �k�z

Do�um Tarihi %12 = 6 ? Kaplan

Do�um Tarihi %12 = 7 ? Tav�an

Do�um Tarihi %12 = 8 ? Ejderha

Do�um Tarihi %12 = 9 ? Y�lan

Do�um Tarihi %12 = 10 ? At

Do�um Tarihi %12 = 11 ? Koyun
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, remainder;
        String horoscope ="";
        Scanner input = new Scanner(System.in);

        System.out.print("L�tfen Do�um y�l�n�z� Giriniz:");
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
                horoscope = "K�pek";
                break;
            case 3:
                horoscope = "Domuz";
                break;
            case 4:
                horoscope = "Fare";
                break;
            case 5:
                horoscope = "�k�z";
                break;
            case 6:
                horoscope = "Kaplan";
                break;
            case 7:
                horoscope = "Tav�an";
                break;
            case 8:
                horoscope = "Ejderha";
                break;
            case 9:
                horoscope = "Y�lan";
                break;
            case 10:
                horoscope = "At";
                break;
            case 11:
                horoscope = "Koyun";
                break;
        }
            System.out.print("�in Zodya�� Burcunuz:" + horoscope);
    }
}


