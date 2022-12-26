/*
Klavyeden girilen bir say�n�n m�kemmel say� olup/olmad���n� bulan ve say� m�kemmel say� ise ekrana �m�kemmel say�d�r.� de�ilse �m�kemmel say� de�ildir.� ifadelerini ekrana yazan program� Java dilinde yaz�n�z.

M�kemmel Say� Nedir ?
Bir say�n�n kendisi hari� pozitif tam say� �arpanlar� (kalans�z b�len say�lar�n) toplam� kendisine e�it olan say�ya m�kemmel say� denir.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ka� defa say� gireceksiniz:");
        int limit = input.nextInt();
        for ( int i = 0; i < limit ; i++) {          /*   13. ve 15. sat�r  iste�e ba�l� olarak yapt�m      */

            System.out.print("Bir Say� Giriniz:");
            int n = input.nextInt();
            int total = 0;

            for (int j = 1; j < n; j++) {


                if (n % j == 0) {
                    total = total + j;

                }
            }
            if (total == n) {
                System.out.println("m�kemmel say�d�r:" + n);
            } else {
                System.out.println("M�kemmel say� de�ildir: " + n);

            }
        }
        System.out.println(" Program bitti");
        }
    }

