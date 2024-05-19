package IfStatement;

import java.util.Scanner;

public class NestedIfElse {
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


           //  Kadın
        if (cinsiyet.equalsIgnoreCase("kadın")){
           if (yas<30 || yas>70){
               System.out.println("hatalı yas girişi");
           } else if (yas>=60) {
               System.out.println("kadın emekli olabilir");
           }else{
               System.out.println("kadın 60 yaşından kucuk emekli olması için "+(60-yas) +" yıl daha beklemeli");
           }


        }  // Erkek
        else if (cinsiyet.equalsIgnoreCase("erkek")) {
            if (yas<30 || yas>70){
                System.out.println("hatalı yas girişi");
            } else if (yas>=65) {
                System.out.println("erkek emekli olabilir");
            }else{
                System.out.println("erkek 65 yaşından kucuk emekli olması için "+(65-yas) +" yıl daha beklemeli");
            }
        }
        else {
            System.out.println("kadın veya erkek değeri giriniz");
        }
    }
}
