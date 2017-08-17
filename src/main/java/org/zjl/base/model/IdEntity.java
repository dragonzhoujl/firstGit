package org.zjl.base.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 统一定义id的entity基类.

 * 
 * @author zjl
 */
@MappedSuperclass
public abstract class IdEntity {

	protected Long id;
	
	protected Long version;
	
	protected Long lastModifyTime;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastmodifytime", length = 19)
	public Long getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Long lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	
	
}
