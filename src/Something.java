class Aclass{
    public int x=10;
    public void write() {}
    public void print() {}
}

class Bclass extends Aclass {
    public int x=100;
    public void print() {System.out.println("B.print");}
    public void sub() {}
}
public class Something {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bclass a = new Bclass();
		Aclass b = new Bclass(); //�ٿ� ĳ����
		System.out.println(b.x);// 10;
		//��ĳ������ ������ �������̵� ���� �޼���� ��� ������ ���� Ŭ�������� ã�´�.
		b.print(); //Bclass.print ���� 
		((Bclass)b).sub();

		Bclass c = (Bclass)b;

		Aclass d = new Aclass();
		//Bclass e = (Bclass)d; ��ĳ����  ���� ���� ��ü�� �ٿ�ĳ���� �Ұ��ϴ�.
		//e.print();
	}
}
