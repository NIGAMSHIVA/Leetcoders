import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class polishnotation {
    public static int evalRPN(String[] tokens) {
        // Let Me show you the beauty of the Stack
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if ((!tokens[i].equals("+")) && (!tokens[i].equals("-")) && (!tokens[i].equals("/")) && (!tokens[i].equals("*"))) {
                st.push(Integer.parseInt(tokens[i]));
            } else {
                int a = st.pop();
                int b = st.pop();
                int c = 0;
                if (tokens[i].equals("/"))
                    c = b / a;
                if (tokens[i].equals("+"))
                    c = b + a;
                if (tokens[i].equals("*"))
                    c = b * a;
                if (tokens[i].equals("-"))
                    c = b - a;
                st.push(c);
            }
        }
        return st.pop();
        }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine(); 
        String arr[] = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }
        int myRes = evalRPN(arr);
        System.out.println(myRes);

    }
}
