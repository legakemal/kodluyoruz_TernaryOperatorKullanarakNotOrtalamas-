package MethodOlusturma;

public class MethodOverloadingKullanım {
    public static void main(String[] args) {


        toplama('a','a');
        toplama(4,4,4);
        toplama(4,4.4,2);
        toplama(65,5f,12);
        toplama(4,7f);


    }
    public static void toplama(int sayi1,int sayi2){

        System.out.println("iki int toplam: "+ sayi1 + sayi2);
    }

    public static void toplama(int sayi1,int sayi2,int sayi3){

        System.out.println("üç int toplam: "+ sayi1 + sayi2 + sayi3);
    }
    public static void toplama(int sayi1,double sayi2,int sayi3){

        System.out.println("int double toplam: "+ sayi1 + sayi2 + sayi3);
    }
    public static void toplama(int sayi1,double sayi2){

        System.out.println("int double toplam: "+ sayi1 + sayi2);
    }
}
