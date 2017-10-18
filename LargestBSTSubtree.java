/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int largestBSTSubtree(TreeNode root) {
        if(root==null) return 0;
        if(root.left ==null && root.right ==null) return 1;
        if(isValid(root,null,null)) return countNodes(root);
        return Math.max(largestBSTSubtree(root.left) , largestBSTSubtree(root.right));
    }
    
    private boolean isValid(TreeNode root,Integer min, Integer max)
    {
        if(root==null) return true;
        if(min!=null && min>=root.val) return false;
        if(max!=null && max<=root.val) return false;
        return isValid(root.left,min,root.val) && isValid(root.right,root.val,max);
    }
    
    private int countNodes(TreeNode root)
    {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return 1+countNodes(root.left) + countNodes(root.right);
    }
}