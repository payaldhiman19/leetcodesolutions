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
    public boolean identical(TreeNode n1,TreeNode n2){
          if(n1==null&&n2==null)return true;
        if(n1==null ||n2==null)return false;
        return (n1.val==n2.val)&&identical(n1.left,n2.left)&&identical(n1.right,n2.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)return false;
        if(subRoot==null)return true;
        if(identical(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
}