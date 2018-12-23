package mine;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int m = sc.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(y,m-1,1);
		
		int w = cal.get(Calendar.DAY_OF_WEEK);
		int end = cal.getActualMaximum(Calendar.DATE);
	
		System.out.println("\t"+y+"."+m);
		System.out.println("    일   월   화   수   목    금   토");
		for(int i=1; i<end+w; i++) {
			if(i<w) {
				System.out.print("   ");
			}else {
				System.out.printf("%3d",i-w+1);
			}
			if(i%7==0) {
				System.out.println();
			}
		}
	}

}
