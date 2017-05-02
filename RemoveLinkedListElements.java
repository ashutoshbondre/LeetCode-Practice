public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        if(head.next==null && head.val==val) return null;
        if(head.next==null && head.val!=val) return head;
        ListNode Dummy=new ListNode(-100);
        Dummy.next=head;
        ListNode prev = Dummy;
        ListNode current = head;
        ListNode next = current.next;
        while(next!=null)
        {
            if(current.val == val)
            {
                prev.next=next;
            }
           else
           {
               prev=current;
           
           }
            current=next;
            next=next.next;
        }
        if(current.val==val)
        {
            prev.next=null;
        }
        return Dummy.next;
        
    }
}


*/ 

Solution 2: 
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return null;
        ListNode next = removeElements(head.next,val);
        if(head.val==val) return next;
        head.next=next;
        return head;
        
    }
}

*/