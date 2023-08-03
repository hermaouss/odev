package Giris;
import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        n1 = scan.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        n2 = scan.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        n3 = scan.nextInt();

        if(n1 < n2 && n1 < n3){
            if (n2 < n3) {
                System.out.println(n1 + " < " + n2 + " < " + n3);
            }
            else {
                System.out.println(n1 + " < " + n3 + " < " + n2);
            }
        }
        else if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println(n2 + " < " + n1 + " < " + n3);
            }
            else {
                System.out.println(n2 + " < " + n3 + " < " + n1);
            }
        }
        else {
            if(n1 < n2) {
                System.out.println(n3 + " < " + n1 + " < " + n2);
            }else {
                System.out.println(n3 + " < " + n2 + " < " + n1);
            }
        }
    }
}
