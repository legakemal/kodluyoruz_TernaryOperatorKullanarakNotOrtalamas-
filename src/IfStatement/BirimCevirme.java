package IfStatement;

import java.util.Scanner;

public class BirimCevirme {
    public static void main(String[] args) {

        /*
            Kullanıcıdan mesafeyi kilometre olarak alın
            ve cevirmek istediği birimi sorun
            istediği birim metre veya santimetre ise cevirip yazdırın
            yoksa istediğiniz birim sisteme kayıtlı değil yazdırın


         */

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Lütfen mesafeyi km olarak giriniz: ");
        double mesafe = scanner.nextDouble();
        System.out.println("Cevirmek istediginiz birimi giriniz: ");
        String birim = scanner.next();
        if (birim.equals("m")){
            System.out.println("girilen mesafe metre olarak :"+mesafe*1000+ " metre");
        }
        else if (birim.equals("cm")){
            System.out.println("girilen mesafe cm olarak: "+(double)(mesafe*1000*100) +" cm.");
        }
    }
}
