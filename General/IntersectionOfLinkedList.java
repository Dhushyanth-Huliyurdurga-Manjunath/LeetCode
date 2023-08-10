import java.util.LinkedList;
import java.util.List;

// public class IntersectionOfLinkedList {
//     public static void main(String[] args){
//         Solution74 sol = new Solution74();

//         ListNode ln1 = new ListNode();
//         ListNode ln2 = new ListNode();

//         ln1 = new ListNode(4);
//         ln1 = new ListNode(2, ln1);
//         ln1 = new ListNode(1, ln1);
//     }
// }

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution74 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> nodesA = new LinkedList<>();
        List<ListNode> nodesB = new LinkedList<>();

        while(headA != null){
            nodesA.add(headA);
            headA = headA.next;
        }

        while(headB != null){
            nodesB.add(headB);
            headB = headB.next;
        }

        if(nodesA.size() < nodesB.size()){
            for(ListNode n: nodesA){
                if(nodesB.contains(n))return n;
            }
        }
        else{
            for(ListNode n: nodesB){
                if(nodesA.contains(n))return n;
            }
        }

        return null;
    }
}