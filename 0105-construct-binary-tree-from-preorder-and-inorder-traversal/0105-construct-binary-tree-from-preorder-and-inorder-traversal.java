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
    public int rootsearch(int []in,int start,int end,int ele){
        for(int i=start;i<=end;i++){
            if(in[i]==ele){
                return i;
            }
        }
        return -1;
    }
    public TreeNode build(int pre[],int in[],int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root=new TreeNode(pre[preindex]);
        preindex++;
        int index=rootsearch(in,start,end,root.val);
        root.left=build(pre,in,start,index-1);
        root.right=build(pre,in,index+1,end);
        
       
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preindex=0;
        return build(preorder,inorder,0,inorder.length-1);
            }
}