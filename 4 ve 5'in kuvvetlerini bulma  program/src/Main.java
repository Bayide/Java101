/*
Java döngüler ile girilen sayýya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdýran programý yazýyoruz.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        n = inp.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i + "");
        }
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i+"");
        }
    }
}

