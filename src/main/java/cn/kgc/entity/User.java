package cn.kgc.entity;

public class User {

	private Integer id;
	private String name;
	private Integer gender;
	private String passWord;
	private String phone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User(Integer id, String name, Integer gender, String passWord,
			String phone) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.passWord = passWord;
		this.phone = phone;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", gender=" + gender
				+ ", passWord=" + passWord + ", phone=" + phone + "]";
	}
	
	
	
}
