package IfStatement;

import java.util.Scanner;

public class EmeklilikHesaplama {
    public static void main(String[] args) {

        /*
            Kullanıcıdan cinsiyetini ve yaşını alın
            Kadın 60 yas ve uzeri
            Erkek 65 yas ve üzeri emekli olabilir

            Cinsiyet ve yaşını dikkate alarak Emekli olabilirsiniz
            veya  Emekli olmak için ... yıl daha calışmanız gerekir yazdırın
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz: ");
        String cinsiyet = scanner.next();

        System.out.println("Lütfen yaşınızı giriniz: ");
        double yas = scanner.nextDouble();

       if (cinsiyet.equalsIgnoreCase("e") && yas>=65){
           System.out.println("Emekli olabilirsiniz");
       }
        else if (cinsiyet.equalsIgnoreCase("e") && yas<65){
            System.out.println("Emekli olmak için "+(65-yas)+ " yıl daha beklemelisiniz");
        } else if (cinsiyet.equalsIgnoreCase("k") && yas >=60) {
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet.equalsIgnoreCase("k") && yas<60) {
            System.out.println("Emekli olmak için "+(60-yas)+ " yıl daha beklemelisiniz");
        }else{
            System.out.println("hatalı giriş yapıldı");
        }


    }
}
