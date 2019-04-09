package unit.medium;

import java.time.temporal.Temporal;
import java.util.LinkedList;

public class leet098 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(TreeNode left, TreeNode root){

        }
        TreeNode(int x){
            this.val = x;
        }
    }
    public static boolean isBSFHelper(TreeNode node, Integer lower_limit, Integer upper_limit){
        if(lower_limit != null && node.val <= lower_limit)
            return false;
        if(upper_limit != null && node.val >= upper_limit)
            return false;

        boolean left = node.left != null ? isBSFHelper(node.left,lower_limit, node.val) : true;

        if(left){
            boolean right = node.right != null ? isBSFHelper(node.right,node.val,upper_limit) : true;
            return right;
        }else
            return false;
    }
    public static boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        return isBSFHelper(root,null,null);
    }

    public static boolean isValidBST1(TreeNode root) {
            if (root == null)
                return true;

            LinkedList<TreeNode> stack = new LinkedList();
            LinkedList<Integer> upper_limits = new LinkedList();
            LinkedList<Integer> lower_limits = new LinkedList();
            stack.add(root);
            upper_limits.add(null);
            lower_limits.add(null);
            while (!stack.isEmpty()) {
                TreeNode node = stack.poll();
                Integer lower_limit = lower_limits.poll();
                Integer upper_limit = upper_limits.poll();
                if (node.right != null) {
                    if (node.right.val > node.val) {
                        if ((upper_limit != null) && (node.right.val >= upper_limit))
                            return false;
                        stack.add(node.right);
                        lower_limits.add(node.val);
                        upper_limits.add(upper_limit);
                    } else
                        return false;
                }
                if (node.left != null) {
                    if (node.left.val < node.val) {
                        if ((lower_limit != null) && (node.left.val <= lower_limit))
                            return false;
                        stack.add(node.left);
                        lower_limits.add(lower_limit);
                        upper_limits.add(node.val);
                    } else
                        return false;
                }
            }
            return true;
    }




    public static void main(String args[]){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(5);
        root.right = new TreeNode(7);
        boolean flag = isValidBST1(root);

        System.out.println(flag);
    }
}
