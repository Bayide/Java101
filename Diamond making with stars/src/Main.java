/*
�dev
Java'da d�ng�ler kullanarak y�ld�zlar ile elmas yap�n�z.

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Say� Giriniz:");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            for (int x = n - 1; x >= 1; x--) {

                 for (int a = 1; a <= (n - x); a++) {
                    System.out.print(" ");
        }
             for (int b = 1; b <= (2 * x) - 1; b++) {
                 System.out.print("*");
        }
         System.out.println();
                }
            }
        }


