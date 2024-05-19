package IfStatement;

import java.util.Scanner;

public class ElseIleBitenBlok {
    public static void main(String[] args) {

        // Kullanıcıdan tamsayı alınız
        // sayı negatif ise "Sıfırdan kucuk"
        // sayı pozitif ise "Sıfırdan buyuk"
        // sayı sıfır ise "Notr" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz: ");
        int girilenSayı = scanner.nextInt();
        if (girilenSayı<0){
            System.out.println("sayı sıfırdan kucuk");
        } else if (girilenSayı>0) {
            System.out.println("sayı sıfırdan buyuk");

        }else{
            System.out.println("sayı notr");
        }
    }
}
