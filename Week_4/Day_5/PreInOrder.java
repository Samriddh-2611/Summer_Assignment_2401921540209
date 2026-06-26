class Solution {
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }
    private TreeNode build(int[] preorder, int[] inorder, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int index = left;
        while (inorder[index] != rootVal) {
            index++;
        }
        root.left = build(preorder, inorder, left, index - 1);
        root.right = build(preorder, inorder, index + 1, right);
        return root;
    }
}
