package Giris;
import java.util.Scanner;
public class ucgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b ,c;
        System.out.println("1.  kenar uzunluğu");
        a = scan.nextInt();
        System.out.println("2. kenar uzunluğu");
        b = scan.nextInt();
        System.out.println("3. kenar uzunluğu");
        c = scan.nextInt();
        double cevre =  a + b + c;
        double uzunluk = (cevre) / 2;
        double alan  = Math.sqrt(uzunluk*(uzunluk-a)*(uzunluk- b)* (uzunluk-c));

        System.out.print("Ücgenin alanı: " + alan);

    }
}
