/*
Ödev
Java ile girilen sayýnýn harmonik serisini bulan program yazacaðýz.
Harmonik Seri Formülü : 1+(1/2)+(1/3)+(1/4)+(1/n)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("N sayýsý giriniz");
        int n = input.nextInt();
        double total =0;

        for (double i =1;i<=n; i++){     /*for(double)  yerine int yaparsam sonuç küsüratlý çýkmaz */
            total += (1/i);
        }
        System.out.println(total);

    }
}


