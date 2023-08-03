package General;
import Algorithms.Node;
import Algorithms.BinaryTree;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 8/2/23 10:20 PM
 */
public class BalancedBinaryTree {
    public static void main(String[] args){
        Node tree = new Node();
        Solution66 sol = new Solution66();

        Node left = new Node(9);
        Node right = new Node(20);

        tree = new Node(3, left, right);
        tree.right.insertCustomValue(tree.right, new Node(15), new Node(7));

        BinaryTree.preOrderTraversal(tree);

        boolean result = sol.isBalanced(tree);

        System.out.println("\n"+result);
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution66 {
    boolean balanced = true;

    public int max(Node root){
        if(root == null)
            return -1;
        int hLeft = max(root.left);
        int hRight = max(root.right);

        if(Math.abs(hLeft - hRight) > 1)
            balanced = false;
        return 1 + Math.max(hLeft, hRight);
    }

    public boolean isBalanced(Node root) {
        if(root == null)
            return true;

        max(root);

        return balanced;
    }
}