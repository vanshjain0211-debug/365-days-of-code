import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    a += arr[i][j];
                }
            }
        }

        int b = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    b += arr[i][j];
                }
            }
        }
        sc.close();
        int ans = Math.abs(a - b);
        System.out.println(ans);
    }
}