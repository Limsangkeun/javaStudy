package api;

import java.util.Calendar;

//�߻�Ŭ���� : �̿� Ŭ����(��ü ���� �Ұ�) => ��ü ���� ��� :�ڽ�Ŭ������ �־���� 
//Ķ���� Ŭ���� = �߻�Ŭ���� => GregorianCalendar Ŭ������ ���ؼ� ����
public class CalendarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar now2 = new Calendar(); //�Ŀ���. �߻�Ŭ������ ��ü ���� �Ұ� //new Ű����� ������ �� ����. 
		Calendar now = Calendar.getInstance();//��ǻ�� �ý����� �ð��� ������ ���� //����Ͻú���
		now.set(2018, 11,1);
		String s = String.format("%1$tF %1$tA %1$tT", now); //SYstem.out.printf()�� �ֿܼ� ���//String.format�� String���� ��ȯ
		//tF �� //tA ���� /tT�� �ð�
		System.out.println(s);
		
		//�⵵ �˾Ƴ���
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH)+1; //��(0~11�� �����ϹǷ� +1 �ؾ���)
		int d = now.get(Calendar.DATE);
		int dd = now.get(Calendar.DAY_OF_MONTH);//d�� ������ �� �������� ����� �ٸ�
		int w = now.get(Calendar.DAY_OF_WEEK); //����. (1:��~7:��)
	
		int end=now.getActualMaximum(Calendar.DATE);
		
		System.out.println(y+":"+m+":"+d+":"+w+":"+dd+":"+end);
		

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
