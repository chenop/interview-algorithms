package Trees;

/**
 * Created by Chen on 06/03/2016.
 */
public class BinaryTree {
    public static void main(String[] args) {

    }

    public void inOrder(TreeNode treeNode) {
        if (treeNode == null)
            return;

        inOrder(treeNode.left);
        // Visit
        inOrder(treeNode.right);
    }

    public void preOrder(TreeNode treeNode) {
        if (treeNode == null)
            return;

        // Visit
        inOrder(treeNode.left);
        inOrder(treeNode.right);
    }

    public void postOrder(TreeNode treeNode) {
        if (treeNode == null)
            return;

        inOrder(treeNode.left);
        inOrder(treeNode.right);
        // Visit
    }


}
