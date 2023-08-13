package General;

import Algorithms.BinaryTree;
import Algorithms.Node;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 8/5/23 12:17 PM
 */

/**
  Given the root of a binary tree and an integer targetSum,
  return true if the tree has a root-to-leaf path such that
  adding up all the values along the path equals targetSum.
  A leaf is a node with no children.
 */

/**
 * Input: root = [1,2,3], targetSum = 5
 * Output: false
 * Explanation: There two root-to-leaf paths in the tree:
 * (1 --> 2): The sum is 3.
 * (1 --> 3): The sum is 4.
 * There is no root-to-leaf path with sum = 5.
 */
public class PathSum {
    public static void main(String[] args){
        Solution67 sol = new Solution67();
        Node tree = new Node();

        Node left = new Node(4);
        Node right = new Node(8);

        tree = new Node(5, left, right);
        tree.right.insertCustomValue(tree.right, new Node(13), new Node(4));
        tree.left.insertCustomValue(tree.left, new Node(11), new Node());

        BinaryTree.preOrderTraversal(tree);

        boolean result = sol.hasPathSum(tree, 20);

        System.out.println("\n"+result);
    }
}

/**
 * Definition for a binary tree node.
 * public class Node {
 *     int val;
 *     Node left;
 *     Node right;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node left, Node right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution67 {

    boolean result = false;

    public void pathSum(Node root, int value, int targetSum){
        if(root == null){
            return;
        }

        if(value + root.val == targetSum && (root.left == null && root.right == null)){
            result = true;
            return;
        }
        pathSum(root.left, root.val+value, targetSum);
        pathSum(root.right, root.val+value, targetSum);
        return;
    }

    public boolean hasPathSum(Node root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.val == targetSum && (root.left == null && root.right == null)){
            return true;
        }

        pathSum(root, 0, targetSum);

        return result;
    }
}