public class BinTree {
	private Node root;

	// -----------------------------------------------------------------------------
	// constructor
	// -----------------------------------------------------------------------------
	public BinTree() {
		root = null;
	}

	// -----------------------------------------------------------------------------
	// create tree with root node
	// -----------------------------------------------------------------------------
	public BinTree(int v) {
		root = new Node(null, v, null);
	}

	// -----------------------------------------------------------------------------
	// create new node
	// -----------------------------------------------------------------------------
	public void newNode(int v) {

		Node k = new Node(null, v, null);

		if (root != null) { // Rootelement existiert

			insert(root, k);
		} else {
			root = k;
		}
	}

	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	private void insert(Node rootNode, Node k) {

		if (rootNode.getData() > k.getData()) { // Wert kleiner als Element
			if (rootNode.getLeft() != null) { // es gibt schon einen LS
				insert(rootNode.getLeft(), k); // in LS insert
			} else { // Es gibt keinen LS
				rootNode.setLeft(k); // Element anhängen
			}
		} else { // Wert ist größer gleich Element
			if (rootNode.getRight() != null) { // es gibt schon einen LS
				insert(rootNode.getRight(), k); // in LS insert
			} else { // Es gibt keinen LS
				rootNode.setRight(k); // Element anhängen
			}
		}

	}

	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	public void ausgabeInOrder() {
		ausgabeInOrder(root);
	}

	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	private void ausgabeInOrder(Node node) {
		if (node == null) {
			return;
		}
		ausgabeInOrder(node.getLeft());
		System.out.printf("%s ", node.getData());
		ausgabeInOrder(node.getRight());
	}

	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	public void ausgabePreOrder() {
		ausgabePreOrder(root);
	}

	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	private void ausgabePreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.printf("%s ", node.getData());
		ausgabePreOrder(node.getLeft());
		ausgabePreOrder(node.getRight());
	}

	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	public void ausgabePostOrder() {
		ausgabePostOrder(root);
	}

	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	private void ausgabePostOrder(Node node) {
		if (node == null) {
			return;
		}
		ausgabePostOrder(node.getLeft());
		System.out.printf("%s ", node.getData());
		ausgabePostOrder(node.getRight());
	}
	// -----------------------------------------------------------------------------
	// delete a node
	// -----------------------------------------------------------------------------

	public Node deleteNode(int key, int delMode) {
		return deleteNode(root, key, delMode);
	}

	// -----------------------------------------------------------------------------
	// delete a node
	// -----------------------------------------------------------------------------
	private Node deleteNode(Node rootNode, int key, int delMode) {
		// base case
		if (rootNode == null)
			return root;

		// If the key to be deleted is
		// smaller than the root's
		// key, then it lies in left subtree
		if (key < rootNode.getData())
			root.setLeft(deleteNode(root.getLeft(), key, delMode));

		// If the key to be deleted is
		// greater than the root's
		// key, then it lies in right subtree
		else if (key > rootNode.getData())
			root.setRight(deleteNode(root.getRight(), key, delMode));

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
			// node with only one child or no child
			if (rootNode.getLeft() == null) {
				Node temp = root.getRight();
				return temp;
			} else if (rootNode.getRight() == null) {
				Node temp = root.getLeft();
				return temp;
			}

			if (delMode == 1) {
				// node with two children: Get the inorder successor
				// (smallest in the right subtree)
				Node temp = minValueNode(root.getRight());

				// Copy the inorder successor's content to this node
				root.setData(temp.getData());

				// Delete the inorder successor
				root.setRight(deleteNode(root.getRight(), temp.getData(), delMode));
			} else {
				// node with two children: Get the inorder successor
				// (smallest in the right subtree)
				Node temp = maxValueNode(root.getLeft());

				// Copy the inorder successor's content to this node
				root.setData(temp.getData());

				// Delete the inorder successor
				root.setLeft(deleteNode(root.getLeft(), temp.getData(), delMode));
			}

		}
		return root;
	}

	// -----------------------------------------------------------------------------
	// get Node with lowest value
	// -----------------------------------------------------------------------------
	public Node minValueNode(Node node) {
		Node current = node;

		/* loop down to find the leftmost leaf */
		while (current != null && current.getLeft() != null)
			current = current.getLeft();

		return current;
	}

	// -----------------------------------------------------------------------------
	// get Node with highest Value
	// -----------------------------------------------------------------------------
	public Node maxValueNode(Node node) {
		Node current = node;

		/* loop down to find the rightmost leaf */
		while (current != null && current.getRight() != null)
			current = current.getRight();

		return current;
	}
}
