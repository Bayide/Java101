/*
Java ile kullanýcýnýn girdiði deðerler ile üslü sayý hesaplayan programý "For Döngüsü" kullanarak yapýnýz.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alýnacak sayi giriniz :");
        n = input.nextInt();
        System.out.println("Üs olacak sayý giriniz");
        k = input.nextInt();
        int total = 1;

        for (int i = 1; i <= k;  i++) {
            total *=n;

        }
        System.out.println("cevap "+ total);
    }
}

