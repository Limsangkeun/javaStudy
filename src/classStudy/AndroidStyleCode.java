package classStudy;

class Button{ //이벤트는 
	//중첩(내부) 인터페이스
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
				System.out.println("뭐하려고 눌러");
			}
		};
		
		ob.onClick();
	}

}
