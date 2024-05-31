package StringManipulations;

public class StartWith_EndWithDersi1 {
    public static void main(String[] args) {

        String str = "Java Candir Ama Dildir";

        System.out.println(str.contains("a"));
        System.out.println(str.startsWith("A"));
        System.out.println(str.endsWith("R"));
        System.out.println(str.endsWith("r"));
        System.out.println(str.endsWith("dir"));

        System.out.println(str.startsWith("Java Candir Ama Dildir"));
        System.out.println(str.startsWith(""));

        // Eğer iki parametre kullanırsak önce ikinci parametre'de verilen index'e gore subString alır
        // sonra alınan metnin istenen başlangıç ile başlayıp başlamadığını kontrol eder.
        System.out.println(str.startsWith("a",1));

        System.out.println(str.startsWith("Can",6)); // false

    }
}
