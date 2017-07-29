TreeNode root; //root of binary tree
ListNode head; //head of doubly linked list
ListNode prev = null;
public ListNode convert(TreeNode root)
{
	if(root==null) return; //base case

	convert(root.left);
	if(prev==null)
	{
		head=root;
	}
	else
	{
		root.left=prev;
		prev.right=root;
	}
	prev=root;
	convert(root.right);
	return head;

}