import java.util.Scanner;

public class countkeys {
    public static int countKeyChanges(String s) {
        String str = s.toUpperCase();
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1))
                count++;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = countKeyChanges(s);
        System.out.println(ans);
    }


}


