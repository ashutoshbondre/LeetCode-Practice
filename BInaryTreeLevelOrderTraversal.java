public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root==null) return result;
        q.offer(root);
        while(!q.isEmpty())
        {
            int level = q.size();
            List<Integer> sublist = new ArrayList<Integer>();
            for(int i=0;i<level;i++)
            {
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                sublist.add(q.poll().val);
            }
            result.add(sublist);
        }
        return result;
    }
}