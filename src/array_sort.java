import java.lang.reflect.Array;
import java.util.Arrays;

public class array_sort {
    public static void main(String[] args) {
        int [] a=new int[]{1,4,6,2,3,8,5,7};
        System.out.println("before sorting"+ Arrays.toString(a));
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        System.out.println("after sorting"+Arrays.toString(a));

    }
}
