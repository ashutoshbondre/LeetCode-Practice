/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean zigzag=false;
        while(!queue.isEmpty())
        {
            int iterator = queue.size();
            List<Integer> sublist = new ArrayList<Integer>();
            for(int i=0;i<iterator;i++)
            {
                TreeNode curr = queue.poll();
                if(zigzag)
                {
                    sublist.add(0,curr.val);
                }
                else
                {
                    sublist.add(curr.val);
                }
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            
        }
            res.add(sublist);
            zigzag=!zigzag;
    }
        return res;
}
}