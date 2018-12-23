package personal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		FirstKid fk = new FirstKid("sangkeun",25);
		SecKid sk = new SecKid("Hyenwoo", 25);
		Calendar cal = Calendar.getInstance();
		cal.set(1994,3,19);
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
		while(i!=30) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fk.work();
		
			sk.work();
			sk.salary += 10;
			i++;
			System.out.println(sdf.format(date)+"년");
			System.out.print("첫째 : "+fk.getBalance()+"원,  둘째 : "+sk.getBalance()+"원\n");
			cal.add(Calendar.YEAR, 1);;
			date = cal.getTime();
			
		}
		System.out.println("최종결과 : ");
		System.out.print("첫째 : "+fk.getBalance()+"원,    "+"둘째 : "+sk.getBalance()+"원");
	}

}
