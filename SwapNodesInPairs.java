/*
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null ||head.next==null)return head;
        ListNode n = head.next;
        head.next=swapPairs(head.next.next);
        n.next=head;
        return n;
    }
}
*/
public class Solution {
    public ListNode swapPairs(ListNode head) {
       ListNode dummy=new ListNode(0);
       ListNode curr = dummy;
       dummy.next=head;
       while(curr.next!=null &&curr.next.next!=null)
       {
           ListNode first=curr.next;
           ListNode second=curr.next.next;
           first.next=second.next;
          curr.next=second;
          curr.next.next=first;
          curr=curr.next.next;
       }
       return dummy.next;
    }
}