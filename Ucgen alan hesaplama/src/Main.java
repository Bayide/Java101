/*
Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     double a,b,c;
     Scanner girdi = new Scanner(System.in);

        System.out.println("1.kenarı giriniz: ");
        a=girdi.nextInt();
        System.out.println("2.kenarı giriniz");
        b=girdi.nextInt();
        System.out.println("3.kenarı giriniz");
        c=girdi.nextInt();
        double u, cevre;
        double alan ;
        u = (a+b+c) / 2;
         cevre=2*u ;
          alan =Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;
        System.out.println("ucgenın cevresı:"+cevre + "\nucgenın alanı:"+alan);


    }
}


