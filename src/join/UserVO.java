package join;

public class UserVO {
	private String id;
	private String password;
	private String name;
	private String birth;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10s\t%10s\t%10s\n", getId(),getName(),getBirth());
	}
}
