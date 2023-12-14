package Working_with_Strings_Dates_Times;

public class v2_StringConcatenation {

    public static void main(String[] args) {
        System.out.println("\n** Bashkimi i String-ve ** \n");
        String str = "Hello";
        String str2 = str + " Lautrim!";
        System.out.println(str2);

        String pi = "3.14" +15443;
        System.out.println(pi);

        String str3 = 5 + 4 +"xzy"+ 333+44;
        System.out.println(str3);

        str3 = "__"+ 3+4*2;
        System.out.println(str3);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append("Wolrd!");
        System.out.println(sb);

        String result = sb.toString();
        System.out.println(result);

        sb.reverse();
        System.out.println(sb);



    }

}
