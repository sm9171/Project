package ncs.test8;


public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User(){}

	public User(String id, String password, String name, int age, char gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	public String toString(){
		return this.id+"  "+this.password+"  "+this.name+"  "+this.age+"  "+this.gender+"  "+this.phone;
	}
	public boolean equals(Object obj){
		boolean result = false;
		User other= (User)obj;
		if(this.id.equals(other.id)&& this.password == other.password && this.name==other.name&&this.age==other.age&&this.gender==other.gender&&this.phone==other.phone)
			result =true;
		return result;
	}
	public  Object clone() {
		User u= new User();
		u.id=this.id;
		u.password=this.password;
		u.name=this.name;
		u.age=this.age;
		u.gender=this.gender;
		u.phone=this.phone;
		return u;
	}
}
