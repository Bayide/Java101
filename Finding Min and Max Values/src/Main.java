/*
Java ile klavyeden girilen N tane sayma say�s�ndan en b�y�k ve en k���k say�lar� bulan ve bu say�lar� ekrana yazan program� yaz�n.


 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min=0 , max=0;
        Scanner num = new Scanner(System.in);
        System.out.println("Ka� tane say� gireceksiniz");
        int n = num.nextInt();
        System.out.println("say� giriniz");

        for (int i = 1; i <= n; i++) {
            System.out.println(i+"say� gir");
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
        System.out.println("En k���k say�"+min);
        System.out.println("En b�y�k say�"+max);
    }
}

