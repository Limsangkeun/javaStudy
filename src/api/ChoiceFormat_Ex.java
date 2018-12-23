package api;

import java.text.ChoiceFormat;

public class ChoiceFormat_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double limits[] = {0,60,70,80,90};
		String grade[] = {"F","D","C","B","A"};
		ChoiceFormat cf = new ChoiceFormat(limits,grade);
		System.out.println(cf.format(85));
		System.out.println(cf.format(55));
		
		System.out.println("----------------------------------");
		String p ="60#D|70#c|80<b|90#a"; //69점 이하; #=>이하 < ->미만 70~79 c  
		ChoiceFormat cf2 = new ChoiceFormat(p);
		System.out.println(cf2.format(81));	
	}
}
