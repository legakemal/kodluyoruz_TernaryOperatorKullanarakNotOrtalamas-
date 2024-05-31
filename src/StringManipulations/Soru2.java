package StringManipulations;

public class Soru2 {
    public static void main(String[] args) {

        // Kullanıcının belirli bir formatta verdiği String fiyatları toplayıp yazdırın
        // input: "15.30 €"  ve  "11.40 €"
        // output: 26.70 €

        String input1 = "15.35 €";
        String input2 = "11.40 €";

        input1 = input1.replaceAll("\\D","");
        input2 = input2.replaceAll("\\D","");
        int sayi1 = Integer.parseInt(input1);
        int sayi2 = Integer.parseInt(input2);

        System.out.println((double) (sayi1 + sayi2) / 100 + " €");


    }
}
