import java.util.Arrays;
import java.util.Scanner;

public class largestParameter {

    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int sum = 0,flag=0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if ((sum - nums[j]) > nums[j]) {
                flag = 1;
                break;
            } else {
                sum = sum - nums[j];
            }
        }
        if(flag==0)
            return -1;
            else
                return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long ans = largestPerimeter(arr);
        System.out.println(ans);
    }
}

