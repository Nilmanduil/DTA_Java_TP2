package dta.tgoudouneix.intList;

/**
 * Simple list of integers
 * 
 * @author tgoudouneix
 */
public class List {
	private Node head;
	
	/**
	 * Full constructor
	 * @param head Node
	 */
	public List(Node head) {
		this.setHead(head);
	}
	
	/**
	 * Default constructor
	 */
	public List() {
		this(null);
	}
	
	/**
	 * @return Node
	 */
	public Node getHead() {
		return this.head;
	}
	
	/**
	 * @param head Node
	 */
	public void setHead(Node head) {
		this.head = head;
	}
	
	/**
	 * Adds a node to the head of the list
	 * 
	 * @param value int
	 */
	public void addFirst(int value) {
		Node first = new Node(value, null, this.getHead());
		
		this.setHead(first);
	}
	
	/**
	 * Adds a node to the tail of the list
	 * 
	 * @param value int
	 */
	public void addLast(int value) {
		Node last = new Node(value);
		
		Node currentNode = this.getHead();
		if(currentNode == null)
			this.setHead(last);
		else {
			while(currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			last.setPrevious(currentNode);
			currentNode.setNext(last);
		}
	}
	
	/**
	 * Checks if the list contains a specific value
	 * 
	 * @param value int
	 * @return boolean
	 */
	public boolean contains(int value) {
		Node currentNode = this.getHead();
		
		do {
			if(currentNode.getValue() == value)
				return true;
			currentNode = currentNode.getNext();
		} while(currentNode.getNext() != null);
		
		return false;
	}
	
	/**
	 * If a specific value exists in the list, removes its first occurrence
	 * 
	 * @param value int
	 */
	public void remove(int value) {
		Node currentNode = this.getHead();
		
		do {
			if(currentNode.getValue() == value) {
				// Set next du précédent
				currentNode.getPrevious().setNext(currentNode.getNext());
				// Set previous du suivant
				currentNode.getNext().setPrevious(currentNode.getPrevious());
				// Suppression du courant inutile grâce au Rammsse-miettes
				// Sortie de la boucle
				break;
			}
			currentNode = currentNode.getNext();
		} while(currentNode.getNext() != null);
	}
	
	/**
	 * Prints values of the list
	 */
	public void print() {
		Node currentNode = this.getHead();
		
		if(currentNode == null) 
			return;
		
		do {
			System.out.println(currentNode.getValue());
			currentNode = currentNode.getNext();
		} while(currentNode.getNext() != null);
	}
}
