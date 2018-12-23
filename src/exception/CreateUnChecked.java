package exception;
//How to make Unchecked Exception

class Ex10{
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<0)
			throw new RuntimeException("음수는 불가능 합니다....."); //unchecked 예외 발생 컴파일러가 알려주지 않으므로 알아서 확인하고 예외 처리를 해줘야함
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
		}catch(RuntimeException e) { //그냥 Exception으로 잡아도 상관없음 Exception은 모든 예외 객체의 아버지이므로
			System.out.println(e.getMessage());
		}
		
		System.out.println("종료....");
	}
}
