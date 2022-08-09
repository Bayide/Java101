/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mat, fizik, turkce, kimya, mzk;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz :");
        mat = input.nextInt();
        System.out.println("Fizik notunuz :");
        fizik = input.nextInt();
        System.out.println("Türkçe notunuz :");
        turkce = input.nextInt();
        System.out.println("Kimya notunuz :");
        kimya = input.nextInt();
        System.out.println("Müzik notunuz :");
        mzk = input.nextInt();

        if(mat < 0 || mat > 100)
            mat = 0;
        if(fizik < 0 || fizik > 100)
            fizik = 0;
        if(turkce < 0 || turkce > 100)
            turkce = 0;
        if(kimya < 0 || kimya > 100)
            kimya = 0;
        if(mzk < 0 || mzk > 100)
            mzk = 0;


        double avarage = (mat + fizik + turkce + kimya + mzk) / 5;
        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız ");
        } else {
            System.out.println("Tebrıkler sınıfı geçtiniz ");
        }
        System.out.println("Ortalamanız : " + avarage);





    }
}
