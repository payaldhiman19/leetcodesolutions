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
    int preindex=0;
    public int leftright(int []inorder,int val,int st,int end){
        for(int i=st;i<=end;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }
    public TreeNode solve(int []inorder,int []preorder,int st,int end){
        if(st>end)return null;
        TreeNode root=new TreeNode(preorder[preindex++]);
        int index=leftright(inorder,root.val,st,end);
        root.left=solve(inorder,preorder,st,index-1);
        root.right=solve(inorder,preorder,index+1,end);
        return  root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preindex=0;
       return solve(inorder,preorder,0,inorder.length-1);
    }
}