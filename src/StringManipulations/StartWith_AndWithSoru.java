package StringManipulations;

import java.util.Scanner;

public class StartWith_AndWithSoru {

    public static void main(String[] args) {

        // Kullanıcıdan bir mail alın
        // - mail @ içermiyorsa "gecersiz mail" yazdırın
        // - mail @gmail.com içermiyorsa "gmail olmalı"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazım hatası var"
        //  yazdırın

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Mail giriniz: ");
        String mail = scanner.nextLine();

        if (!mail.contains("@")){
            System.out.println("geçersiz mail");
        }
        else if (!mail.contains("@gmail.com")) {
            System.out.println("gmail olmalı");
        }
        else if (!mail.endsWith("@gmail.com")){
            System.out.println("mail de yazım hatası var");
        }
        else{
            System.out.println("şifreniz kaydedildi");
        }

    }
}
