public class Codec {
    private String NN="X";
    private String splitter = ",";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialHelper(root,sb);
        return sb.toString();
    }
    public void serialHelper(TreeNode root, StringBuilder sb)
    {
        if(root==null) sb.append(NN).append(splitter);
        else
        {
            sb.append(root.val).append(splitter);
            serialHelper(root.left,sb);
            serialHelper(root.right,sb);
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(splitter)));
        return helperDeserial(nodes);
    }
    
    public TreeNode helperDeserial(Deque<String> nodes)
    {
        String val = nodes.remove();
        if(val.equals(NN)) return null;
        else
        {
            TreeNode root = new TreeNode(Integer.valueOf(val));
            root.left = helperDeserial(nodes);
            root.right = helperDeserial(nodes);
             return root;
        }
       
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));