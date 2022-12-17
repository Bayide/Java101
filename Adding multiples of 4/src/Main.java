/*
Ödev
Java döngüleri ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul eden ve girilen deðerlerden çift ve 4'ün katlarý olan zincirleri toplayýp ekrana basan programý yazýyoruz.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Bir Sayý Giriniz");
            n = scan.nextInt();
            if (n % 4 == 0) {
                total += n;
                System.out.println("Toplam:" + total);
            }

        }
        while (n % 2 == 0) ;
    }
}


