/*
Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik,kimya,turkce,tarih,muzik;

        Scanner input=  new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat+ fizik+ kimya+ turkce+tarih+muzik);
        double sonuc = toplam/ 6.00 ;
        System.out.println("Ortalamanız:  "+sonuc);

        boolean kosul1 = sonuc <=60;
        String str = kosul1 ? "Sınıfta Kaldınız :(" : "Sınıfı Geçtiniz :)";
        System.out.println(str);

    }
}
