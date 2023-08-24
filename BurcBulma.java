package Giris;
import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int day, month;
        String burc = "";
        boolean hata = false;

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = scan.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = scan.nextInt();

        if( (month >= 1 && month <=12) && (day > 0 && day < 32) ){
            if (month == 1 ){
                if (day < 22){
                    burc = "Oğlak";
                }else {
                    burc = "Kova";
                }
            }
            if (month == 2 && day <=28){
                if(day < 20){
                    burc = "Kova";
                }else {
                    burc = "Balık";
                }
            }
            if (month == 3){
                if(day < 20){
                    burc = "Balık";
                }else {
                    burc = "Koç";
                }
            }
            if (month == 4 &&  day <=30){
                if(day < 20){
                    burc = "Koç";
                }else {
                    burc = "Boğa";
                }
            }
            if (month == 5 ){
                if(day < 20){
                    burc = "Boğa";
                }else {
                    burc = "İkizler";
                }
            }
            if (month == 6 &&  day <=30){
                if(day < 22){
                    burc = "İkizler";
                }else {
                    burc = "Yengeç";
                }
            }
            if (month == 7 ){
                if(day < 22){
                    burc = "Yengeç";
                }else {
                    burc = "Aslan";
                }
            }
            if (month == 8 ){
                if(day < 22){
                    burc = "Aslan";
                }else {
                    burc = "Başak";
                }
            }
            if (month == 9 && day <=30){
                if(day < 22){
                    burc = "Başak";
                }else {
                    burc = "Terazi";
                }
            }
            if (month == 10 ){
                if(day < 22){
                    burc = "Terazi";
                }else {
                    burc = "Akrep";
                }
            }
            if (month == 11 & day <=30){
                if(day < 21){
                    burc = "Akrep";
                }else {
                    burc = "Yay";
                }
            }
            if (month == 12 ){
                if(day < 21){
                    burc = "Yay";
                }else {
                    burc = "Oğlak";
                }
            }
        }
        else {
            hata = true;
        }
        if (!hata) {
            System.out.println(burc);
        }
        else {
            System.out.println("Geçersiz bir doğum tarihi girdiniz");
        }


    }
}
