package IfStatement;

import java.util.Scanner;

public class KdvhesaplamaProjesi {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen fiyatı giriniz: ");
        double fiyat,kdvli_fiyat,kdv_tutari;

        fiyat = scanner.nextDouble();
        double kdv_orani = 0.18;

        kdv_tutari = fiyat * kdv_orani;
        kdvli_fiyat = fiyat + kdv_tutari;

        if (fiyat < 0) {
            System.out.println("Geçerli tutar giriniz.");

        }else {

            if (fiyat>=0 && fiyat<=1000) {
                kdv_tutari = fiyat * kdv_orani;
                System.out.println("Kdv tutarı: " + kdv_tutari);
            }else{
                kdv_orani = 0.08;
                kdv_tutari = fiyat * kdv_orani;
                System.out.println("Kdv tutarı: " + kdv_tutari);
            }
        }


    }
}
