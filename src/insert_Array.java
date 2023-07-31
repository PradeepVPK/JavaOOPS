import java.util.Arrays;

public class insert_Array {
    public static void main(String[] args) {
        int [] a=new int[]{1,4,6,2,3,8,5,7};
        int value=58;
        int index=4;
        System.out.println("before insertion"+ Arrays.toString(a));
        for (int i=a.length-1;i>=index;i--){
            a[i]=a[i-1];

        }
        a[index]=value;
        System.out.println("After insertion"+ Arrays.toString(a));
    }
}
