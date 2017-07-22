public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode largeHead=large;
        ListNode smallHead=small;
        if(head==null) return head;
        ListNode dummy = head;
        while(dummy!=null)
        {
            if(dummy.val<x)
            {
                small.next=dummy;
                small=small.next;
            }
            else
            {
                large.next=dummy;
                large=large.next;
            }
            dummy=dummy.next;
        }
        large.next=null;
        small.next=largeHead.next;
        return smallHead.next;
    }
}