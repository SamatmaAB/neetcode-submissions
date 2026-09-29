class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {

            // 1. Keep going left
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // 2. Come back to the most recent node
            current = stack.pop();

            // 3. Visit it
            result.add(current.val);

            // 4. Now explore its right side
            current = current.right;
        }

        return result;
    }
}