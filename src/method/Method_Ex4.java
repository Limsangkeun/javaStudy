package method;
class Ex4{
	int a =10;
	public void sub1(int x) {
		x=10;
		System.out.println(x);
	}
	public void sub2(Ex4 e) {
		System.out.println("罐篮 林家 : "+e);
		System.out.println("sub2 : " + e.a); //5
		e.a = 100;
		System.out.println("sub2==>" + e.a); //100
	}
	
}
public class Method_Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Ex4 array[] = new Ex4[1];
		Ex4 obj = new Ex4();
		array[0] = obj;
		//this is call by value
		obj.sub1(n);
		System.out.println(n);
		
		//this is call by reference
		System.out.println("main:"+obj.a); //10
		obj.a = 5;
		System.out.println("main:"+obj.a); //5
		System.out.println("carrior 林家 : " +array);
		System.out.println("content : " +array[0]);
		System.out.println("逞扁绰 林家 : " +obj);
		obj.sub2(obj);
		System.out.println("main:"+obj.a); //100
	}

}
