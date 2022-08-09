/*         Ödev

Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart


*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int day,month;
        Scanner input= new Scanner(System.in);
        System.out.println("Doğum Gününüzü Giriniz:");
        day= input.nextInt();
        System.out.println("Doğum Ayınızı Giriniz:");
        month= input.nextInt();

        if (  (day>=21 && day<=31 && month==3) || (day>=1 && day<=20) && month==4       ){
            System.out.println("Koç Burcusunuz");
        }
        else if (  (day>=21 && day<=30 && month==4) || (day>=1 && day<=21) && month==5  ){
            System.out.println("Boğa Burcusunuz");
        }
        else if (  (day>=22 && day<=31 && month==5) || (day>=1 && day<=22) && month==6  ){
            System.out.println("İkizler Burcusunuz");
        }
        else if (  (day>=23 && day<=30 && month==6) || (day>=1 && day<=22) && month==7  ){
            System.out.println("Yengeç Burcusunuz");
        }
        else if (  (day>=23 && day<=31 && month==7) || (day>=1 && day<=22) && month==8  ){
            System.out.println("Aslan Burcusunuz");
        }
        else if (  (day>=23 && day<=31 && month==8) || (day>=1 && day<=22) && month==9  ){
            System.out.println("Başak Burcusunuz");
        }
        else if (  (day>=23 && day<=30 && month==9) || (day>=1 && day<=22) && month==10  ){
            System.out.println("Terazi Burcusunuz");
        }
        else if (  (day>=23 && day<=31 && month==10) || (day>=1 && day<=22) && month==11  ){
            System.out.println("Akrep Burcusunuz");
        }
        else if (  (day>=22 && day<=30 && month==11) || (day>=1 && day<=21) && month==12  ){
            System.out.println("Yay Burcusunuz");
        }
        else if (  (day>=22 && day<=31 && month==12) || (day>=1 && day<=21) && month==1  ){
            System.out.println("Oğlak Burcusunuz");
        }
        else if (  (day>=22 && day<=31 && month==1) || (day>=1 && day<=19) && month==2  ){
            System.out.println("Kova Burcusunuz");
        }
        else if (  (day>=20 && day<=28 && month==2) || (day>=1 && day<=20) && month==3  ){
            System.out.println("Balık Burcusunuz");
        }
    }
}

