class Solution {
    public int maxVal;
    public int maxPathSum(TreeNode root) {
        maxVal = Integer.MIN_VALUE;
        helper(root);
        return maxVal;
    }
    
    public int helper(TreeNode node)
    {
        if(node==null) return 0;
        int left = Math.max(0,helper(node.left));
        int right = Math.max(0,helper(node.right));
        maxVal = Math.max(maxVal,left+right+node.val);
        return Math.max(left,right) +node.val;
    }
}