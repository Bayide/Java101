/*
Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int r ,a ;
     double pi=3.14 ;
     Scanner girdi = new Scanner(System.in);
        System.out.println("Yarıçap değerini giriniz:");
        r= girdi.nextInt();
        System.out.println("Merkez Açısı Ölçüsünü giriniz:");
        a= girdi.nextInt();
        double alan =(pi*(r*r)*a)/360 ;
        System.out.println("Dairenin alanı"+ alan);

    }
}


