package array;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1��
		int a[] = {10, 20, 30};
		int b[] = a;
		System.out.println(a==b); // a�� b�� ������ ��ġ�� �����Ѵ�. (�ּҺ�) ���ο� �޸𸮰��� �Ҵ��ϴ� �� �ƴ�
		
		b[1] = 300;
		System.out.println(a[1]+","+b[1]); //300 ���� ��ġ�� �����ϹǷ�
		
		//�׷��ٸ� ���� ���ο� �޸� ������ �Ҵ��ϸ鼭 �����ϴ� ���� �˾ƺ���
		int c[] = new int[a.length]; //���ο� ���� �Ҵ�
		System.arraycopy(a, 0, c, 0, a.length); //���� �迭��,��𿡼�����, ������ �迭��, ��𿡴ٰ�, ��ŭ //���� �����ؾ��� ��� ���
		
		System.out.println(a==c); //�޸� ������ �ٸ��Ƿ� �ּҰ� �ٸ� FALSE;
		for(int i : c) {
			System.out.println(i);
		}
		
		c[1] = 20;
		System.out.println(a[1]+","+c[1]); //300 : 20\
		
		//2�� 2���� �迭�� ����
		int d[][] = new int[][]{{1,2,3},{4,5,6}};
		int e[][] = new int[d.length][d[0].length];
		//System.arraycopy(d, 0, e, 0, d.length);
		
		System.out.println(d[1][1]+":"+e[1][1]); //5
		e[1][1] = 300;
		System.out.println(d[1][1]+":"+e[1][1]); //300:300 //���� �� ����Ǵ°�? �Ϻ� �迭�� �ּҰ��� ����Ǿ����Ƿ� ��������� ���� 
		
		//=>��� 2���� �迭�� Arraycopy �������� ���� ������ �Ϻι迭 �ϳ��� 
		
		for(int i=0; i<d.length; i++) {  //�� ���� ���� �迭�� �������.
			System.arraycopy(d[i], 0, e[i], 0, d[i].length);
		}
		e[1][1] = 30;
		System.out.println(d[1][1]+":"+e[1][1]); //5:30; 
		
		}
	}

