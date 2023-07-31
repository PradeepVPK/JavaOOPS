import java.util.Locale;

public class stringfunctions {
    public static void main(String[] args) {
        String a ="Pradeep Rohit";
        String b ="Pradeep rOhit";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.replace("Rohit","kumar"));
        System.out.println(a.contains("Pradeep"));
        System.out.println(a.substring(5));
        System.out.println(a.substring(0,5));
        char[] carray =a.toCharArray();
        for (char c: carray){
            System.out.println(c);
        }
        String c= "hello   ";
        System.out.println(c.length());
        System.out.println(c.trim());
        System.out.println(c.trim().length());

    }
}
