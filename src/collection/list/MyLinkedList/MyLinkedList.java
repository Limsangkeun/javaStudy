package collection.list.MyLinkedList;

public interface MyLinkedList<E>{
	public int size(); //개수 구하기
	public void addFirst(E e); //리스트 맨 앞에 값을 넣기
	//public void addLast(); //리스트 맨 끝에 값을 넣기
	public void add(E e); //마지막 위치에 데이터 추가
	public boolean add(int index, E e);//index 위치에 데이터 추가
	public boolean remove(E e); //데이터 삭제
	public E remove(int index); //index 위치의 데이터 삭제
	public E removeFirst(); //첫번째 데이터 삭제
	public E removeLast(); //리스트 마지막 데이터 삭제
	public E get(int index); //index 위치의 데이터 가져오기
	public void clear();//전체 데이터 삭제
	public int indexOf(E e); //해당 데이터의 위치 반환
	public E set(int index, E e); //index 위치의 데이터를 e로 교체
	public MyIterator<E> iterator();
	
}
