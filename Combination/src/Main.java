/*
Ödev
N elemanlý bir kümenin elemanlarý ile oluþturulacak r elemanlý farklý gruplarýn sayýsý n’in r’li kombinasyonu olarak adlandýrýlýr. N’in r’li kombinasyonu C(n,r) þeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazýnýz.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r,i ,combination;
        int rislem = 1, nislem = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kombinasyon formülüne Hoþ geldiniz Birinci Sayýyý Giriniz: ");
        n = scan.nextInt();
        System.out.print("Ýkinci Sayýyý Giriniz: ");
        r = scan.nextInt();
        if(n<r){
            System.out.println("1.sayý 2.sayýdan küçük olamaz tekrar deneyiniz");
        }
        for (i = 1; i <= r; i++) {
            rislem *=i;
            nislem *=n;
            n--;
        }

        combination = nislem / rislem;
        System.out.println("Kombinasyon sonucu : "+ combination);
    }
}

