package array;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번
		int a[] = {10, 20, 30};
		int b[] = a;
		System.out.println(a==b); // a와 b는 동일한 위치를 참조한다. (주소비교) 새로운 메모리공간 할당하는 것 아님
		
		b[1] = 300;
		System.out.println(a[1]+","+b[1]); //300 같은 위치를 참조하므로
		
		//그렇다면 이제 새로운 메모리 공간을 할당하면서 복사하는 것을 알아보자
		int c[] = new int[a.length]; //새로운 공간 할당
		System.arraycopy(a, 0, c, 0, a.length); //원본 배열의,어디에서부터, 복사할 배열의, 어디에다가, 얼만큼 //값만 복사해야할 경우 사용
		
		System.out.println(a==c); //메모리 공간이 다르므로 주소가 다름 FALSE;
		for(int i : c) {
			System.out.println(i);
		}
		
		c[1] = 20;
		System.out.println(a[1]+","+c[1]); //300 : 20\
		
		//2번 2차원 배열의 복사
		int d[][] = new int[][]{{1,2,3},{4,5,6}};
		int e[][] = new int[d.length][d[0].length];
		//System.arraycopy(d, 0, e, 0, d.length);
		
		System.out.println(d[1][1]+":"+e[1][1]); //5
		e[1][1] = 300;
		System.out.println(d[1][1]+":"+e[1][1]); //300:300 //값이 왜 변경되는가? 하부 배열의 주소값이 복사되었으므로 결과적으로 같은 
		
		//=>결론 2차원 배열은 Arraycopy 쓰지말자 쓰고 싶으면 하부배열 하나씩 
		
		for(int i=0; i<d.length; i++) {  //이 것이 다중 배열의 값복사다.
			System.arraycopy(d[i], 0, e[i], 0, d[i].length);
		}
		e[1][1] = 30;
		System.out.println(d[1][1]+":"+e[1][1]); //5:30; 
		
		}
	}

