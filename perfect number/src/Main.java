/*
Klavyeden girilen bir sayýnýn mükemmel sayý olup/olmadýðýný bulan ve sayý mükemmel sayý ise ekrana “mükemmel sayýdýr.” deðilse “mükemmel sayý deðildir.” ifadelerini ekrana yazan programý Java dilinde yazýnýz.

Mükemmel Sayý Nedir ?
Bir sayýnýn kendisi hariç pozitif tam sayý çarpanlarý (kalansýz bölen sayýlarýn) toplamý kendisine eþit olan sayýya mükemmel sayý denir.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç defa sayý gireceksiniz:");
        int limit = input.nextInt();
        for ( int i = 0; i < limit ; i++) {          /*   13. ve 15. satýr  isteðe baðlý olarak yaptým      */

            System.out.print("Bir Sayý Giriniz:");
            int n = input.nextInt();
            int total = 0;

            for (int j = 1; j < n; j++) {


                if (n % j == 0) {
                    total = total + j;

                }
            }
            if (total == n) {
                System.out.println("mükemmel sayýdýr:" + n);
            } else {
                System.out.println("Mükemmel sayý deðildir: " + n);

            }
        }
        System.out.println(" Program bitti");
        }
    }

