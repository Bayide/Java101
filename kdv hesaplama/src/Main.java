/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.1
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double fiyat,kdvoran =0.18 ,kdvlitutar,kdvtutar,kdv;
       Scanner input =new Scanner(System.in);
        System.out.println("ücret Tutarını Giriniz:");
        fiyat = input.nextDouble();

        kdvtutar= fiyat * kdvoran;
        kdvlitutar= fiyat + kdvtutar;
         if (fiyat<1000)
             kdvoran = 18;
         else kdvoran=8;
         kdv=((fiyat*kdvoran))/100;



        System.out.println("kdvsiz tutar :" + fiyat);
        System.out.println("kdvoran" +kdvoran) ;
        System.out.println("kdv tutarı"+kdvtutar);
        System.out.println("kdvli tutar"+ kdvlitutar);


    }
}
