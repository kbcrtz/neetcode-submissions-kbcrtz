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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //check if root and sub are same
        //if not, call issubtree on root.left and subroot, and root.right and sub
        //if same, call is same on root and sub
        if(root == null){
            return false;
        }
        if(subRoot == null){
            return true;
        }
        if(isSame(root,subRoot)){
            return true;        
            }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    public boolean isSame(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null){
            return false;
        }
        if(q == null){
            return false;
        }
        if(p.val == q.val){
            return isSame(p.left,q.left) && isSame(p.right, q.right);
        }else{
            return false;
        }
    }
}
