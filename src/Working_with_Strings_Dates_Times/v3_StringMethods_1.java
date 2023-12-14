package Working_with_Strings_Dates_Times;

public class v3_StringMethods_1 {

    public static void main(String [] args) {
        System.out.println("\n** String Methods, Part 1 ** \n");


        String str = new String("Hello");
        String str1 = new String("Hello");

        System.out.println(str==str1);
        System.out.println(str.equals(str1));

        String str3 = "hello";
        System.out.println(str.equals(str3));
        System.out.println(str.equalsIgnoreCase(str3));

        str = "Hello World!";
        System.out.println(str.length());

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        str = "Ne kemi sonte kurs per Java";
        System.out.println(str.startsWith("ne"));
        System.out.println(str.startsWith("Ne  "));

        System.out.println(str.endsWith(" Java"));

        str = "Hello, my name is Albon";
        System.out.println(str.contains("lbn"));
        System.out.println(str.contains("my name "));

        String str2;

        str = " Hi there! ";
        str2 = str.trim();
        System.out.println(str.length());
        System.out.println(str2);
        System.out.println(str2.length());





    }
}
