package MethodOlusturma;

import java.util.Scanner;

public class MethodOlusturma3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi giriniz: ");
        String isim = scanner.nextLine();
        System.out.println("soyisminizi giriniz: ");
        String soyisim = scanner.nextLine();

      String duzenliIsimSoyisim  =isimSoyisimDondurenMethod(isim,soyisim);
        System.out.println(duzenliIsimSoyisim);

    }
    // Kullanıcıdan ismini ve soyismini alın
    // İsim ve soyismin ilk harflerini buyuk geriye kalan harfleri kucuk olarak duzenleyip,
    // "isim soyisim" olarak donduren metod yazın

    public static String isimSoyisimDondurenMethod(String isim,String soyisim){

        isim = isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase();
        soyisim = soyisim.substring(0,1).toUpperCase()+
                            soyisim.substring(1).toLowerCase();


        return isim+" "+soyisim;

    }
}
