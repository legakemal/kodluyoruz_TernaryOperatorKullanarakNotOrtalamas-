package MethodOlusturma;

import java.util.Scanner;

public class ForLoop_metniCersCevir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String metin = scanner.nextLine();

        for (int i =metin.length()-1; i >=0 ; i--) {
            System.out.print(metin.charAt(i));
        }
        System.out.println(" ");

        String tersMetin = ""; // ridnaC avaJ  /  Java Candir
        for (int i = metin.length()-1; i>=0 ; i--) {
            tersMetin += metin.charAt(i);

        }
        System.out.println("Ters Metin: " + tersMetin);

        String duzMetin = "";
        for (int i = metin.length()-1; i>=0 ; i--) {
            duzMetin += tersMetin.charAt(i);   // ridnaC avaJ
        }
        System.out.println("Duz metin: "+ duzMetin);


        // Metnin palindrome olup olmadığını yazdırın
        // madam , ada , ey edip adnada pide ye , 1234554321

        System.out.println(metin.equals(tersMetin) ? "metin palindrome" : "metin pallindrome değil" );
    }



}
