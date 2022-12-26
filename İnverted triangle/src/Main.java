/*
Java ile basamak say�s�n�n kullan�c�dan al�nan ve d�ng�ler kullan�larak, y�ld�zlar(*) ile ekrana ters ��gen �izen program� yaz�n.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       System.out.print("Ters ��gen Yap�m� i�in say� giriniz:");
        int n = input.nextInt();

        for (int i = n; i >=1; i--) {
            for (int j=0; j<(n-i); j++){
                System.out.print(" ");  /*print i�erisinde ("") yaz�nca basamak kaym�yor   */
             }
            for (int b=2*i-1;b>0;b--){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}

