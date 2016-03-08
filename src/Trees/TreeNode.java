package Trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chen on 06/03/2016.
 */
public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public Object data;
	private boolean visited = false;

	public TreeNode(int data) {
        this(null, null, data);
    }

    public TreeNode(TreeNode left, TreeNode right) {
        this(left, right, null);
    }

    public TreeNode(TreeNode left, TreeNode right, Object data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }


    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public List<TreeNode> getChildrenNode() {
        ArrayList<TreeNode> nodes = new ArrayList<>();

        if (left != null)
            nodes.add(left);

        if (right != null)
            nodes.add(right);

        return nodes;
    }

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isVisited() {
		return visited;
	}

	public TreeNode getUnvisitedChild() {
		if (left != null && !left.isVisited())
			return left;

		if (right != null && !right.isVisited())
			return right;

		return null;
	}
}
