package SwitchStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchSatement {
    public static void main(String[] args) {

        /*
            Kullanıcıdan haftanın kaçıncı gunu olduğunu sayı olarak alın
            gunun hafta içi veya haftasonu olduğunu yazdırın
            1-7 arasında sayılardan farklı gir sayı girilirse "yanlış gun numarası" yazdırın

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen haftanın kaçıncı gunu olduğunu yazınız: ");
        int gun = scanner.nextInt();

        switch (gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("tanımsız");
                break;
        }

        String cinsiyet = "erkek";
        switch (cinsiyet){
            case "Erkek":
            case "erkek":
            case "ERKEK":

        }
    }
}
