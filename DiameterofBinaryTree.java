public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int curr = depth(root.left)+depth(root.right);
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        return Math.max(curr,Math.max(left,right));
    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(depth(root.left),depth(root.right));
    }
}