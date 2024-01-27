import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static int kInversePairs(int n, int k) {
        int dp[][] = new int[101][101];
       
        return travel(n, k, dp);
    }

    public static int travel(int n, int k, int dp[][]) {
        if (n == 0)
            return 0;

        if (k <= 0)
            return 1;

        if (dp[n][k] !=0)
            return dp[n][k];

        int inv = 0;
        for (int i = 0; i <= Math.min(k,n-1); i++) {
            inv = (inv + travel(n - 1, k - i, dp)) % 1000000007;
        }
        dp[n][k] = inv;
        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int myRes = kInversePairs(n, k);
        System.out.println(myRes);
    }
}

