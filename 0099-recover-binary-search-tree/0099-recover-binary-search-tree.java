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
    public void inorder(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);
    }
    public void recoverTree(TreeNode root) {
        List <TreeNode>list=new ArrayList<>();
        inorder(root,list);
        TreeNode x=null,y=null;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).val>list.get(i+1).val){
                y=list.get(i+1);
                if(x==null) x=list.get(i);  //first where the incorrection first occurs
                else break;
            }
        }
//swap incorrect vlues
        int temp=x.val;
        x.val=y.val;
        y.val=temp;
    }
}