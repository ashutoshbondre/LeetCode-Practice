public TreeNode succ(TreeNode root, TreeNode p)
{
	if(root==null) return null;

	if(root.val<=p.val)
	{
		return succ(root.right,p);
	}
	else
	{
		TreeNode left = succ(root.left,p);
		return (left!=null) ? left : root;
	}
}