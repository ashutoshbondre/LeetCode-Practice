public class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfsheight(root)!=-1;
    }
    public int dfsheight(TreeNode root)
    {
        if(root==null) return 0;
        int leftht = dfsheight(root.left);
        if(leftht==-1) return -1;
        int rightht=dfsheight(root.right);
        if(rightht==-1) return -1;
        if(Math.abs(leftht-rightht)>1) return -1;
        return Math.max(leftht,rightht)+1;
    }
}