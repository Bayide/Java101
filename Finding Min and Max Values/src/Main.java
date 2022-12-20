/*
Java ile klavyeden girilen N tane sayma sayýsýndan en büyük ve en küçük sayýlarý bulan ve bu sayýlarý ekrana yazan programý yazýn.


 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min=0 , max=0;
        Scanner num = new Scanner(System.in);
        System.out.println("Kaç tane sayý gireceksiniz");
        int n = num.nextInt();
        System.out.println("sayý giriniz");

        for (int i = 1; i <= n; i++) {
            System.out.println(i+"sayý gir");
            int sayi= num.nextInt();

            if (i == 1) {
                max=sayi;
                min=sayi;
            }

            if(sayi>=max) {
                max =sayi;
            } else if (sayi <=min) {
                min =sayi;

            }

        }
        System.out.println("En küçük sayý"+min);
        System.out.println("En büyük sayý"+max);
    }
}

