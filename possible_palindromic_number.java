import java.util.HashMap;
import java.util.Scanner;
class Solution {
    public static boolean fncn(int number) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while (number != 0) {
            int rem = number % 10;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
            number = number / 10;

        }
        int count = 0;
        for (int value : map.values()) {
            if (value % 2 == 1)
                count++;
        }
        if(count<=1)
            return true;
            else
                return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = fncn(num);
        System.out.println(res);

        
    }
}