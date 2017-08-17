package org.zjl.user.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.NotBlank;
import org.zjl.base.model.IdEntity;

@Entity
@Table(name = "sys_user")
@DynamicInsert(true)
@DynamicUpdate(true)
public class User extends IdEntity implements java.io.Serializable{


	private static final long serialVersionUID = 1214934987843885140L;
	
	private String loginname; // 登录名
	
	private String password; // 密码

	@NotBlank
	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	@NotBlank
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
