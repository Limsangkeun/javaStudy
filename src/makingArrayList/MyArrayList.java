package makingArrayList;

public class MyArrayList<E> implements MyList<E>{
	private Object elementData[];
	private int size;

	public MyArrayList() {
		capacityAllocation(10);
	}

	public MyArrayList(int capacity) {
		capacityAllocation(capacity);
	}

	// 배열 할당
	private void capacityAllocation(int capacity) {
		Object temp[] = new Object[capacity];
		if (elementData != null && size > 0)
			System.arraycopy(elementData, 0, temp, 0, size);
		elementData = temp;
	}

	@SuppressWarnings("unchecked") // 컴파일 경고를 출력하지 않도록 한다.
	private E elementData(int index) {
		return (E) elementData[index]; // 엄밀히 말하면 제네릭은 캐스팅하는 것이 아니기 때문에 경고가 뜨지만 실제로 문제가 될만한 상황이 아니라 정확한 결과를 낸다는 확신이
										// 있으므로 사용한다.
	}

	@Override
	public void add(E element) {
		// TODO Auto-generated method stub

		if (size >= elementData.length)
			capacityAllocation(elementData.length + 10);
		elementData[size++] = element;
	}

	@Override
	public boolean add(int index, E element) {
		// TODO Auto-generated method stub
		if (index < 0 || index > size)
			return false;
		if (size >= elementData.length - 1)
			capacityAllocation(elementData.length + 10);
		for (int i = size - 1; i >= index; i--) {
			System.out.println(i);
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		if (index > size || index < 0) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return elementData(index);
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		E old;
		if (index > size || index < 0) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		old = elementData(index);
		elementData[index] = element;
		return old;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		E temp;
		if (index > size || index < 0) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		temp = elementData(index);

		for (int i = index + 1; i < size; i++) {
			elementData[i - 1] = elementData[i];
		}
		elementData[size - 1] = null;
		size--;
		
		return temp;
	}

	@Override
	public boolean remove(E element) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(element)) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			elementData[i] = null;
		}
		size = 0;
	}

	@Override
	public int indexOf(E element) {
		// TODO Auto-generated method stub
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(element)) { // 문자열 일수도 있으므로 ==으로 비교하면 안된다. //객체 비교는 무조건 equals
				return i;
			}
		}
		return index;
	}

	@Override
	public MyIterator<E> iterator() {
		// TODO Auto-generated method stub
		return new MyIteratorImpl();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i=0; i<size-1; i++) {
			sb.append(elementData[i]+",");
		}
		sb.append(elementData[size-1]+"]");
		return sb.toString();
	}
	//보류
	private class MyIteratorImpl implements MyIterator<E>{
		private int nextIndex = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return size()==0 || nextIndex < size();
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return elementData(nextIndex++);
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			MyArrayList.this.remove(nextIndex-1);
			nextIndex++;
		}
	}
	

}
