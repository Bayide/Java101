/*
Java ile kullan�c�n�n girdi�i de�erler ile �sl� say� hesaplayan program� "For D�ng�s�" kullanarak yap�n�z.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("�ss� al�nacak sayi giriniz :");
        n = input.nextInt();
        System.out.println("�s olacak say� giriniz");
        k = input.nextInt();
        int total = 1;

        for (int i = 1; i <= k;  i++) {
            total *=n;

        }
        System.out.println("cevap "+ total);
    }
}

