/**
 * Definition for a binary tree no.
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       Queue<TreeNode>q=new LinkedList<>();
       List<List<Integer>> res=new ArrayList<>();
       if(root==null){
        return res;
       }
      q.add(root);
      boolean lefttoright=true;
      while(!q.isEmpty()){
        int size=q.size();
    List<Integer>level=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
            if(lefttoright){
                level.add(curr.val);
            }else{  //if from left to right insert at begining
                level.add(0,curr.val);
            }
         if(curr.left!=null)
            q.add(curr.left);
         
         if(curr.right!=null)
            q.add(curr.right);
        }
           res.add(level);
        lefttoright=!lefttoright;
      
              }      
      return res;
    }
}