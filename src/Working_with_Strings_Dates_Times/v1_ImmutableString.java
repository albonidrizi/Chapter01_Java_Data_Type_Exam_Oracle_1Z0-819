package Working_with_Strings_Dates_Times;

public class v1_ImmutableString {
    public static void main(String[] args) {

        System.out.println("\n** String-et e pandryshueshme ** \n");

        String str = "Hello!";
        String str2 = "Hello!";
        System.out.println(str==str2);

        String str3 = new String("Hello!");
        System.out.println(str==str3);

    }
}
