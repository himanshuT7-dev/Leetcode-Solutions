/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            for(int i = 0; i < size; i++)
            {
                TreeNode v = q.poll();
                temp.add(v.val);

                if(v.left != null)
                    q.offer(v.left);
                if(v.right != null)
                    q.offer(v.right);
            }

            res.add(temp);
        }
        return res;
    }
}