class Solution {
    public int closestValue(TreeNode root, double target) {
    int ret = root.val;
        while(root!=null)
        {
            if(Math.abs(root.val-target)<Math.abs(ret-target))
            {
                ret = root.val;
            }
            root = root.val>target? root.left:root.right;
        }
        return ret;
}
}


/*Recursive:

    public int closestValue(TreeNode root, double target) {
        int a  = root.val;
        TreeNode kid = target<a ? root.left:root.right;
        if(kid==null) return a;
        int b = closetValue(kid,target);
        return Math.abs(a-target) < Math.abs(b-target) ? a:b;
    }
  
*/