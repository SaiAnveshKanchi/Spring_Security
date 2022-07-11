package spring.security.jpa.springsecurityjpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String userName;
	private String password;
	private boolean active;
	private String roles;
	
	
	
	public User(String userName, String password, boolean active, String roles) {
		super();
		this.userName = userName;
		this.password = password;
		this.active = active;
		this.roles = roles;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	
	
}

/*
insert into User(id, userName,password, active,roles) 
values(10001,'user1', 'pwd1', true,'USER');
*/
