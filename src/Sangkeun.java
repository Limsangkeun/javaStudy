

public class Sangkeun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=9; i++) {  //´Ü Ãâ·Â
			for(int j=1; j<=9; j++) { //°ö¼ÀÇÒ ¼ö
				if(i%2==0) {  //Â¦¼ö ´ÜÀÌ¸é 
					if(j%2==0) { //Â¦¼ö °ö¼ÁÀº 
						continue;  //°Ç³Ê ¶ÙÀÚ
					}
				}else { //È¦¼ö´ÜÀÌ¸é
					if(j%2==1) { //È¦¼ö °ö¼ÁÀº
						continue; //°Ç³Ê¶ÙÀÚ
					}
				}
				System.out.printf("%d*%d=%d\n",i,j,(i*j));
				
			}
			System.out.println();
		}
	}
}
