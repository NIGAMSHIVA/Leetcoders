import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long[][][] dp = new long[m][n][maxMove + 1];
        // Initialize the memoization array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
Arrays.fill(dp[i][j],-1);
            }
        }
        int mod = 1000000007;
        return (int) dynamic(startRow, startColumn, m, n, maxMove, dp, mod);
    }

    public static long dynamic(int i, int j, int m, int n, int moves, long[][][] dp, int mod) {
        if (i < 0 || i >= m || j < 0 || j >= n)
            return 1;
        if (moves == 0)
            return 0;
        if (dp[i][j][moves] != -1)
            return dp[i][j][moves];

        long one = dynamic(i, j + 1, m, n, moves - 1, dp, mod);
        long two = dynamic(i + 1, j, m, n, moves - 1, dp, mod);
        long three = dynamic(i - 1, j, m, n, moves - 1, dp, mod);
        long four = dynamic(i, j - 1, m, n, moves - 1, dp, mod);

        dp[i][j][moves] = (one + two + three + four) % mod;
        return dp[i][j][moves];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int maxMove = sc.nextInt();
        int startRow = sc.nextInt();
        int startColumn = sc.nextInt();
        int result = findPaths(m, n, maxMove, startRow, startColumn);
        System.out.println(result);
    }
}