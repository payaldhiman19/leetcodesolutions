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
    int res=-1;
    int cnt=0;
    public void inorder(TreeNode root,int k){
        if(root==null) return;
        inorder(root.left,k);
        //check first in left as smallest will be in left
        cnt++;
        if(cnt==k){
            res=root.val;
            return ;
        }
        //else check in right subtree
        inorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;
            }
}