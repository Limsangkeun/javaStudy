package api;
import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance(); //�ý����� ���� ��¥
		
		//1994�� 3�� 19��
		cal.set(1994,3-1,19);
		System.out.printf("%tF %tA\n",cal,cal);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//��ξ��� 2018�� 10�� 10�Ͽ� ����ģ���� �¾�� ó������ ��;���. 100��?
		cal.set(2018, 10-1, 10); 
		cal.add(Calendar.DATE, 100); //������ 1���̴�. ���ú��� ������ �Ϸ� ���� �ȴ�.
		System.out.printf("%tF %tA\n",cal,cal);
			
		//1994�� 3�� 19��
		cal.set(2000,10-1,35); //2000.11.4
		System.out.printf("%tF %tA\n",cal,cal);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//��¥�� 10�Ϸ� ����
		cal.set(Calendar.DATE, -10);
		System.out.printf("%tF %tA\n",cal,cal);	
	}
}
