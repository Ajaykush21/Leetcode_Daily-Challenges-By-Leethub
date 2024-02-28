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
    private int maxDepth;
    private int bottomleftValues;
    
    public int findBottomLeftValue(TreeNode root) {
        maxDepth=-1;
        bottomleftValues=0;
        dfs(root,0);
        return bottomleftValues;
        
    }
    public void  dfs(TreeNode current ,int depth){
        if(current == null){
            return ;
        }
        if(depth>maxDepth){
            maxDepth = depth;
            bottomleftValues = current.val;
        }
        dfs(current.left,depth+1);
        dfs(current.right,depth+1);
    }
}