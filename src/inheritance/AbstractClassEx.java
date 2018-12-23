package inheritance;

//�߻�޼��� ���� �߻�Ŭ������ �����ϳ� �߻�Ŭ���� �ƴ� �߻� �޼���� ����.
//�߻�Ŭ������ ����Ϸ��� �ڽ�Ŭ������ �ݵ�� �����ؼ� ����ؾ��ϰ� �߻� �޼���� �� ����ؾ��Ѵ�.
abstract class SortInt{ //�߻�޼��尡 �ϳ��� ������ �߻�Ŭ������ �����ؾ��Ѵ�.
	private int[] value;
	
	protected abstract void sorting(); //�߻� �޼��� //���� �ְ� �ڵ尡 ����
	public void sort(int[] value) {
		this.value = value;
		sorting();
	}
	
	protected int length() {
		int n=-1;
		if(value!= null) n=value.length;
		return n;
	}
	
	protected final int compare(int i, int j) {
		return value[i] - value[j];
	}
	
	protected final void swap(int i, int j) {
		int temp;
		temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}
class SelectionSort extends SortInt{
	@Override
	protected void sorting() {
		for (int i = 0; i < length() - 1; i++) {
			for (int j = i + 1; j < length(); j++) {
				if(compare(i,j)>0) {
					swap(i,j);
				}
			}
		}
	}
}
class BubbleSort extends SortInt{

	@Override
	protected void sorting() {
		// TODO Auto-generated method stub
		int pass=1;
		boolean flag;
		do {
			flag=false;
			for(int i=0; i<length()-pass; i++) {
				if(compare(i,i+1)>0) {
					swap(i,i+1);
					flag=true;
				}
			}
		}while(flag);
	}
	
}
public class AbstractClassEx {
	public static void main(String[] args) {
		int data[] = {58,9,32,4,10,28,5,10};
		System.out.println("this is selection Sort");
		SortInt ss= new SelectionSort();
		//SortInt ss = new SortInt(); //������ ���� �߻�Ŭ���� �̹Ƿ� ��ü ���� �Ұ�
		
		System.out.print("source data : ");
		for(int n:data) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		ss.sort(data);
		
		System.out.print("sort data : ");
		for(int n1:data) {
			System.out.print(n1+" ");
		}
		System.out.println();
		
		int data2[] = {58,9,32,4,10,28,5,10};
		System.out.println("this is Bubble Sort");
		ss= new BubbleSort();
		//SortInt ss = new SortInt(); //������ ���� �߻�Ŭ���� �̹Ƿ� ��ü ���� �Ұ�
		
		System.out.print("source data : ");
		for(int n:data2) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		ss.sort(data2);
		
		System.out.print("sort data : ");
		for(int n1:data2) {
			System.out.print(n1+" ");
		}
		System.out.println();
		
	}
}

