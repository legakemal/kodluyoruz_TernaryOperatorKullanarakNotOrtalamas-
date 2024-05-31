package MethodOlusturma;

import java.util.Arrays;

public class MethodOlusturma1 {
    public static void main(String[] args) {

       carpimMethod(33,34);
        degerYazdirMethod("Deniz",44);

    }
    // verilen iki tamsayının çarpimini yazdıran bir method oluşturunuz.

    public static void  carpimMethod(int sayi1,int sayi2){
        int capim = sayi1*sayi2;
        System.out.println(capim);

    }
    // verilen String ve int değerleri aralarında bir boşluk birakarak yazdıran bir method oluşturun

    public static void degerYazdirMethod(String ifade,int sayi){

        System.out.println("Deger: "+ ifade +" "+ sayi);
    }

}
