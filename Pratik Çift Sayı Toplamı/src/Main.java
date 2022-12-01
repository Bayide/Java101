/*
Java döngüler ile 0'dan girilen sayýya kadar olan sayýlardan 3 ve 4'e tam bölünen sayýlarýn ortalamasýný hesaplayan programý yazýnýz.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, toplam = 0, ortalama = 0, bolme = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        k = inp.nextInt();

        for (int i = 0; i < k; i++) {
            if (i % 12 == 0) {
                System.out.println(i);
                toplam = toplam+i;
                bolme ++;
                ortalama = toplam/bolme;


            }
        }
        System.out.println("sonuc" + ortalama);
    }
}


