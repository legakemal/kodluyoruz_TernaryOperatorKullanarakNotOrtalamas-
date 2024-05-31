package MethodOlusturma;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

//        int sayi =1;
//        while (sayi<=99){
//            System.out.print(sayi+" ");
//            sayi++;
//        }

        Scanner scanner = new Scanner(System.in);
        double toplam = 0;

        while (toplam < 60){
            System.out.println("Toplanmak uzere sayı giriniz: ");
            double sayidbl = scanner.nextInt();
            toplam +=sayidbl;
            System.out.println("Toplam: "+ toplam);
        }
        System.out.println("Sayıların toplamı : " + toplam);
    }
}
