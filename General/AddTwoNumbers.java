public class AddTwoNumbers {
    public static void main(String[] args){
        Solution42 sol = new Solution42();
        ListNode ln1 = new ListNode();
        ListNode ln2 = new ListNode();
        ListNode ln3 = new ListNode();

        ln1 = new ListNode(4);
        ln1 = new ListNode(2, ln1);
        ln1 = new ListNode(1, ln1);

        ln2 = new ListNode(4);
        ln2 = new ListNode(3, ln2);
        ln2 = new ListNode(1, ln2);

        
        ln3 = sol.addTwoNumbers(ln1, ln2);
        while(ln1 != null){
            System.out.print(ln1.val+" ");
            ln1 =ln1.next;
        }
        System.out.println("\n");

        while(ln2 != null){
            System.out.print(ln2.val+" ");
            ln2 =ln2.next;
        }
        System.out.println("\n----- +");


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
class Solution42 {

    public static ListNode insertAtEnd(ListNode list, int sum){
        
        ListNode newNode = new ListNode((sum));
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalList = null;
        ListNode head1 = l1;
        ListNode head2 = l2;

        int carry = 0;
        while(head1 != null || head2 != null){
            if(head1 != null && head2 != null){
                int sum = head1.val + head2.val + carry;

                if(sum >= 10){
                    carry = 1;
                    sum = sum %10;
                }else{
                    carry = 0;
                }

                // ListNode newNode = new ListNode((sum + carry));

                head1 = head1.next;
                head2 = head2.next;

                finalList = insertAtEnd(finalList, sum);
                // System.out.println(carry);
                
                // if(finalList == null){
                //     finalList = newNode;
                // }
                // else{
                //     currentNode.next = newNode;
                //     currentNode = currentNode.next;
                // }
            }else if(head1 == null && head2 != null){
                int sum = head2.val + carry;
                head2 = head2.next;

                if(sum >= 10){
                    carry = 1;
                    sum = sum %10;
                }else{
                    carry = 0;
                }

                finalList = insertAtEnd(finalList, sum);
                // System.out.println(carry);

                // ListNode newNode = new ListNode((sum + carry));
                // System.out.println(sum+carry);

                // if(finalList == null){
                //     finalList = newNode;
                // }
                // else{
                //     currentNode.next = newNode;
                //     currentNode = currentNode.next;
                // }
            }
            else if(head2 == null && head1 != null){
                int sum = head1.val + Integer.valueOf(carry);
                head1 = head1.next;

                if(sum >= 10){
                    carry = 1;
                    sum = sum %10;
                }else{
                    carry = 0;
                }


                finalList = insertAtEnd(finalList, sum);
                // System.out.println(carry);
                // ListNode newNode = new ListNode((sum + carry));
                // System.out.println(sum+carry);

                // if(finalList == null){
                //     finalList = newNode;
                // }
                // else{
                //     currentNode.next = newNode;
                //     currentNode = currentNode.next;
                // }
            }
        }

        if(carry == 1){
            carry = 0;
            finalList = insertAtEnd(finalList, 1);
        }

        return finalList;
    }
}