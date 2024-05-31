package StringManipulations;

import java.util.Scanner;

public class ReplaceDers1 {
    public static void main(String[] args) {

        String metin = "J1^a2_3v+76a    C98a#n1%2di4r6";

        metin = metin.replaceAll("\\d","");
        metin = metin.replaceAll("\\s+"," ");
        metin = metin.replace(" ","1");
        metin = metin.replaceAll("\\W","");
        metin = metin.replaceAll("_","");
        metin = metin.replace("1"," ");

        // String olarak verilen sonuc sayısında sayı olmayan karakterleri temizleyip,
        // bulunan sonucun 3'den fazla olduğunu test edin

        // Ornek; 4 Products Found

        String sonucStr = "4 Products Found";
        sonucStr = sonucStr.replaceAll("\\D","");
        int sonuc = Integer.parseInt(sonucStr);

        System.out.println(sonuc > 3 ? "buyuk" : "kucuk");


    }
}
