package IfStatement;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class NestedIfElseIndirim {
    public static void main(String[] args) {
        // Kullanıcıdan aldığı urun adedi ve liste fiyatını alın
        // kullanıcıdan musteri kartı olup olmadığını sorun
        //  * Musteri kartı varsa ve 10 urunden fazla alırsa %20,
        // 10 urun vaya daha az alırsa %15 indirim yapın,
        //  * Musteri kartı yoksa 10 urunden fazla alırsa %15,
        // 10 urun veya daha az alırsa %10 indirim yapın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen urun fiyatını giriniz: ");
        double urun_fiyat = scanner.nextDouble();
        System.out.println("urun adetini giriniz: ");
        int urun_adet = scanner.nextInt();
        System.out.println("Müsteri kartınız var Mı ?  E: Evet,  H: Hayır");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        // Ana degişken KartVarMi

        if (kartVarMi =='E'){
            if (urun_adet<=0 || urun_adet>50){

                System.out.println("hatalı urun adedi");
            } else if (urun_adet<=10) {
                System.out.println("%15 indirimli toplam fiyat: " + urun_fiyat*urun_adet*85/100);
            }else{
                System.out.println("%20 indirimli toplam fiyat: " + urun_fiyat*urun_adet*80/100);
            }


        } else if (kartVarMi =='H') {
            if (urun_adet<=0 || urun_adet>50){

                System.out.println("hatalı urun adedi");
            } else if (urun_adet<=10) {
                System.out.println("%10 indirimli toplam fiyat: " + urun_fiyat*urun_adet*90/100);
            }else{
                System.out.println("%15 indirimli toplam fiyat: " + urun_fiyat*urun_adet*85/100);
            }

        }
        else{
            System.out.println("kart girdisi hatalı");
        }
    }
}
