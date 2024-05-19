package IfStatement;

public class TernaryOperator {
    public static void main(String[] args) {

        int number = 4;
        System.out.println(number > 5 ? "buyuk" : "kucuk ");

        int sayi = 94;
        System.out.println( sayi%2==0 ? "çift sayı" : "tek sayıdır" );

        // sayı tek basamaklı ise rakam degilse sayı yazdırın

        System.out.println( sayi>=-9 && sayi<=9 ? "rakam" : "sayı" );

        // sayı 3'un katı ise 3'ün katı yazdırın
        // sayı 3'un katı degilse sayıyı 3 ile çarpıp sonucunu yazdırın

        System.out.println( sayi%3==0 ? "sayı 3'un katı" : sayi*3  );

        //  sayi>=-9 && sayi<=9 ? "rakam" : "sayı"; ternary tek başına yalnız kullanılamaz ya atama yapılacak,
        //  yada direk yazdırmalıyız.


        // Eğer şartın true vermesi durumunda else edilen sonucun data turu ile,
        // şartın false vermesi durumunda elde edilen sonucun data turu farklı olursa
        // atama yapmamız mumkun degil, sadece yazdırabiliriz.


        sayi  =0;
        // eğer sayı pozitif ise 2 katına çıkarın
        // pozitif değilse pozitif değil yazdırın


        System.out.println(sayi > 0 ? sayi * 2 : "sayı pozitif degil");

        int a = 10;


    }
}
