package dta.tgoudouneix.binaryTree;

/**
 * Binary tree node
 * 
 * @author tgoudouneix
 */
public class Node {
	private String value;
	private Node parent;
	private Node[] children;
	
	/**
	 * Full constructor
	 * 
	 * @param value String
	 * @param parent Node
	 * @param children Node[]
	 */
	public Node(String value, Node parent, Node[] children) {
		this.setValue(value);
		this.setParent(parent);
		this.children = children;
	}
	
	/**
	 * Constructor with parent
	 * 
	 * @param value String
	 * @param parent Node
	 */
	public Node(String value, Node parent) {
		this(value, parent, new Node[2]);
	}
	
	/**
	 * Default constructor
	 * 
	 * @param value String
	 */
	public Node(String value) {
		this(value, null);
	}
	
	/**
	 * @return String
	 */
	public String getValue() {
		return this.value;
	}
	
	/**
	 * @return Node
	 */
	public Node getParent() {
		return this.parent;
	}
	
	/**
	 * @return Node[]
	 */
	public Node[] getChildren() {
		return this.children;
	}
	
	/**
	 * @param value String
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * @param parent Node
	 */
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	/**
	 * Adds a child into the collection of children
	 * 
	 * @param child Node
	 */
	public void addChild(Node child) {
		for(int i = 0; i < this.children.length; i++) {
			if(this.children[i] == null) {
				child.setParent(this);
				this.children[i] = child;
				break;
			}
			
			if(i == this.children.length - 1) {
				System.out.println("Children already full, can't add child " + child.getValue());
			}
		}
	}
	
	/**
	 * Prints all descendants of this node, recursively
	 */
	public void printDescendants() {
		for(int i = 0; i < this.children.length; i++) {
			if(this.children[i] != null) {
				System.out.println(this.children[i].getValue());
				this.children[i].printDescendants();
			}
		}
	}
	
	/**
	 * Prints all ancestors of this node until tree root
	 */
	public void printAncestors() {
		if(this.getParent() != null) {
			System.out.println(this.parent.getValue());
			this.parent.printAncestors();
		}
	}
}
