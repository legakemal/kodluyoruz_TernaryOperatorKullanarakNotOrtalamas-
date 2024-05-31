package StringManipulations;

public class StringManipulationDers2 {
    public static void main(String[] args) {

        String str = "Ali Uzunkavaklaraltindayatar";
        // son harfi yazdıralım
        System.out.println(str.length());
        //System.out.println(str.charAt(38-1));
        //System.out.println(str.charAt(38-2));
        //System.out.println(str.charAt(38-7));

        System.out.println(str.length()-1);
        System.out.println(str.charAt(str.length()-3));
        System.out.println(str.charAt(str.length()-6));
        System.out.println(str.length());
        System.out.println(str.length()-2);
        System.out.println(str.charAt(str.length()-5));


    }
}
