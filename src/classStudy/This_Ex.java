package classStudy;
//this==ȣ���� ��ü �ڱ� �ڽ��� ��Ÿ���� �� == this //�ʵ�� �޼��常 ȣ�� ����
class Ex4{
	private String name;
	private int age;
	
	public Ex4() {}
	
	public Ex4(String name ,int age) {
		this.name =name;
		this.age = age;
	}
	
	public void write() {
		System.out.println(name+" : "+age);
	}
}
public class This_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4 m = new Ex4("���ڹ�",10);
		Ex4 m2 = new Ex4("���ڹ�",15);
		
		m.write();
		m2.write();
	}

}
