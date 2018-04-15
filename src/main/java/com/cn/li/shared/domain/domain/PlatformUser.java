package com.cn.li.shared.domain.domain;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "platform_user")
public class PlatformUser extends SQLBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Size(max = 30)
	@Column(name = "login_name", unique = true)
	private String loginName;

	@Size(max = 30)
	@Column(name = "name",nullable = false)
	private String name;

	@Size(max = 500)
	@Column(name = "password")
	private String password;

	@Size(max = 100)
	@Column(name = "email", unique = true)
	private String email;

	@Size(max = 30)
	@Column(name = "phone_one")
	private String phoneOne;

	@Size(max = 50)
	@Column(name = "profile_image")
	private String profileImage;

	@Column(name = "active")
	private Boolean active = true;// 默认激活



	
	
	
	public String getLoginName() {
		return loginName;
	}


	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneOne() {
		return phoneOne;
	}


	public void setPhoneOne(String phoneOne) {
		this.phoneOne = phoneOne;
	}


	public String getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}

	
}
