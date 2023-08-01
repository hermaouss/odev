package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notu giriniz: ");
        int mat = inp.nextInt();

        System.out.println("Fizik notu");
        int fizik = inp.nextInt();

        System.out.println("Kimya");
        int kimya = inp.nextInt();

        System.out.println("müzik");
        int muzik = inp.nextInt();

        System.out.println("Türkçe ");
        int turkce = inp.nextInt();

        System.out.println("Tarih");
        int tarih = inp.nextInt();

        double sonuc = (double) (mat + fizik + kimya + muzik + turkce + tarih) / 6;
        String s = sonuc <= 60 ? "Kaldı" : "Geçti";
        System.out.println(sonuc +" " + s);
    }
}
