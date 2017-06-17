public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lht=height(root.left);
        int rht =height(root.right);
        if(Math.abs(lht-rht)<=1 && isBalanced(root.left)&&isBalanced(root.right)) return true;
        else
        return false;
    }
    public int height(TreeNode sample)
    {
        if(sample==null) return 0;
        else return 1+ Math.max(height(sample.left),height(sample.right));
    }
}
