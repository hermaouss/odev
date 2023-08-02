package Giris;
import java.util.Scanner;
public class DaireAlaniBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14, a;
        int r ;

        System.out.println("Dairenin yarıçapını giriniz: ");
        r = scan.nextInt();
        System.out.println("merkez açısının ölçüsünü giriniz: ");
        a = scan.nextDouble();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double dilimAlani = (pi * (r*r) * a) / 360;

        System.out.println("Merkez açısı " + a + " olan daire diliminin alanı:  " + dilimAlani);
        System.out.println("Tüm dairenin alanı: " + alan);
    }
}