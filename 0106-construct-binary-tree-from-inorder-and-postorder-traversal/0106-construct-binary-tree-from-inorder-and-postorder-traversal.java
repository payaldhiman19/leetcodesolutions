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
 int post;
    public int leftright(int []inorder,int val,int st,int end){
        for(int i=st;i<=end;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }
    public TreeNode solve(int []inorder,int []postorder,int st,int end){
        if(st>end)return null;
        TreeNode root=new TreeNode(postorder[post--]);
        int index=leftright(inorder,root.val,st,end);
        root.right=solve(inorder,postorder,index+1,end);
        root.left=solve(inorder,postorder,st,index-1);
        return  root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        post=postorder.length-1;
      return  solve(inorder,postorder,0,postorder.length-1);
    }
}