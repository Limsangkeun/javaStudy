package personal;

public class ScoreVO{
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int math; //총점 평균은 연산하면 되므로 딱히 필요가 없다.
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTot() {
		return kor+eng+math;
	}
	
	public int getAvg() {
		return getTot()/3;
	}
	
	@Override
	public String toString() {
		if(hak==null || name==null) {
			return null;
		}
		return String.format("%10s\t%10s\t%3d\t%3d\t%3d\t%3d\t%3d", hak, name,kor,eng,math,getTot(),getAvg());
	}
	
}