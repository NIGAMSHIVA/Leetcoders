import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sequencedigits {

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> arr1=new ArrayList<>();
        int arr[] = { 12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567, 678, 789, 1234, 2345, 3456, 4567, 5678,
                6789, 12345, 23456, 34567, 45678, 56789, 123456, 234567, 345678, 456789, 1234567, 2345678, 3456789,
                12345678, 23456789, 123456789 };

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= low) && (arr[i] <= high))
                arr1.add(arr[i]);
            

        }
        return arr1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        arr = sequentialDigits(low, high);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
