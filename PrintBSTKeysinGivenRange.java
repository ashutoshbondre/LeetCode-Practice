public List<Integer> printRange(TreeNode head, int lo,int hi)
{
	if(root==null) return null;
	ArrayList<Integer> ans = new ArrayList<Integer>();
	helper(head,lo,hi,ans);
	return ans;
	}

	public void helper(head,lo,hi,ans)
	{
		if(head.data<lo || head.data>hi) return;
		if(head.data>=lo && hi.data<=high)
			{
				helper(head.left,lo,hi,ans);
				ans.add(head.data);
				helper(head.right,lo,hi,ans);
			}

	}