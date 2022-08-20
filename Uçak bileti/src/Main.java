/*
�dev - U�ak Bileti Fiyat� Hesaplama
Java ile mesafeye ve �artlara g�re u�ak bileti fiyat� hesaplayan program� yap�n. Kullan�c�dan Mesafe (KM), ya�� ve yolculuk tipi (Tek Y�n, Gidi�-D�n��) bilgilerini al�n. Mesafe ba��na �cret 0,10 TL / km olarak al�n. �lk olarak u�u�un toplam fiyat�n� hesaplay�n ve sonras�nda ki ko�ullara g�re m��teriye a�a��daki indirimleri uygulay�n ;
Kullan�c�dan al�nan de�erler ge�erli (mesafe ve ya� de�erleri pozitif say�, yolculuk tipi ise 1 veya 2) olmal�d�r. Aksi takdirde kullan�c�ya "Hatal� Veri Girdiniz !" �eklinde bir uyar� verilmelidir.
Ki�i 12 ya��ndan k���kse bilet fiyat� �zerinden %50 indirim uygulan�r.
Ki�i 12-24 ya�lar� aras�nda ise bilet fiyat� �zerinden %10 indirim uygulan�r.
Ki�i 65 ya��ndan b�y�k ise bilet fiyat� �zerinden %30 indirim uygulan�r.
Ki�i "Yolculuk Tipini" gidi� d�n�� se�mi� ise bilet fiyat� �zerinden %20 indirim uygulan�r.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, yolculuktipi;
        double yasIndirim�;

        Scanner input = new Scanner(System.in);

        System.out.println("Km de�erini giriniz");
        km = input.nextInt();
        System.out.println("Ya��n�z� Giriniz");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini se�iniz :");
        System.out.println("1 Tek y�n/2 Gidi�-D�n��");
        yolculuktipi = input.nextInt();

        if ((km > 0) && (yas > 0) && (yolculuktipi == 1 || yolculuktipi == 2)) {
            if (yas < 12) {
                yasIndirim� = 0.50;

            } else if (yas > 12 && yas < 24) {
                yasIndirim� = 0.10;

            } else if (yas > 65)
                yasIndirim� = 0.30;
            else {
                yasIndirim� = 0;
            }

            double normalTutar = km * 0.10;
            double YasIndirimi = normalTutar * yasIndirim�;
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

            System.out.println(" Hatal� Veri Girdiniz.. ! ");

        }
    }

}



