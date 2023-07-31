public class count {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Pradeep is a  good boy");
        int upper=0,lower=0,number=0,space=0,vowel=0,symbol=0;
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)>=97 && a.charAt(i)<=122){
                lower++;
            }
            if (a.charAt(i)>=65 && a.charAt(i)<=90){
                upper++;
            }
            if (a.charAt(i)>=48 && a.charAt(i)<=57){
                number++;
            }
            if (a.charAt(i)==32){
                space++;
            }
            switch (a.charAt(i)){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    vowel++;
                    break;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(space);
        System.out.println(vowel);
        System.out.println(number);
        System.out.println(a.length()-(lower+upper+space+number));
    }
}
