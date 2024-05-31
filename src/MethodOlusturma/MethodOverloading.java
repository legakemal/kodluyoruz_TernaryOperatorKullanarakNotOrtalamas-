package MethodOlusturma;

public class MethodOverloading {
    public static void main(String[] args) {

        String str = "Method olusturma";
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,14));

        /*
            Bir class'da aynı isimde birden fazla method olabilir
            Ancak ismi aynı olduğu gibi herşeyi ayni olursa hangisini çalıştıracağını bilmez
            (Birebir herşeyiyle aynı olamaz)
            Bunun onune geçmek için java'da aynı isimde birden fazla method oluşturulduğunda parametre
            sayıyı veya parametreleirn data turleri farklı olmalıdır
         */
        toplama(44,5);
        toplama(4,4,5);
        toplama(4.5,33);


    }
    public static void toplama(int sayi1,int sayi2){

        System.out.println("iki int toplam: "+ sayi1 + sayi2);
    }

    public static void toplama(int sayi1,int sayi2,int sayi3){

        System.out.println("üç int toplam: "+ sayi1 + sayi2 + sayi3);
    }

    public static void toplama(double sayi1 ,int sayi2){

        System.out.println("bir double bir int toplam: "+ sayi1 + sayi2);
    }

    // Method ismi aynı olduğu halde method SIGNATURE'i farklı olan method2ların kullanılmasına
    //  METHOD OVERLOADİNG denir

    // Method signature'si method ismi + parametre data turu
    // toplama int int gibi




}
