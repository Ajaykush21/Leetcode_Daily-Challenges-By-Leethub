/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> e = new ArrayList<>();
		if (root == null) { return e; }
		if (root.children != null && root.children.size() > 0) {
			for (int i = 0; i < root.children.size(); i++) {
				e.addAll(postorder(root.children.get(i)));
			}
			e.add(root.val);
		} else {
			e.add(root.val);
		}
		return e;
    }
}