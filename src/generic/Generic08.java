package generic;

interface IGeneric<T extends Number>{
	void print(T t);
}

class UGeneric<T extends Number> implements IGeneric<T>{
	private T t;
	public UGeneric(T t) {
		// TODO Auto-generated constructor stub
		this.t =  t;
	}
	@Override
	public void print(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	public <K> K returnK(K k) {
		System.out.println(k);
		return k;
	}
	
}

public class Generic08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGeneric<Number> t = new UGeneric<Number>(100);
		//t.print("kim");
		UGeneric<Integer> t2 = new UGeneric<>(100);
		System.out.println(t2.<Integer>returnK(100));
	}

}
