/*
�dev
Java d�ng�leri ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul eden ve girilen de�erlerden �ift ve 4'�n katlar� olan zincirleri toplay�p ekrana basan program� yaz�yoruz.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Bir Say� Giriniz");
            n = scan.nextInt();
            if (n % 4 == 0) {
                total += n;
                System.out.println("Toplam:" + total);
            }

        }
        while (n % 2 == 0) ;
    }
}


