package exception;

public class ExceptionEx7 {

	public static void main(String[] args) {
		int a, b,c;
		String s1 = "100000000000";
		String s2 = "0";
		
		
		try {
			a=Integer.parseInt(s1);
			b=Integer.parseInt(s2);
			c=a/b;
			System.out.println("��� : "+c);
		}catch(ArithmeticException | NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e){
		}
		//�� ���ᰡ �������°�? 
		System.out.println("����....");
	}
}


