import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Algorithms.Node;

public class PreOrderTraversal {
    public static void main(String[] args){
        Solution74 sol = new Solution74();  
        Node tree = new Node();

        tree = tree.insertValue(1);
        tree.insertValue(2);
        tree.insertValue(3);

        List<Integer> result = new ArrayList<>();

        result = sol.preorderTraversal(tree);
        System.out.println(result);
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
class Solution74 {
    // List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        Node currentNode = root;

        //-------------------------Iterative Solution ------------------------------------------------//
        while(!stack.empty() || currentNode != null){
            while(currentNode != null){ //Adds all the nodes present to the left of the currentNode
                stack.add(currentNode); //add the root to the stack
                list.add(currentNode.val); //add the root to the traversal list
                currentNode = currentNode.left; //move to the left
            }
            currentNode = stack.pop(); 
            currentNode = currentNode.right; //pop the left most node and go to its right subtee             
        }

        return list;
        //-------------------------Iterative Solution ------------------------------------------------//

        //-------------------------Recursive Solution ------------------------------------------------//
        // if(root != null){
        //     list.add(root.val);
        //     preorderTraversal(root.left);
        //     preorderTraversal(root.right);
        // }
        // return list;
        //-------------------------Recursive Solution ------------------------------------------------//
    }
}