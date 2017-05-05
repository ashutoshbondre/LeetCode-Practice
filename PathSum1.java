public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root ==null) return false;
        
        return helper(root,sum)||helper(root.left,sum-root.val) || helper(root.right,sum-root.val);
    }
    
    public boolean helper(TreeNode node, int sum)
    {
        if(node==null) return false;
        if(node.left==null && node.right==null && node.val==sum) return true;
        return helper(node.left,sum-node.val) || helper(node.right,sum-node.val);
    }
}
