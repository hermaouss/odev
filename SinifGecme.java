package Giris;
import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notu gir: ");
        mat = scan.nextInt();
        System.out.print("Fizik notu gir: ");
        fizik = scan.nextInt();
        System.out.print("Türkçe notu gir: ");
        turkce = scan.nextInt();
        System.out.print("Kimya notu gir: ");
        kimya = scan.nextInt();
        System.out.print("Müzik notu gir: ");
        muzik = scan.nextInt();

        double ortalama = 0.00;
        int dersSayisi = 0;
        if(mat < 0 && mat >= 100 )
        {
            ortalama += mat;
            dersSayisi += 1;
        }
        if (fizik < 0 && mat >= fizik){
            ortalama += fizik;
            dersSayisi += 1;
        }
        if (turkce < 0 && mat >= turkce){
            ortalama += turkce;
            dersSayisi += 1;
        }
        if(kimya < 0 && mat >= kimya){
            ortalama += kimya;
            dersSayisi += 1;
        }
        if(muzik < 0 && mat >= muzik){
            ortalama += muzik;
            dersSayisi += 1;
        }

        ortalama = ortalama / dersSayisi;
        if(ortalama <= 55){
            System.out.println("Kaldınız.");
        } else {
            System.out.println("Geçtiniz.");
        }
    }
}
