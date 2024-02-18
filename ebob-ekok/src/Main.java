//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.

EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
18’in bölenleri : 1, 2, 3, 6, 9, 18
24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24

Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.
EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.
6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …
8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …

Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.
EKOK = (n1*n2) / EBOB
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
        System.out.print("n1 sayısı giriniz:");
        int n1=input.nextInt();

        System.out.print("n2 sayısı giriniz:");
        int n2=input.nextInt();
        int ebob =1 ,i=2;
        while (i <= n1 && i<=n2) {
            if (n1 % i == 0 && n2 % i == 0) ebob = i;
            {

            }
            i++;
        }
            int ekok=(n1*n2)/ebob;
            System.out.println("ebob"+ebob);
            System.out.println("ekok"+ekok);
        }
       }
