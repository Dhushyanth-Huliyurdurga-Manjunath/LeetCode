package General;

import Algorithms.Node;

public class SameTree {
     public static void main(String[] args){
        Solution63 sol = new Solution63();  
        Node treeP = new Node();
        Node treeQ = new Node();

        treeP = treeP.insertValue(1);
        treeP.insertValue(2);
        treeP.insertValue(3);

        treeQ = treeQ.insertValue(1);
        treeQ.insertValue(2);
        treeQ.insertValue(3);

        boolean result = sol.isSameTree(treeP, treeQ);
        System.out.println(result);

    }    
}

class Solution63 {
    public boolean isSameTree(Node p, Node q) {
    
        if(p == null && q == null)
            return true;
        if(p == null || q == null || p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }   
}