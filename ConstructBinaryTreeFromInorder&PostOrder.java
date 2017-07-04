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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length)
        {
            return null;
        }
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++)
        {
            hmap.put(inorder[i],i);
        }
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hmap);
    }
    
    public TreeNode build( int [] inorder, int is, int ie, int [] postorder,int ps, int pe, HashMap<Integer,Integer> hmap)
    {
        
        if(ps>pe || is>ie ) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int index = hmap.get(postorder[pe]);
        TreeNode leftChild = build(inorder,is,index-1,postorder,ps,ps+index-is-1,hmap);
        TreeNode rightChild = build(inorder,index +1,ie,postorder,ps+index-is,pe-1,hmap);
        root.left=leftChild;
        root.right=rightChild;
        return root;
   
    }
}