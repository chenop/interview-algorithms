package graphs;

import trees.TreeMockHelper;
import trees.TreeNode;

import java.util.Stack;

/**
 * Created by Chen.Oppenhaim on 3/7/2016.
 */
public class DFS {
	public static void main(String[] args) {
		TreeNode tree = TreeMockHelper.createTree();

		doDFS(tree, new IVisitor() {

			@Override
			public void visit(TreeNode node) {
				if (node == null)
					return;

				node.setVisited(true);
				System.out.println("visited: " + node.data.toString());
			}
		});
	}

	private static void doDFS(TreeNode root, IVisitor visitor) {
		Stack<TreeNode> s = new Stack<>();
		s.push(root);

		travel(visitor, s);
	}

	private static void travel(IVisitor visitor, Stack<TreeNode> s) {
		while (!s.isEmpty()) {
			TreeNode node = s.pop();
			visitor.visit(node);

			TreeNode unvisitedChild = node.getUnvisitedChild();
			while (unvisitedChild  != null){
				s.push(unvisitedChild);

				travel(visitor, s);
				unvisitedChild = node.getUnvisitedChild();
			}
		}
	}


}
