/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     double a,e,d,m,p,totalprice;
     double a1,e1,d1,m1,p1 ;
     Scanner girdi = new Scanner(System.in);
        System.out.println("Armut kaç kilo ?:");
        a1= girdi.nextDouble();
        System.out.println("elma kaç kilo ?:");
        e1= girdi.nextDouble();
        System.out.println("domates kaç kilo ?:");
        d1= girdi.nextDouble();
        System.out.println("muz kaç kilo ? :");
        m1= girdi.nextDouble();
        System.out.println("patlıcan kaç kilo ?:");
        p1= girdi.nextDouble();

        a =a1*2.14;
        e =e1*3.67;
        d =d1*1.11;
        m =m1*0.95;
        p =p1*5;
        totalprice = (a+e+d+m+p);
        System.out.println("Toplam tutar" + totalprice);

    }
}


