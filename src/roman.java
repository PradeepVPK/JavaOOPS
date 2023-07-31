import java.util.Scanner;

public class roman {

    public static void main(String[] args) {
          /*  int I=1;
            int V=5;
            int X=10;
            int L=50;
            int C=100;
            int D=500;
            int M=1000;
            int IV =4;
            int IX=9;
            int XL=40;
            int XC=90;
            int CD =400;
            int CM=900;*/
            Scanner in =new Scanner(System.in);
            String a1=in.next();
            StringBuffer a= new StringBuffer(a1);


           int sum=0;
        for(int i =0;i<=a.length();i++) {
            for(int j = i+1;j<=a.length();j++) {
                if (a.charAt(i) == 'i' || a.charAt(i) == 'I') {
                    if (a.charAt(j) == 'v' || a.charAt(j) == 'V')
                        sum += 4;
                    else
                        sum++;
                }
                if (a.charAt(i) == 'v' || a.charAt(i) == 'V') {
                    if (a.charAt(j) == 'i' || a.charAt(j) == 'I')
                        sum += 6;
                    else
                        sum += 5;
                }
            }
        }
        System.out.println(sum);
    }
}
