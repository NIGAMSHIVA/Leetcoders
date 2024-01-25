import java.util.HashMap;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    public static int pseudoPalindromicPaths(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return fncn(root, map);

    }

    public static int fncn(TreeNode root, HashMap<Integer, Integer> map) 
    {
        if (root == null)
            return 0;
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        int count = 0;
        if ((root.left == null) && (root.right == null)) {

            for (int value : map.values()) {
                if (value % 2 == 1)
                    count++;
            }

            map.put(root.val, map.getOrDefault(root.val, 0) - 1);

            if (count <= 1)
                return 1;
            else
                return 0;
        }
        int left = fncn(root.left, map);
        int right = fncn(root.right, map);
        map.put(root.val, map.getOrDefault(root.val, 0) - 1);
        return left + right;
            }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        int myAns = pseudoPalindromicPaths(root);

        System.out.println(myAns);
    }
}
