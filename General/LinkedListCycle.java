package General;

public class LinkedListCycle{
    public static void main(String[] args){
        Solution73 sol = new Solution73();

        ListNode ln1 = new ListNode();
        
        ln1 = new ListNode(4);
        ln1 = new ListNode(2, ln1);
        ln1 = new ListNode(1, ln1);

        boolean result = sol.hasCycle(ln1); 
        System.out.println(result);
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

class Solution73 {
    public boolean hasCycle(ListNode head) {
        ListNode current = head; 
        ListNode previous = head; 
        
        if(current == null){
            return false;
        }
        else if(current.next == null){
            return false;
        }

        // Set<ListNode> alreadySeen = new HashSet<>();
        // ListNode current = head; 

        // while(current != null){
        //     if(!alreadySeen.add(current)) return true;
        //     current = current.next;
        // }
        
        // return false;

        while(current != null && current.next != null && current.next.next != null){
            previous = previous.next;
            current = current.next.next;
            if(current == previous){
                return true;
            }
        }

        return false;
    }
}