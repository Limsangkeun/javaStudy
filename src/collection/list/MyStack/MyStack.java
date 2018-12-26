package collection.list.MyStack;

import java.util.EmptyStackException;

public class MyStack <E>{
	private int size;
	private Object array[];
	
	public MyStack() {
		size = 0;
		allocate(10);
	}
	
	private void allocate(int capacity) {
		Object temp[] = new Object[capacity];
		if(array != null || size > 0) {
			System.arraycopy(array, 0, temp, 0, array.length);
		}
		array = temp;
	}
	public boolean isEmpty() {
		if(size==0) return true;
		return false;
	}
	
	public boolean Empty() {
		if(size==0) return true;
		return false;
	}
	
	public E push(E e) {
		if(size >= array.length-1) allocate(array.length+10);
		array[size++]= e;
		return e;
	}
	
	@SuppressWarnings("unchecked")
	public E peek() throws EmptyStackException{
		if(size==0) throw new EmptyStackException();
		return (E) array[size-1];
	}
	
	@SuppressWarnings("unchecked")
	public E pop() throws EmptyStackException{
		if(size==0) throw new EmptyStackException();
		E temp = (E) array[size-1];
		array[size-1] = null;
		size--;
		return temp;
	}
	
	public int Size() {
		return size;
	}
	
	
}
