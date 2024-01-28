import java.util.Scanner;

public class AliceandBob {
    
    public static long flowerGame(int n, int m) {
        return (long) n * m / 2;
    }
             
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans = flowerGame(n, m);
        System.out.println(ans);
    }

}
