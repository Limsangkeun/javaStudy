package classStudy;

class Button{ //�̺�Ʈ�� 
	//��ø(����) �������̽�
	public interface OnClickListener{
		public void onClick();
	}
	
	
	
}
public class AndroidStyleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button.OnClickListener ob  = new Button.OnClickListener() { //this is ob;
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("���Ϸ��� ����");
			}
		};
		
		ob.onClick();
	}

}
