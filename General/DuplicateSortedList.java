public class DuplicateSortedList{
    public static void main(String[] args){
        Solution61 sol = new Solution61();

        ListNode ln1 = new ListNode();
        ln1 = new ListNode(3);
        ln1 = new ListNode(3, ln1);
        ln1 = new ListNode(2, ln1);
        ln1 = new ListNode(1, ln1);
        ln1 = new ListNode(1, ln1);
        ListNode ln3 = new ListNode(); 
        ln3 = sol.deleteDuplicates(ln1);

        while(ln3 != null){
            System.out.print(ln3.val+" ");
            ln3 =ln3.next;
        }
        System.out.println("\n");
    }
}

class Solution61 {
    public ListNode deleteDuplicates(ListNode head) {
       
        if(head == null){
            return head;
        }

        ListNode currentNode = head;

        while(currentNode != null && currentNode.next != null){
            if(currentNode.val == currentNode.next.val){
                currentNode.next = currentNode.next.next;
                // currentNode = currentNode.next;
            }
            else{
                currentNode = currentNode.next;
            }
        }
        return head;

           
    }
}