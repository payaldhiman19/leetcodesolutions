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
    public TreeNode invert(TreeNode root){
        if(root== null) return null;
        //swap 
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invert(root.left);
        invert(root.right);
        return root;
    }
    public boolean issame(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
         if(p.val!=q.val){
            return false;
        }
        return issame(p.left,q.left)&&issame(p.right,q.right);
    }
    //invert left tree tahn t=check if bothe afe same tree or not
    public boolean isSymmetric(TreeNode root) {
        //invert tree same tree
        if(root==null){
            return true;
        }
        root.left=invert(root.left);
        return issame(root.left,root.right);
    }
}