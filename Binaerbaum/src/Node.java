
public class Node {
	private Node left;
	private int Data; 
	private Node right; 

	// -----------------------------------------------------------------------------
	// constructor
	// -----------------------------------------------------------------------------
	public Node(Node l, int d, Node r) {
	this.left = l; 
	this.Data = d;
	this.right = r;
	} 
	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	public int getData() { 
	return Data; 
	}
	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	public void setData(int d) { 
	Data = d; 
	}
	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	public Node getLeft() { 
	return left; 
	} 
	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	public void setLeft(Node l) { 
	left = l; 
	} 
	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	public Node getRight() { 
	return right; 
	} 
	// -----------------------------------------------------------------------------
	//
	// -----------------------------------------------------------------------------
	public void setRight(Node r) { 
	right = r; 
	} 

}
