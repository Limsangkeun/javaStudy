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

	// �迭 �Ҵ�
	private void capacityAllocation(int capacity) {
		Object temp[] = new Object[capacity];
		if (elementData != null && size > 0)
			System.arraycopy(elementData, 0, temp, 0, size);
		elementData = temp;
	}

	@SuppressWarnings("unchecked") // ������ ��� ������� �ʵ��� �Ѵ�.
	private E elementData(int index) {
		return (E) elementData[index]; // ������ ���ϸ� ���׸��� ĳ�����ϴ� ���� �ƴϱ� ������ ��� ������ ������ ������ �ɸ��� ��Ȳ�� �ƴ϶� ��Ȯ�� ����� ���ٴ� Ȯ����
										// �����Ƿ� ����Ѵ�.
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
			if (elementData[i].equals(element)) { // ���ڿ� �ϼ��� �����Ƿ� ==���� ���ϸ� �ȵȴ�. //��ü �񱳴� ������ equals
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
	//����
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
