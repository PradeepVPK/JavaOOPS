public class array_methods {
    public static  int[] sendarray(){
        return  new  int[]{1,2,3,4,5};
    }

    public static void main(String[] args) {
        int arr[]=sendarray();
        for (int a: arr){
            System.out.println(a);
        }
    }
}
