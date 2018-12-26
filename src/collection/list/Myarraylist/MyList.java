package collection.list.Myarraylist;

public interface MyList <E>{
	//������ �߰�
	public void add(E element);
	//Ư�� �ε����� ������ �߰�
	public boolean add(int index,E element);
	//Ư�� �ε����� ������ ����
	public E get(int index);
	//Ư�� �ε����� ������ ����
	public E set(int index, E element);
	//����� ����
	public int size();
	//Ư�� �ε����� ������ ����
	public E remove(int index);
	//Ư�� ������ �����
	public boolean remove(E element);
	//��ü ������ �����
	public void clear();
	//Ư�� �������� �ε��� ���ϱ�
	public int indexOf(E element);
	//�ݺ��� ����
	public MyIterator<E> iterator();
}
