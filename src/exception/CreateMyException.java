package exception;

//사용자 정의 예외 클래스 만들기 //checked Exception
class MyException extends Exception{
	private static final long serialVersionUID = 1L; //해당되는 객체를 찾기 위해 제공되는 기본적인 번호
	
	public MyException(String msg) {
		super(msg);
	}
}

class MyException2 extends RuntimeException{ //런타임 익셉션을 상속 받으면 unchecked Exception 또한 새로 만들 수 있다.
	private static final long serialVersionUID = 1L;
	
}

class Ex11{
	private int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) throws MyException{
		if(num<0) throw new MyException("0보다 크거나 같아야 한다.");
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
			
		}catch(MyException e) { //이 익셉션을 일으키는 코드 없이 호출하면 컴파일 오류가 난다. //Exception 클래스도 부모 클래스이기 때문에 받을 수 있다.
			System.out.println(e.toString());
		}
	}
}
