package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeMethods {

    static void inorder(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }

    static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    static boolean isSame(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;

        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }

    static TreeNode invert(TreeNode root) {
        if (root == null)
            return null;

        TreeNode temp = root.left;
        root.left = invert(root.right);
        root.right = invert(temp);

        return root;
    }

    static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            result.add(level);
        }

        return result;
    }

    static boolean isValid(TreeNode root, Long min, Long max) {
        if (root == null)
            return true;
        if (root.val <= min || root.val >= max)
            return false;

        return isValid(root.left, min, (long) root.val)
                && isValid(root.right, (long) root.val, max);
    }

    static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val)
            return lca(root.left, p, q);

        if (root.val < p.val && root.val < q.val)
            return lca(root.right, p, q);

        return root;
    }

    static int checkHeight(TreeNode root) {
        if (root == null)
            return 0;

        int left = checkHeight(root.left);
        if (left == -1)
            return -1;

        int right = checkHeight(root.right);
        if (right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(levelOrder(root));
        System.out.println(maxDepth(root));
        System.out.println(isSame(root, root));
        TreeNode invertedRoot = invert(root);
        System.out.println(levelOrder(invertedRoot));
        System.out.println(isValid(root, Long.MIN_VALUE, Long.MAX_VALUE));
        System.out.println(lca(root, root.left, root.right).val);
        System.out.println(checkHeight(root) != -1);

    }
}
