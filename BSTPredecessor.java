public TreeNode predec(TreeNode root, TreeNode p)
{
	if(root==null) return null;

	if(root.val>=p.val)
		return predec(root.left,p);

	else
	{
		TreeNode right = predec(root.right,p);
		return (right!=null) ? right : root;
	}
}