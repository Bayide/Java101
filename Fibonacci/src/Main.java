//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/* Ödev
Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

Fibonacci Serisi Nedir ?
        Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır.
Fibonacci dizisinin ilk on sayısı şu şekildedir:
9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
    */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Fibonnaci sayı giriniz");
        int n = input.nextInt();
        System.out.println("fibonnaci serisi ");

        for (int i = 0; i < n; i++) {
            System.out.println(i + "");
        }
    }

public static int i(int n) {
    if (n == 0)
        return 0;
    else if (n == 1)
        return 1;
    else
        return i(n - 1) + i(n - 2);

    }
}




