package collection.list.MyLinkedList;

public class Node<E> {
	private E e;
	private Node nextNode;
	
	public Node(E e , Node node) {
		this.e = e;
		this.nextNode = node;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node node) {
		this.nextNode = node;
	}
	
}
