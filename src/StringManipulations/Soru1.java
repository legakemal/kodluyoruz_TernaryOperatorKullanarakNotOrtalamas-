package StringManipulations;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        // 1- Kullanıcıdan bir cumle alın
        // 2- cumlede ev geciyorsa "home home sweet home" yazdırın
        // 3- cumlede is geçiyorsa "çalışmak guzeldir"
        // 4- ikisini de içeriyorsa "hem ev lazım hem iş"
        // 5- hiçbirini içermiyorsa "cok çalışman lazım" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz: ");
        String metin = scanner.nextLine();

        if ( metin.contains("ev") && metin.contains("is")){
            System.out.println("hem ev lazım hem iş");

        } else if (metin.contains("is")) {
            System.out.println("çalışmak guzeldir");

        } else if (metin.contains("ev")) {
            System.out.println("home home sweet home");

        }
        else{
            System.out.println("çok çalışman lazım");
        }
    }
}
