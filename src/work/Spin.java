package work;

public class Spin {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k=1;
		int j;
		
		for(int spin=0; spin<=8; spin++) {
			for(int i=0; i<=4; i++) {
				j= spin-i;
				if(j<0) {
					continue;
				}else if(j>4) {
					continue;
				}else {
					a[i][j] = k;
					k++;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			for(int j2=0; j2<a.length; j2++) {
				System.out.printf("%5d",a[i][j2]);
			}
			System.out.println();
		}
	}
}
