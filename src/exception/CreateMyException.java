package exception;

//����� ���� ���� Ŭ���� ����� //checked Exception
class MyException extends Exception{
	private static final long serialVersionUID = 1L; //�ش�Ǵ� ��ü�� ã�� ���� �����Ǵ� �⺻���� ��ȣ
	
	public MyException(String msg) {
		super(msg);
	}
}

class MyException2 extends RuntimeException{ //��Ÿ�� �ͼ����� ��� ������ unchecked Exception ���� ���� ���� �� �ִ�.
	private static final long serialVersionUID = 1L;
	
}

class Ex11{
	private int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) throws MyException{
		if(num<0) throw new MyException("0���� ũ�ų� ���ƾ� �Ѵ�.");
		this.num = num;
	}
	
}

public class CreateMyException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex11 ee = new Ex11();
		try {
			ee.setNum(-10);
			System.out.println(ee.getNum());
			
		}catch(MyException e) { //�� �ͼ����� ����Ű�� �ڵ� ���� ȣ���ϸ� ������ ������ ����. //Exception Ŭ������ �θ� Ŭ�����̱� ������ ���� �� �ִ�.
			System.out.println(e.toString());
		}
	}
}
