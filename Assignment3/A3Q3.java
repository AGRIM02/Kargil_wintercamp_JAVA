public class A3Q3 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5;
        int s = arr[0];
        int l = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < s) {
                s = arr[i];
            }
            if (arr[i] > l) {
                l = arr[i];
            }
        }
        System.out.println("smallest: " + s);
        System.out.println("largest: " + l);
    }

}
