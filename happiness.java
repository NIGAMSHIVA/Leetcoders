import java.util.Arrays;
import java.util.Scanner;
public class happiness {
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int c = 0;
        long sum = 0;
        for (int j = happiness.length - 1; j >= 0; j--) {
            if (c == k)
                break;
            if (happiness[j]-c <= 0)
                break;
            sum = sum + happiness[j]-c;
            c++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int happiness[] = new int[n];
        for (int i = 0; i < n; i++) {
            happiness[i] = sc.nextInt();
        }
        System.out.println(maximumHappinessSum(happiness, k));
    }
}
