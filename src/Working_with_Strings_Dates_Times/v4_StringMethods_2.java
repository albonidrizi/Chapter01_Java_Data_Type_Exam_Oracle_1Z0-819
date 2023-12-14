package Working_with_Strings_Dates_Times;

public class v4_StringMethods_2 {
    public static void main(String [] args) {
        System.out.println("\n** String Methods, Part 2 ** \n");

        String str = "Hello World!";
        Character chr = str.charAt(1);
        System.out.println(chr);

        str = "Mississippi";
        int index = str.indexOf('s');
        System.out.println(index);

        index = str.indexOf('i',5);
        System.out.println(index);
        index = str.indexOf('s',4);
        System.out.println(index);

        str = "Mississippi";
        String subStr = str.substring(8);
        System.out.println(subStr);
        subStr = str.substring(5,8);
        System.out.println(subStr);

        System.out.println(str.replace('i','x'));
        System.out.println(str.replace("ss","II"));


        //strip
        str = new String( "   Hi there   ");
        String str2 = str.strip();
        System.out.println(str2);

        System.out.println(str);
        System.out.println("!" + str.stripTrailing() + "!");
        System.out.println("!" + str.stripLeading() + "!");

        str = new String( "   Hi there   ");
        str2 = str.strip().replace("Hi", "Hello").toLowerCase();
        System.out.println(str2);




    }
}
