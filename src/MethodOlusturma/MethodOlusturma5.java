package MethodOlusturma;

import java.util.Scanner;

public class MethodOlusturma5 {
    public static void main(String[] args) {

        // Kullanıcıdan bir tamsayı alın ve pozitif tam bolunenlerini
        // method ile dondurun
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz: ");
        int tamsayi = scanner.nextInt();

        pozitifTamSayiBulma(tamsayi);

    }
    public static int pozitifTamSayiBulma(int sayi){
         int sayac = 0;
        for (int i = 1; i <=sayi ; i++) {
            if (sayi % i ==0){
                sayac++;
                System.out.println("sayac: "+sayac);
                System.out.println(i + " ");
            }
        }
        return sayac;
    }
}
