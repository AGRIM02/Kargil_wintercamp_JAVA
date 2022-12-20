public class A3Q4 {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 8, 2, 9 };
        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("second largest: " + arr[n - 2]);
        System.out.println("second smallest: " + arr[1]);
    }

}
