import java.util.*;

class Result {
    static int[] productArray(int n, int[] arr) {
        int[] result = new int[n];

        int leftProduct = 1;

        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= arr[i];
        }

        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        return result;
    }
}

public class ignoringSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = Result.productArray(n, arr);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}