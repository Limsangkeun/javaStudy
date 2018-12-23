package score;

public class ScoreVo {
	private String id;
	private String name;
	private int kor;
	private int eng;
	private int sci;
	private int math;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return kor+eng+math+sci;
	}
	
	public double getAvg() {
		return getTot()/4.0;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof ScoreVo) {
			return this.id.equals(((ScoreVo)obj).id);
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s, %s, %d, %d, %d, %d, %d, %.3f", id,name,kor,eng,math,sci,getTot(),getAvg());
	}
	
	
	
}
