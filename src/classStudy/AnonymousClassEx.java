package classStudy;
//anonymous class Ŭ������ �ʿ��ѵ� ������ �ʿ���� ��� �����ϰ� �Լ� ȣ���̳� ���� ȣ�� ������ ����� ��
interface Test11{
	public void print();
}
class Ex11{
	public Object getAnonymous() {
		return new Object() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "test......";
			}
		};
	}
	public void method() {
		System.out.println(getAnonymous());
		new Test11(){

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Ex11.method.print....");
			}
			
		}.print();;
	}
}
public class AnonymousClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex11 ob = new Ex11();
		ob.method();
	}

}
