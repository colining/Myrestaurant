package restaurant.bean;

import java.util.Date;

public class User {
	public User(){
		
	}
	public User(String user, String pass){
		this.username = user;
		this.password = pass;
	}
	private Integer userid;
	private String username;
	private String password;
	private Date createdate;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	
}
