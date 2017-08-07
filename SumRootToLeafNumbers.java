public class Solution {
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    public int sum(TreeNode node , int s)
    {
        if(node==null) return 0;
        if(node.left==null && node.right==null) return (s*10+node.val);
        return sum(node.left,s*10+node.val) + sum(node.right,s*10+node.val);
    }
}