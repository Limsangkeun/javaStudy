package collection.list.MyLinkedList;

public interface MyLinkedList<E>{
	public int size(); //���� ���ϱ�
	public void addFirst(E e); //����Ʈ �� �տ� ���� �ֱ�
	//public void addLast(); //����Ʈ �� ���� ���� �ֱ�
	public void add(E e); //������ ��ġ�� ������ �߰�
	public boolean add(int index, E e);//index ��ġ�� ������ �߰�
	public boolean remove(E e); //������ ����
	public E remove(int index); //index ��ġ�� ������ ����
	public E removeFirst(); //ù��° ������ ����
	public E removeLast(); //����Ʈ ������ ������ ����
	public E get(int index); //index ��ġ�� ������ ��������
	public void clear();//��ü ������ ����
	public int indexOf(E e); //�ش� �������� ��ġ ��ȯ
	public E set(int index, E e); //index ��ġ�� �����͸� e�� ��ü
	public MyIterator<E> iterator();
	
}
