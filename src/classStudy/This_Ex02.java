package classStudy;


class Test5{
	//this�� �ʵ峪 �޼��带 ȣ���Ҷ� ����ϴ� 
	private int a=10;
	private static int b=20;
	
	public void sub1() {
		System.out.println(this.a+":"+b); //this.b�� ���������� Ŭ���� ������ ��ü ������ ��� �����Ƿ� this.b�� ǥ������ �ʴ´�.
		write(); //same
		this.write(); //same
	} 
	private void write() {
		System.out.println("write...");
	}
	public static void sub2() {
		//System.out.println(this.a);//������ ����
		//static �޼���� this Ű���带 ����� �� ����. //this�� ������ ��ü �ڱ� �ڽ��� ��Ÿ���Ƿ�
		//static �޼���� ��ü ������ ���� ����.
		System.out.println(b);
	}
}
public class This_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
