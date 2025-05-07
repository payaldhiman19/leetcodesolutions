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
    public void helper(TreeNode root,String s,List<String>ans){
        if(root==null){
            return;
    }
    //if its leaf then simple add in ans and return printing
    if(root.left==null &&root.right==null){
        s+=root.val;
        ans.add(s);
        return;
    }
    helper(root.left,s+root.val+"->",ans);

    helper(root.right,s+root.val+"->",ans);


    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans=new ArrayList<>();
        helper(root,"",ans);
        return ans;
    }
}