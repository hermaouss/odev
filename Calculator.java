package Giris;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,n2,secim;
        System.out.print("1. sayıyı giriniz: ");
        n1 = scan.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        secim = scan.nextInt();

        switch (secim) {
            case 1 -> System.out.println("Toplam: " + (n1 + n2));
            case 2 -> System.out.println("Çıkarma: " + (n1 - n2));
            case 3 -> System.out.println("Çarpma: " + (n1 * n2));
            case 4 -> {
                if (n2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez.");
                } else {
                    System.out.println("Bölme: " + (n1 / n2));
                }
            }
            default -> System.out.println("Yanlış bir seçim yaptınız.");
        }
    }
}
