package collection.list.MyStack;

public class ProfessorStackImpl<E> implements ProfessorStackInterface<E>{
	private Object elementData[];
	private int index;
	
	public ProfessorStackImpl(int size) {
		// TODO Auto-generated constructor stub
		elementData = new Object[size];
	}
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		}
		E e = peek();
		elementData[index--] = null;
		return e;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		}
		return (E)elementData[index-1];
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		if(index >= elementData.length) {
			throw new IndexOutOfBoundsException("������ ����á���ϴ�.");
		}
		elementData[index++] = e;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return index <= 0;
	}

}
