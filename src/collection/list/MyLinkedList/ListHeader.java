package collection.list.MyLinkedList;

public class ListHeader <E>{
	private Node header;
	private int size;
	public ListHeader(E e, Node node) {
		this.header = node;
	}
	
	public boolean isEmpty() {
		if(size==0)return true;
		return false;
	}
}
