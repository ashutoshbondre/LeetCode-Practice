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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null || inorder==null || inorder.length!=preorder.length)
        {
            return null;
        }
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++)
        {
            hmap.put(inorder[i],i);
        }
        return build(inorder,0,inorder.length-1,preorder,0,preorder.length-1,hmap);
    }
    
    public TreeNode build( int [] inorder, int is, int ie, int [] preorder,int ps, int pe, HashMap<Integer,Integer> hmap)
    {
        
        if(ps>pe || is>ie ) return null;
        TreeNode root = new TreeNode(preorder[ps]);
        int index = hmap.get(preorder[ps]);
        TreeNode leftChild = build(inorder,is,index-1,preorder,ps+1,ps+index-is,hmap);
        TreeNode rightChild = build(inorder,index +1,ie,preorder,index+1+pe-ie,pe,hmap);
        root.left=leftChild;
        root.right=rightChild;
        return root;
   
    }
}