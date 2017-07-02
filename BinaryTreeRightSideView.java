public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list =  new LinkedList<Integer>();
       if(root==null) return list;
       rightview(root,list,0);
       return list;
    }
    public void rightview(TreeNode node,List<Integer> list, int depth)
    {
        if(node==null) return;
        if(list.size()==depth) list.add(node.val);
        rightview(node.right,list,depth+1);
        rightview(node.left,list,depth+1);
    }
}