package Giris;
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double armut = 2.14,elma = 3.67,domates = 1.11,muz =0.95,patlican = 5.00;
        double armutK,elmaK ,domatesK ,muzK ,patlicanK ;
        System.out.print("Armut Kaç Kilo: ");
        armutK = scan.nextInt();
        armutK *= armut;
        System.out.print("Elma Kaç Kilo: ");
        elmaK = scan.nextInt();
        elmaK *= elma;
        System.out.print("Domates Kaç Kilo: ");
        domatesK = scan.nextInt();
        domatesK *= domates;
        System.out.print("Muz Kaç Kilo: ");
        muzK = scan.nextInt();
        muzK *= muz;
        System.out.print("Patlıcan Kaç Kilo: ");
        patlicanK = scan.nextInt();
        patlicanK *= patlican;

        double toplam = armutK + elmaK + domatesK + muzK + patlicanK;
        System.out.print("Toplam Tutar: " + toplam + " TL");

    }
}
