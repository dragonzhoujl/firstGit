package org.zjl.base.model;

import java.util.List;

public class SessionInfo implements java.io.Serializable {

	private Long id;// 用户ID
	private String loginname;// 登录名
	private String name;// 姓名
	private String ip;// 用户IP

	/*private List<String> resourceList;// 用户可以访问的资源地址列表
	
	private List<String> resourceAllList;*/

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	
	
	@Override
	public String toString() {
		return this.name;
	}

}
