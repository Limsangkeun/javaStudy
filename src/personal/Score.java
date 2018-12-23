package personal;

public class Score {
	private ScoreVO list[];
	
	public Score() {
		allocation(10);
	}
	protected void allocation(int capacity) {
		ScoreVO temp[] = new ScoreVO[capacity];
		if(list!=null && list.length>0) {
			System.arraycopy(list, 0, temp, 0, list.length);
		}
		list = temp;
	}
	
	public int getSize() {
		if(list==null) {
			return 0;
		}
		return list.length;
	}
	
	public ScoreVO[] getList() {
		return list;
	}
	
	
	
	
}
