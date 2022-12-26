/*
Java ile basamak sayýsýnýn kullanýcýdan alýnan ve döngüler kullanýlarak, yýldýzlar(*) ile ekrana ters üçgen çizen programý yazýn.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       System.out.print("Ters Üçgen Yapýmý için sayý giriniz:");
        int n = input.nextInt();

        for (int i = n; i >=1; i--) {
            for (int j=0; j<(n-i); j++){
                System.out.print(" ");  /*print içerisinde ("") yazýnca basamak kaymýyor   */
             }
            for (int b=2*i-1;b>0;b--){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}

