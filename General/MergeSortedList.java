import java.util.*;

public class MergeSortedList{
    public static void main(String[] args){
        Solution4 sol = new Solution4();
        ListNode ln1 = new ListNode();
        ListNode ln2 = new ListNode();
        ListNode ln3 = new ListNode();

        ln1 = new ListNode(4);
        ln1 = new ListNode(2, ln1);
        ln1 = new ListNode(1, ln1);

        ln2 = new ListNode(4);
        ln2 = new ListNode(3, ln2);
        ln2 = new ListNode(1, ln2);

        
        ln3 = sol.mergeTwoLists(ln1, ln2);
        while(ln3 != null){
            System.out.print(ln3.val+" ");
            ln3 =ln3.next;
        }
        System.out.println("\n");
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution4 {

    public static ListNode insertAtEnd(ListNode list, int value){
        ListNode newNode = new ListNode(value);
        ListNode currentNode = list;

        if(list == null){
            list = newNode;
            return list;
        }
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        return list;
    } 

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = null;
        // list3 = null;
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode head3 = list3;
        // System.out.println(head1.val);

        // if(head3 == null && (head1.val >= head2.val)){
        //     ListNode newNode = new ListNode(head1.val);
        //     // head3 = newNode;
        //     // currentNode = head3;
        //     list3 = newNode;
        //     head1 = head1.next;
        // }
        // else if(list3 == null && head1.val < head2.val){
        //     ListNode newNode = new ListNode(head2.val);
        //     // head3 = newNode;
        //     // currentNode = head3;
        //     list3 = newNode;
        //     head2 = head2.next;
        // }

        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                list3 = insertAtEnd(list3, head1.val);
                head1 = head1.next;
                // currentNode.next = head1;
                // currentNode = head1;
                // currentNode.next = null;
                // head1 = head1.next;
            }
            else{
                list3 = insertAtEnd(list3, head2.val);
                head2 = head2.next;
                // currentNode.next = head2;
                // currentNode = head2;
                // currentNode.next = null;
                // head2 = head2.next;
            }
        }

        if(head1 == null && head2 != null){
            while(head2 != null){
                list3 = insertAtEnd(list3, head2.val);
                head2 = head2.next;
                // currentNode.next = head2;
                // currentNode = head2;
                // currentNode.next = null;
                // head2 = head2.next;
            }
        }
        else if(head2 == null && head1 != null){
            while(head1 != null){
                list3 = insertAtEnd(list3, head1.val);
                head1 = head1.next;
                // currentNode.next = head1;
                // currentNode = head1;
                // currentNode.next = null;
                // head1 = head1.next; 
            }
        }
        

        return list3;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 /*---------------------------------------------------------------------Working solution below ---------------------------------------------------------------------*/

// class Solution4 {

//     public static ListNode insertAtEnd(ListNode list, int value){
//         ListNode newNode = new ListNode(value);
//         ListNode currentNode = list;

//         while(currentNode.next != null){
//             currentNode = currentNode.next;
//         }

//         currentNode.next = newNode;
//         return list;
//     } 

//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode list3 = new ListNode();
//         ListNode head1 = list1;
//         ListNode head2 = list2;
//         list3 = null;
//         // System.out.println(head1.val);

//         if(list3 == null && head1.val >= head2.val){
//             ListNode newNode = new ListNode(head1.val);
//             // head3 = newNode;
//             // currentNode = head3;
//             list3 = newNode;
//             head1 = head1.next;
//         }
//         else if(list3 == null && head1.val < head2.val){
//             ListNode newNode = new ListNode(head2.val);
//             // head3 = newNode;
//             // currentNode = head3;
//             list3 = newNode;
//             head2 = head2.next;
//         }

//         while(head1 != null && head2 != null){
//             if(head1.val <= head2.val){
//                 list3 = insertAtEnd(list3, head1.val);
//                 head1 = head1.next;
//                 // currentNode.next = head1;
//                 // currentNode = head1;
//                 // currentNode.next = null;
//                 // head1 = head1.next;
//             }
//             else{
//                 list3 = insertAtEnd(list3, head2.val);
//                 head2 = head2.next;
//                 // currentNode.next = head2;
//                 // currentNode = head2;
//                 // currentNode.next = null;
//                 // head2 = head2.next;
//             }
//         }

//         if(head1 == null && head2 != null){
//             while(head2 != null){
//                 list3 = insertAtEnd(list3, head2.val);
//                 head2 = head2.next;
//                 // currentNode.next = head2;
//                 // currentNode = head2;
//                 // currentNode.next = null;
//                 // head2 = head2.next;
//             }
//         }
//         else if(head2 == null && head1 != null){
//             while(head1 != null){
//                 list3 = insertAtEnd(list3, head1.val);
//                 head1 = head1.next;
//                 // currentNode.next = head1;
//                 // currentNode = head1;
//                 // currentNode.next = null;
//                 // head1 = head1.next; 
//             }
//         }
        

//         return list3;
//     }
// }

/*---------------------------------------------------------------------Working solution above ---------------------------------------------------------------------*/

// class Solution4 {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode list3 = new ListNode();
//         ListNode head1 = list1;
//         ListNode head2 = list2;
//         list3 = null;
//         ListNode head3;
//         ListNode currentNode = list3;

//         // System.out.println(head1.val);

//         if(list3 == null && head1.val >= head2.val){
//             head3 = head1;
//             list3 = head3;
//             currentNode = list3;
//             head1 = head1.next;
//         }
//         else if(list3 == null && head1.val < head2.val){
//             head3 = head2;
//             list3 = head3;
//             currentNode = head2;
//             head2 = head2.next;
//         }

//         while(head1 != null && head2 != null){
//             if(head1.val >= head2.val){
//                 currentNode.next = head1;
//                 currentNode = head1;
//                 currentNode.next = null;
//                 head1 = head1.next;
//             }
//             else{
//                 currentNode.next = head2;
//                 currentNode = head2;
//                 currentNode.next = null;
//                 head2 = head2.next;
//             }
//         }

//         if(head1 == null && head2 != null){
//             while(head2 != null){
//                 currentNode.next = head2;
//                 currentNode = head2;
//                 currentNode.next = null;
//                 head2 = head2.next;
//             }
//         }
//         else if(head2 == null && head1 != null){
//             while(head1 != null){
//                 currentNode.next = head1;
//                 currentNode = head1;
//                 currentNode.next = null;
//                 head1 = head1.next; 
//             }
//         }
        

//         return list3;
//     }
// }

