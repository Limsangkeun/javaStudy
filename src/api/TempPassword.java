package api;

import java.util.Random;

//A~Z, a~z 0~9�� �����Ͽ� 10�ڸ� ���ڿ� �����
public class TempPassword {
	public static String toString10() {
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		int num;
		gogo:
		for(int i=0; i<10; i++) {
			num = rand.nextInt(123);
			if(num<10) {
				sb.append(Integer.toString(num));
			}else if((num>='A' && num <='Z')||(num>='a' && num <='z')) {
				sb.append((char)num);
			}else {
				i--;
				continue gogo;
			}
		}
		return sb.toString();
	}
	public static String toString102() { //�̰� �� ���� ����̴�.
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		int num;
		for(int i=0; i<10; i++) {
			num = rand.nextInt(s.length());
			sb.append(s.charAt(num));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		s = toString10();
		String s2 = toString102();
		System.out.println(s);
		System.out.println(s2);
	}
}
