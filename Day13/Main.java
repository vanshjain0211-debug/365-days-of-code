import java.util.Scanner;

public class Main {

    public static String checkGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (grid[i][0] <= grid[i][m - 1]) {
                    return "NO";
                }
            } else {
                if (grid[i][0] >= grid[i][m - 1]) {
                    return "NO";
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (grid[i][m - 1] >= grid[i + 1][m - 1]) {
                    return "NO";
                }
            } else {
                if (grid[i][m - 1] <= grid[i + 1][m - 1]) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println(checkGrid(grid));

        sc.close();
    }
}