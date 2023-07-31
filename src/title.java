public class title {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Pradeep is a good boy");
        if (a.charAt(0) >= 97 && a.charAt(0) <= 122) {
            int c= (int) a.charAt(0)-32;
            a.setCharAt(0,(char) c);
        }
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i)==32){
                i++;
                if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                    int c = (int) a.charAt(i) - 32;
                    a.setCharAt(i, (char) c);
                }

            }
            else {
                if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                    int c= (int) a.charAt(i)+32;
                    a.setCharAt(i,(char) c);
                }
            }

            }
        System.out.println(a);
        }
}
