public class duplicate {
    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 4, 2, 3, 8, 3, 7};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}