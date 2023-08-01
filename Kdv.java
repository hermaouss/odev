package Giris;
import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        double tutar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ücret giriniz: ");
        tutar = scan.nextDouble();
        double kdvOran = tutar <= 1000? 0.18 : 0.08;
        double kdvTutar = kdvOran * tutar;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdvli Tutar: " + kdvliTutar);
        System.out.println("Kdv tutarı: " + kdvTutar);
    }
}
