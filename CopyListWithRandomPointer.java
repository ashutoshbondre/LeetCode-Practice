/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null) return head;
        RandomListNode node = head;
        HashMap<RandomListNode,RandomListNode> hmap = new HashMap<RandomListNode,RandomListNode>();
        while(node!=null)
        {
            hmap.put(node, new RandomListNode(node.label));
            node=node.next;
        }
        node =head;
        while(node!=null)
        {
            hmap.get(node).next=hmap.get(node.next);
            hmap.get(node).random = hmap.get(node.random);
            node=node.next;
        }
        return hmap.get(head);
        
    }
}