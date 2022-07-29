/*          Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username, password, passwordReset, newPassword;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        username = inp.nextLine();

        System.out.println("Şifreniz : ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java1234")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Yanlış bir şifre girdiniz.Yeni bir şifre belirlemek istiyorsanız.\"evet\"veya\"hayır seçiniz");
            passwordReset = inp.nextLine();
            if (passwordReset.equals("hayır")) {
                System.out.println("Giriş sonlandırıldı ");
            } else if (passwordReset.equals("evet")) {
                System.out.println("Yenı şifre Giriniz");
                newPassword = inp.nextLine();
                if (newPassword.equals("java1234") || newPassword.equals(password)) {
                    System.out.println("Yanlış Şifre tekrar deneyiniz !");
                }
                else {
                    System.out.println("Şifreniz Başarıyla Sıfırlandı ");
                }
            } else {
                System.out.println(" Hatali secim sectiniz ");

            }
        }
    }
}