package exception;
//How to make Unchecked Exception

class Ex10{
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<0)
			throw new RuntimeException("������ �Ұ��� �մϴ�....."); //unchecked ���� �߻� �����Ϸ��� �˷����� �����Ƿ� �˾Ƽ� Ȯ���ϰ� ���� ó���� �������
		this.num = num;
	}
	
	
}
public class CreateUnChecked {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex10 ee = new Ex10();
		try {
			ee.setNum(-10);
			System.out.println(ee.getNum());
		}catch(RuntimeException e) { //�׳� Exception���� ��Ƶ� ������� Exception�� ��� ���� ��ü�� �ƹ����̹Ƿ�
			System.out.println(e.getMessage());
		}
		
		System.out.println("����....");
	}
}
