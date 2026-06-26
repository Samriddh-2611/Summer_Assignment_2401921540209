public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
         StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }
     private void preorder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N,");
            return;
        }
        sb.append(root.val).append(",");
        preorder(root.left, sb);
        preorder(root.right, sb);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       String[] arr = data.split(",");
        Queue<String> queue = new LinkedList<>();
        for (String s : arr)
            queue.offer(s);
        return build(queue);    
}
 private TreeNode build(Queue<String> queue) {
        String val = queue.poll();
        if (val.equals("N"))
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = build(queue);
        root.right = build(queue);
        return root;
    }
}
