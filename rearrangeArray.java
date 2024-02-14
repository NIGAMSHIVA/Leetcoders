import java.util.Scanner;

public class rearrangeArray {

    public static int[] rearrangeArray(int[] nums) {
        int pos[] = new int[nums.length / 2];
        int neg[] = new int[nums.length / 2];
        int j = 0,z=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos[j] = nums[i];
                j++;
            } else {
                neg[z] = nums[i];
                z++;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = pos[i / 2];

            } else {
                nums[i] = neg[i / 2];
            }
        }

        return nums;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = rearrangeArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    
}
