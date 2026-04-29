

public class LinkedList<E> implements ListI<E>{
	/**
	 * Inner class for our nodes in a linked list.
	 * Inner classes are private by default in java.
	 *
	 * @param obj
	 */
	class Node<E>{
		public Node<E> next;
		public E data;
		
		Node(E obj){
			next = null;
			data = obj;
		}
	}
	
	/**
	 * Attributes for Linked list
	 */
	private long size;
	private Node<E> head;
	private Node<E> tail;
	
	/**
	 * Override Java's Default constructor
	 */
	public LinkedList() {
		size = 0;
		head = tail = null;
	}
	
	/**
	 * Add a node to the front of the list
	 * 
	 * @param obj
	 */
	public void addFirst(E obj) {
		Node<E> node = new Node<E>(obj);
		
		if(head == null) {
			tail = node;
		}
		
		node.next = head;
		head = node;
		
		size++;
	}
	
	
	/**
	 * Deleting the first node from the list and return it's data
	 */
	public E removeFirst() {
		if(head == null) {
			return null;
		}
		
		E data = (E) head.data;
		
		if(head == tail) {
			head = tail = null;
		}else{
			head = head.next;
		}
		
		size--;
		
		return data;
	}

	/**
	 * Printing all the objs in the list
	 */
	public void printList() {
		Node<E> current = head;
		
		if(head == null)
			return;
		
		System.out.println("head");
		System.out.println(" | ");
		while(current != null) {
			System.out.println(current.data);
			System.out.println(" | ");
			
			current = current.next;
		}
		System.out.println("null");
	}

	/**
	 * Obtain the current size of the list
	 * 
	 * @return
	 */
	public long size() {
		return size;
	}
	
	/**
	 * Get value of head data without removal
	 * @return
	 */
	public E peekHead() {
		if(head == null)
			return null;
		
		return (E)head.data;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if(size < 1) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean contains(E obj) {
		//TODO: implement!
		return false;
	}
}
