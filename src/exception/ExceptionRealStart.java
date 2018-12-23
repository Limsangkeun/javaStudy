package exception;

/*class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	public MyException(String s) {
		super(s);
	}
	
}*/

class Ex7{
	private int value;
	
	public void set(int value) throws Exception{ //set 메서드를 부른 놈은 반드시 Exception 예외 처리를 해야한다.
		if(value<0) throw new Exception("0 이상을 입력하세요");
		this.value = value;
	}
	public int get() {
		return value;
	}
}
public class ExceptionRealStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex7 ob = new Ex7();
		
		try {
			ob.set(-10);
			System.out.println(ob.get());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
