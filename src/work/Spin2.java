package work;

public class Spin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[5][5];
		int num=1;
		int k;
		for(int i=0; i<9; i++) {
			for(int j=0; j<5; j++) {
				k = i-j;
				if(k<0 || k>4) {
					continue;
				}else {
					a[j][k] = num;
					num++;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}

}
