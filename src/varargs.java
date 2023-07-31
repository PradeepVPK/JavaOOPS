import javax.xml.namespace.QName;

public class varargs {
    public static void getNames(String... names){
        for (String name: names){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        getNames("john","wick","hitman");
    }
}
