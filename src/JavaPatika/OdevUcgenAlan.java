package JavaPatika;

import java.util.Scanner;

public class OdevUcgenAlan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a,b,c;

        // Uç kenar uzunluğu kullanıcıdan aldığımız üçgenin alanını hesaplayan program

        // Kullanıcıdan verileri alalalım

        // Kenar uzunluklarını kullanıcıdan alır
        System.out.println("Üçgenin ilk kenar uzunluğunu girin:");
        a = scanner.nextDouble();
        System.out.println("Üçgenin ikinci kenar uzunluğunu girin:");
        b = scanner.nextDouble();
        System.out.println("Üçgenin üçüncü kenar uzunluğunu girin:");
        c = scanner.nextDouble();

        /*
            Formul:

            Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

            𝑢 = (a+b+c) / 2

            Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */
        double u = (a+b+c) / 2;

        double alan = Math.sqrt( u* (u-a)*(u-b)*(u-c) );
        System.out.println("Ucgenin alanı: "+ alan);
        scanner.close();
    }
}
