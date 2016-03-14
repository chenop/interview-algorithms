package trees;

/**
 * Created by Chen.Oppenhaim on 3/7/2016.
 */
public class BalancedTree {
    public static void main(String[] args) {
        TreeNode root = TreeMockHelper.createTree();
        System.out.println(isBalanceTree(root));
    }

    private static int isBalanceTree(TreeNode node) {
        return getMaxHeight(node) - getMinHeight(node);
    }

    private static int getMinHeight(TreeNode node) {
        if (node == null)
            return 0;

        return 1 + Math.min(getMinHeight(node.left) , getMinHeight(node.right));
    }

    private static int getMaxHeight(TreeNode node) {
        if (node == null)
            return 0;

        return 1 + Math.max(getMaxHeight(node.left) , getMaxHeight(node.right));
    }
}
