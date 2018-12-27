package collection.list.MyLinkedList;

//데이터와 주소 둘다 저장해야한다.
//링크드 리스트는 검색은 느리고 추가 삭제는 빠르다.
//주소도 함께 저장하므로 저장공간도 많이 차지한다.
public class MyLinkedListImpl<E> implements MyLinkedList<E> {
	private Node<E> header;
	private Node<E> tail;
	private int size;

	private class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T e) {
			this.data = e;  //데이터
			this.next = null; //다음 주소
		}
	}

	private Node<E> node(int index) { // 해당 되는 인덱스의 데이터를 리턴
		if (index < 0 || index > size)
			return null;

		Node<E> node = header;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void addFirst(E e) {
		// TODO Auto-generated method stub
		Node<E> temp = new Node<>(e);
		if(size==0) {
			header = tail = temp;
		}else {
			temp.next = header;
			header = temp;
		}
		size++;
	}

	@Override
	public void add(E e) {
		// TODO Auto-generated method stub
		if(size ==0) {
			addFirst(e);
		}else {
			Node<E> temp = new Node<>(e);
			tail.next = temp; //
			tail = temp;
			size++;
		}
	}

	@Override
	public boolean add(int index, E e) {
		// TODO Auto-generated method stub
		
		if(index == 0) {
			addFirst(e);
		}else {
			Node<E> temp = new Node<>(e);
			temp.next = node(index);
			node(index-1).next = temp;
			size++;
		}
		return true;
	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		if(indexOf(e) == -1) {
			System.out.println("데이터가 존재하지 않습니다.");
			return false;
		}else {
			remove(indexOf(e));
		}
		return true;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		if(index >= size)
			throw new ArrayIndexOutOfBoundsException("사이즈 초과");
		Node<E> temp;
		if(index==0) {
			header = header.next;
			size--;
			return header.data;
		}else if(index==size-1) {
			temp=node(index);
			node(index-1).next = null;
			tail = node(index-1);
			size--;
			return temp.data;
		}else {
			temp = node(index);
			node(index-1).next = node(index).next;
			size--;
			return temp.data;
		}
		
		
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return remove(0);
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return remove(size - 1);
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return node(index).data;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		while(size!=0) {
			header = header.next;
			size--;
		}
		header = tail = null;
	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		Node<E> node = header;
		int index =0;
		while(node.data != e) {
			node = node.next;
			index++;
			if(node == null) {
				return -1;
			}
		}
		return index;
	}

	@Override
	public E set(int index, E e) {
		// TODO Auto-generated method stub
		Node<E> temp = new Node<>(e);
		if(index ==0) {
			temp.next = header.next;
			header = temp;
		}else {
			temp.next = node(index).next;
			node(index-1).next = temp;
		}
		
		return temp.data;
	}

	@Override
	public MyIterator<E> iterator() {
		// TODO Auto-generated method stub
		return new MyIteratorImpl();
	}
	
	private class MyIteratorImpl implements MyIterator<E>{
		private Node<E> lastReturned;
		private Node<E> next;
		private int nextIndex;
		
		public MyIteratorImpl() {
			// TODO Auto-generated constructor stub
			next = header;
			nextIndex = 0;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return nextIndex < size();
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			if(nextIndex==0)
				throw new IllegalStateException();
			
			MyLinkedListImpl.this.remove(nextIndex-1);
			
			nextIndex--;
		}
		
	}

}
