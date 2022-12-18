/*
Ödev
Bir sayýnýn basamak sayýlarýnýn toplamýný hesaplayan program yazýnýz.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14


 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Bir sayý giriniz");
        int n = input.nextInt();
        int toplam =0 ;


        while(n !=0){
        toplam =n%10+toplam;
        n/=10;
        }

        System.out.println("sayi"+toplam);


    }

}


