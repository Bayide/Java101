/*
�dev
N elemanl� bir k�menin elemanlar� ile olu�turulacak r elemanl� farkl� gruplar�n say�s� n�in r�li kombinasyonu olarak adland�r�l�r. N�in r�li kombinasyonu C(n,r) �eklinde g�sterilir.

Java ile kombinasyon hesaplayan program yaz�n�z.

Kombinasyon form�l�
C(n,r) = n! / (r! * (n-r)!)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r,i ,combination;
        int rislem = 1, nislem = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kombinasyon form�l�ne Ho� geldiniz Birinci Say�y� Giriniz: ");
        n = scan.nextInt();
        System.out.print("�kinci Say�y� Giriniz: ");
        r = scan.nextInt();
        if(n<r){
            System.out.println("1.say� 2.say�dan k���k olamaz tekrar deneyiniz");
        }
        for (i = 1; i <= r; i++) {
            rislem *=i;
            nislem *=n;
            n--;
        }

        combination = nislem / rislem;
        System.out.println("Kombinasyon sonucu : "+ combination);
    }
}

