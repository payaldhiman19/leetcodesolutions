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
    public boolean twosum(TreeNode root,int k,HashSet<Integer>seen){
    if(root==null) return false;
    if(seen.contains(k-root.val)){
        //if it is present then we have found the pair
        return true;
    }
    //else add in set
    seen.add(root.val);
    //if either in left or right we found the pair once we have to return true so we use or operator here
    return twosum(root.left,k,seen) || twosum(root.right,k,seen);
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        HashSet<Integer>set=new HashSet<>();
        return twosum(root,k,set);
    }
}