public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int qsize = root==null?0:1;
        while(qsize!=0)
        {
            int largest = Integer.MIN_VALUE;
            for(int i=0;i<qsize;i++)
            {
                TreeNode node = q.poll();
                largest = Math.max(largest,node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            res.add(largest);
            qsize=q.size();
        }
        return res;
    }
}