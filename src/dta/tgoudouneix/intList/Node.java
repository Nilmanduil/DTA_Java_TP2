package dta.tgoudouneix.intList;

/**
 * Node of a list of integers
 * 
 * @author tgoudouneix
 */
public class Node {
	private int value;
	private Node previous = null;
	private Node next = null;
	
	/**
	 * Full constructor 
	 * 
	 * @param value int
	 * @param previous Node
	 * @param next Node
	 */
	public Node(int value, Node previous, Node next) {
		this.value = value;
		this.previous = previous;
		this.next = next;
	}
	
	/**
	 * Default constructor
	 * 
	 * @param value int
	 */
	public Node(int value) {
		this(value, null, null);
	}
	
	/**
	 * @return int
	 */
	public int getValue() {
		return this.value;
	}
	
	/**
	 * @return Node
	 */
	public Node getPrevious() {
		return this.previous;
	}
	
	/**
	 * @return Node
	 */
	public Node getNext() {
		return this.next;
	}
	
	/**
	 * @param value int
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * @param previous Node
	 */
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
	/**
	 * @param previous Node
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
