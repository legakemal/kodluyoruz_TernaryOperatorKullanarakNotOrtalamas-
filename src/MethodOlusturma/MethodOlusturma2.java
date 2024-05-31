package MethodOlusturma;

public class MethodOlusturma2 {
    public static void main(String[] args) {

        System.out.println(dondurenMethod(5,3));

    }

    // Verilen iki sayıyı çarpıp sonucu donduren bir method oluşturun

    public static int dondurenMethod(int sayi1,int sayi2){
        int sonuc = sayi1*sayi2;
        return sonuc;

    }
}
