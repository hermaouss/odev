package Giris;
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy;
        int kilo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz");
        boy = scan.nextDouble();
        System.out.println("Kilonuzu giriniz");
        kilo = scan.nextInt();

        double vki = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz: " + vki);
    }
}
