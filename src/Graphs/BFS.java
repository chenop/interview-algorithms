package graphs;

import trees.TreeMockHelper;
import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chen.Oppenhaim on 3/7/2016.
 */
public class BFS {
	public static void main(String[] args) {
		TreeNode tree = TreeMockHelper.createTree();

		doBFS(tree, new graphs.IVisitor() {

			@Override
			public void visit(TreeNode node) {
				if (node == null)
					return;
				System.out.println("visited: " + node.data.toString());
			}
		});
	}

	public static void doBFS(TreeNode root, IVisitor visitor) {
		ArrayList<TreeNode> q = new ArrayList<>();
		q.add(root);

		travel(q, visitor);
	}

	private static void travel(ArrayList<TreeNode> q, IVisitor visitor) {
		while (!q.isEmpty()) {
			TreeNode node = q.remove(0);
			if (node == null)
				continue;
			visitor.visit(node);
			List<TreeNode> children = node.getChildrenNode();

			q.addAll(children);
			travel(q, visitor);
		}
	}
}
