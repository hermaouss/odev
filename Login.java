package Giris;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        String userName, password,option;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = scan.nextLine();
        System.out.print("Şifrenizi adınızı giriniz: ");
        password = scan.nextLine();

        if(userName.equals("admin")&& (password.equals("password"))){
            System.out.println("Başarıyla giriş yaptınız.");
        } else  {
            System.out.println("Girdiğiniz bilgiler yanlış");
            System.out.println("Şifrenizi sıfırlamak ister minsiniz(evet|hayır)? ");
            option = scan.nextLine();
            if(option.equals("evet")){
                String newPassword;
                System.out.print("Yeni şifre giriniz: ");
                newPassword = scan.nextLine();
                if (newPassword.equals(password)){
                    System.out.println("Şifre oluşturulamadı");
                }
                else {
                    System.out.println("Şifre başarılı şekilde değiştirildi.");
                }
            }

        }
    }
}
