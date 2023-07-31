public class reverse_string {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Pradeep is a  good boy");
        StringBuffer b = new StringBuffer();
        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
