/*
Ödev
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     double Kilo ,Boy ;
     Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu(metre cinsinde)giriniz:");
        Boy = girdi.nextDouble();
        System.out.println("Lütfen kilonuzunu  giriniz:");
        Kilo= girdi.nextDouble();
        double alan =Kilo/Boy* Boy ;
        System.out.println("Vücut Kitle Endeksiniz"+ alan);

    }
}


