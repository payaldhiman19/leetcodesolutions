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
    public void inorder(TreeNode root,List<Integer>li){
        if(root==null)return;
        inorder(root.left,li);
        li.add(root.val);
        inorder(root.right,li);
    }
    public TreeNode helper(List<Integer>li,int start,int end){
    if(start>end)return null;
    int mid=start+(end-start)/2;
    TreeNode root=new TreeNode(li.get(mid));
    root.left=helper(li,start,mid-1);
    root.right=helper(li,mid+1,end);
    return root;
    }
    public TreeNode balanceBST(TreeNode root) {
       if(root==null)return null;
       List<Integer>li=new ArrayList<>();
       inorder(root,li);
     return  helper(li,0,li.size()-1);
    }
}