//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız. */


public class Main {
    public static void main(String[] args) {
        int sayi;
        for(int i=2; i<=100; i++){
            sayi=0;
            for(int j=2; j<=i/2; j++){
                if(i%j==0) sayi++;
            }
            if(sayi==0) {
                System.out.println("Asal sayı"+i);
            }
            }
        }
    }

    

