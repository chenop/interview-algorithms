package Trees;

/**
 * Created by Chen.Oppenhaim on 3/7/2016.
 */
public class TreeMockHelper {
	public static TreeNode createTree() {
		TreeNode leaf1211 = new TreeNode(0);
		TreeNode leaf121 = new TreeNode(leaf1211, null, 1);
		TreeNode leaf122 = new TreeNode(2);
		TreeNode leaf12 = new TreeNode(leaf121, leaf122, 3);
		TreeNode leaf11 = new TreeNode(4);
		TreeNode leaf1 = new TreeNode(leaf11, leaf12, 5);
		TreeNode leaf2 = new TreeNode(6);
		TreeNode root = new TreeNode(leaf1, leaf2, 7);

		return root;
	}
}
