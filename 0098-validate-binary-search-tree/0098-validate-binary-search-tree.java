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
    public void inorder(TreeNode root,ArrayList<Integer>li){
    if(root==null) return;
    inorder(root.left,li);
    li.add(root.val);
    inorder(root.right,li);
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        ArrayList<Integer>li=new ArrayList<>();
       //sort 
       inorder(root,li);
       for(int i=0;i<li.size()-1;i++){
        if(li.get(i)>=li.get(i+1)){
            return false;
        }
       }
       return true;
    }
}