

import java.util.Random;
import java.util.Scanner;

public class BaseballQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // ��� �Է¹޴´�.
		
		String s_ic;  	// �Էº��� ��Ʈ������ �޴´�.
		// �Է¹޴´�.
		a:while(true) {
			System.out.println("���ڸ� 6�� �Է��ض�>>");
			s_ic = sc.next();
			// �Է��� �ߺ��̸� �Ÿ���.
			for(int i=0;i<5;i++) {
				for(int j=i+1;j<6;j++) {
					if( s_ic.charAt(i) == s_ic.charAt(j) ) { continue a;}
					}
			}
			break;
		}
		
		Number6 n1 = new Number6();
		
		// ���ǻ� ������ �־
		String s_com;
		s_com = n1.strike();
		
		// ���ڿ� 2���� �� (0~5)
		int cnt = 0;  // ��ġ�ϴ� ���� ī����
		for(int i=0;i<s_ic.length();i++) {
			for(int j=0;j<s_com.length();j++) {
				if(s_ic.charAt(i) == s_com.charAt(j)) {
					cnt++;
					continue;
				}
			}
		}
		
		System.out.println(s_ic);
		System.out.println(s_com);
		
		switch(cnt) {
		case 6: System.out.println("Ȩ��");break;
		case 5: System.out.println("3��Ÿ");break;
		case 4: System.out.println("2��Ÿ");break;
		case 3: System.out.println("1��Ÿ");break;
		default: System.out.println("�ƿ�");
		}
	}
}

// �������� 6�� Ŭ����
class Number6{	
	public String strike() {
		Random rnd = new Random();
		StringBuffer sb = new StringBuffer();
		
		int r;
		gogo: 
			for(int i=0;i<6;i++) {  // ����6�����鲨�ϱ� 6�ݺ�
				r = rnd.nextInt(10);
				for( int k=0; k<sb.length();k++) {
					if(r==Integer.parseInt(sb.substring(k,k+1))) {  // �ߺ��Ǹ�
						i--;									    //  �ٽ�				
						continue gogo;
				}
			}
			sb.append(r);
		}
		return sb.toString();
	}
}

