package Giris;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kmBasina = 2.20;
        int  acilisUcreti = 10, minUcret = 20,km;
        System.out.println("Gidilen mesafe uzunluğu: ");
        km = scan.nextInt();
        double ucret = (km * kmBasina) + acilisUcreti;
        float odeme = (ucret <= minUcret)? minUcret : (float) ucret;

        System.out.println("Ödenecek miktar: " + odeme);


    }
}
