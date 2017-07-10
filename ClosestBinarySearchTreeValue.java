public int closest (TreeNode root, double target)
{
	int ret = root.val;
	while(root!=null)
	{
		if(Math.abs(root.val - target) < Math.abs(ret.val-target))
		{
			ret=root.val;
		}
		root = root.val<target?root.right:root.left;

	}
	return ret;
}