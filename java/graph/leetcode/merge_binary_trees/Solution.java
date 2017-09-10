

/**
 * @author yuriitsap.
 */

/**
 * https://leetcode.com/problems/merge-two-binary-trees/description/
 */
public class Solution {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	if (t1 == null && t2 == null) {
	    return null;
	}
	TreeNode newNode = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));
	newNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
	newNode.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
	return newNode;
    }

    private void traverse(TreeNode t1) {
	if (t1.left != null) {
	    traverse(t1.left);
	} else if (t1.right != null) {
	    traverse(t1.right);
	}

    }


    public static void main(String[] args) {
	TreeNode t1 = new TreeNode(1);
	t1.right = new TreeNode(2);
	t1.left = new TreeNode(3);
	t1.left.left = new TreeNode(5);

	TreeNode t2 = new TreeNode(2);
	t2.right = new TreeNode(3);
	t2.left = new TreeNode(1);
	t1.left.right = new TreeNode(4);
	t2.right.right = new TreeNode(7);
	new Solution().mergeTrees(t1, t2);
    }

}
