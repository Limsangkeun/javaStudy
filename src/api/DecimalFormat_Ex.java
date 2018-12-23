package api;

public class DecimalFormat_Ex {
	//NumberFormat은 추상크래스이믈 New로 객체 생성 불가
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.text.DecimalFormat df = new java.text.DecimalFormat("#,##0"); //3자리마다 콤마를 표시하겠다.
		//java.text.DecimalFormat df = new java.text.DecimalFormat("#,##0.##"); //3자리마다 콤마를 표시하겠다
		java.text.DecimalFormat df = new java.text.DecimalFormat("#,##0.0#"); //3자리마다 콤마를 표시하겠다
		String s1 = df.format(123456);
		System.out.println(s1);
		
		s1 = df.format(123456.5688);
		System.out.println(s1);
	}

}
