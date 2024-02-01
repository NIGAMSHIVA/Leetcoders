import java.util.Arrays;
import java.util.Scanner;

public class dividearray {

    public static int[][] divideArray(int[] nums, int k) {

        Arrays.sort(nums);
        int flag = 0;

        int matrices[][] = new int[nums.length / 3][3];
        int row = 0,count=0;
        for (int i = 0; i <= nums.length - 3; i = i + 3) {

            if ((nums[i + 2] - nums[i]) <= k) {

                count++;

            }
        }
        if (count == nums.length / 3) {
            flag = 1;

            for (int i = 0; i <= nums.length - 3; i = i + 3) {

                if ((nums[i + 2] - nums[i]) <= k) {

                    matrices[row][0] = nums[i];
                    matrices[row][1] = nums[i + 1];
                    matrices[row][2] = nums[i + 2];
                    row++;
                }
            }

        }
        if (flag == 0)
            return new int[0][0];
            else

        return matrices;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int mat[][] = divideArray(arr, k);

        for (int i = 0; i < mat.length; i++) {
            // Iterate through the columns
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    

            

    }
}