public class Solution {
    int sum =0;
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }
    
    public void convert(TreeNode curr)
    {
        if(curr==null) return;
        convert(curr.right);
        curr.val+=sum;
        sum=curr.val;
        convert(curr.left);
    }
}