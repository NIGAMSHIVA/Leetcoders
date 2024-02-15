
import java.util.Arrays;
import java.util.Scanner;

public class partition {
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[] = new int[arr.length+1];


        
        for (int ind = arr.length - 1; ind >= 0; ind--) {
            int max = Integer.MIN_VALUE;
            int ans = Integer.MIN_VALUE;
            int count = 0;

            for (int j = ind; j < ind + k && j < arr.length; j++) {
                count++;
                max = Math.max(arr[j], max);

                int sum = max * count + dp[j + 1];
                ans = Math.max(ans, sum);

            }
            dp[ind] = ans;
            }
        return dp[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int ans = maxSumAfterPartitioning(array, k);
        System.out.println(ans);
    }
}
