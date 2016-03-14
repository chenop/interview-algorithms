package trees;

/**
 * Created by Chen on 06/03/2016.
 */
public class BinaryTree {

    public void insert(TreeNode node, int data) {
        if ((int) node.data > data) {
            if (node.right == null)
                node.right = new TreeNode(data);

            insert(node.right, data);
        }

        if ((int) node.data <= data) {
            if (node.left == null)
                node.left = new TreeNode(data);

            insert(node.left, data);
        }
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
