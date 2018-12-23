package inheritance;

//추상메서드 없는 추상클래스는 가능하나 추상클래스 아닌 추상 메서드는 없다.
//추상클래스를 사용하려면 자식클래스를 반드시 선언해서 사용해야하고 추상 메서드는 꼭 사용해야한다.
abstract class SortInt{ //추상메서드가 하나라도 있으면 추상클래스로 선언해야한다.
	private int[] value;
	
	protected abstract void sorting(); //추상 메서드 //선언만 있고 코드가 없는
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
		//SortInt ss = new SortInt(); //컴파일 에러 추상클래스 이므로 객체 생성 불가
		
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
		//SortInt ss = new SortInt(); //컴파일 에러 추상클래스 이므로 객체 생성 불가
		
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

