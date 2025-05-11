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
    //take first element as root and recurssively which is smaaler place it in left and greater in right
     int index=0;
    public TreeNode buildtree(int []preorder,int leftchild,int rightchild){
        //if we have traversed all the elements 
        if(index==preorder.length) return null;
        //index here is pointing node one by one
        int val=preorder[index];
        if(val<leftchild ||val>rightchild){
            //out of bound
            return null;
        }
        //create node
        TreeNode node=new TreeNode(val);
       index++; //move to next ellemnt
       node.left=buildtree(preorder,leftchild,val);
       node.right=buildtree(preorder,val,rightchild);
       return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
      return buildtree(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);  
    }
}