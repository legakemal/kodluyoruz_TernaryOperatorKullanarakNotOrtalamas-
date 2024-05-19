package IfStatement;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class BagimliIfStatement {

    public static void main(String[] args) {

        // Kullanıcıdan notu alın
        // 50 veya daha buyukse sınıf geçtin
        // 50 den kucukse maalesef kaldın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir not giriniz: ");
        double not = scanner.nextDouble();

        if (not>50){
            System.out.println("tebrikler sınıfı geçtiniz");
        }

        if (not<50)
            System.out.println("maalesef sınıfta kaldınız");
    }
}
