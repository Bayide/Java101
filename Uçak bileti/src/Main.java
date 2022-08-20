/*
Ödev - Uçak Bileti Fiyatý Hesaplama
Java ile mesafeye ve þartlara göre uçak bileti fiyatý hesaplayan programý yapýn. Kullanýcýdan Mesafe (KM), yaþý ve yolculuk tipi (Tek Yön, Gidiþ-Dönüþ) bilgilerini alýn. Mesafe baþýna ücret 0,10 TL / km olarak alýn. Ýlk olarak uçuþun toplam fiyatýný hesaplayýn ve sonrasýnda ki koþullara göre müþteriye aþaðýdaki indirimleri uygulayýn ;
Kullanýcýdan alýnan deðerler geçerli (mesafe ve yaþ deðerleri pozitif sayý, yolculuk tipi ise 1 veya 2) olmalýdýr. Aksi takdirde kullanýcýya "Hatalý Veri Girdiniz !" þeklinde bir uyarý verilmelidir.
Kiþi 12 yaþýndan küçükse bilet fiyatý üzerinden %50 indirim uygulanýr.
Kiþi 12-24 yaþlarý arasýnda ise bilet fiyatý üzerinden %10 indirim uygulanýr.
Kiþi 65 yaþýndan büyük ise bilet fiyatý üzerinden %30 indirim uygulanýr.
Kiþi "Yolculuk Tipini" gidiþ dönüþ seçmiþ ise bilet fiyatý üzerinden %20 indirim uygulanýr.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, yolculuktipi;
        double yasIndirimý;

        Scanner input = new Scanner(System.in);

        System.out.println("Km deðerini giriniz");
        km = input.nextInt();
        System.out.println("Yaþýnýzý Giriniz");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini seçiniz :");
        System.out.println("1 Tek yön/2 Gidiþ-Dönüþ");
        yolculuktipi = input.nextInt();

        if ((km > 0) && (yas > 0) && (yolculuktipi == 1 || yolculuktipi == 2)) {
            if (yas < 12) {
                yasIndirimý = 0.50;

            } else if (yas > 12 && yas < 24) {
                yasIndirimý = 0.10;

            } else if (yas > 65)
                yasIndirimý = 0.30;
            else {
                yasIndirimý = 0;
            }

            double normalTutar = km * 0.10;
            double YasIndirimi = normalTutar * yasIndirimý;
            double tutarIndirimi = normalTutar - YasIndirimi;
            double Toplamtutar;

            if (yolculuktipi == 2) {
                double gidisDonusIndirimi = tutarIndirimi * 0.20;
                Toplamtutar = (tutarIndirimi - gidisDonusIndirimi) * 2;
            } else {

                Toplamtutar = tutarIndirimi;

            }

            System.out.println("Toplam Tutar : " + Toplamtutar + " TL");


        } else {

            System.out.println(" Hatalý Veri Girdiniz.. ! ");

        }
    }

}



