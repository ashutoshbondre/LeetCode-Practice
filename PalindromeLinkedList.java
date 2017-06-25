public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
       slow=slow.next;
       ListNode newHead = reverse(slow);
        while(newHead!=null)
        {
            if(newHead.val!=head.val)return false;
            newHead=newHead.next;
            head=head.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode newHead = null;
        while(head!=null)
        {
            ListNode next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
    }
}