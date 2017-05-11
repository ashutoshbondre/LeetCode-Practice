public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
}

/*
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null) return null;
        if(head.next==null) return head;
        ListNode temp = head;
        ListNode dummy = head.next;
        while(dummy!=null)
        {
            while(dummy.val==temp.val)
            {
                if(dummy.next==null)
                {
                 temp.next=null;
                 return head;   
                }
                else
                dummy=dummy.next;
            }
            temp.next=dummy;
            temp=dummy;
            dummy=temp.next;
        }
        return head;
    }
}
/*
