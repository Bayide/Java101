/*
Java d�ng�ler ile 0'dan girilen say�ya kadar olan say�lardan 3 ve 4'e tam b�l�nen say�lar�n ortalamas�n� hesaplayan program� yaz�n�z.
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


