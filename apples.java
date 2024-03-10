import java.util.Arrays;
import java.util.Scanner;

public class apples {

    public static int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        Arrays.sort(capacity);
        for (int i = 0; i < apple.length; i++) {
            sum = sum + apple[i];

        }
        int sum2 = 0, c = 0;
        for (int j = capacity.length - 1; j >= 0; j--) {
            sum2 = sum2 + capacity[j];
            c++;
            if (sum2 >= sum) {
                break;

            }

        }
        return c;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int apples[] = new int[n];
        for (int i = 0; i < n; i++) {
            apples[i] = sc.nextInt();
        }
        int capacity[] = new int[m];
        for (int i = 0; i < m; i++) {
            capacity[i] = sc.nextInt();
        }
        System.out.println(minimumBoxes(apples, capacity));
    }
    
}
