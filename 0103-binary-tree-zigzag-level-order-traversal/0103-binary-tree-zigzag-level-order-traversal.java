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
        TreeNode temp=q.poll();
        if(lefttoright){
        level.add(temp.val);
        }else{
            level.add(0,temp.val);
        }
        if(temp.left!=null){
            q.add(temp.left);
        }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        res.add(level);
        lefttoright=!lefttoright;
       } 
       return res;
    }
}