/*
�dev
Java ile girilen say�n�n harmonik serisini bulan program yazaca��z.
Harmonik Seri Form�l� : 1+(1/2)+(1/3)+(1/4)+(1/n)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("N say�s� giriniz");
        int n = input.nextInt();
        double total =0;

        for (double i =1;i<=n; i++){     /*for(double)  yerine int yaparsam sonu� k�s�ratl� ��kmaz */
            total += (1/i);
        }
        System.out.println(total);

    }
}


