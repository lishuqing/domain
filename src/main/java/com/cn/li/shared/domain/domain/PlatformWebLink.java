package com.cn.li.shared.domain.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "platform_web_link")
public class PlatformWebLink extends SQLBaseEntity{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Size(max = 50)
	@Column(name = "name",unique = true)
	private String name;
	
	
	@Column(name = "link_url")
	private String linkUrl;
	
	
	@Column(name = "img_url")
	private String imgUrl;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "link_type",referencedColumnName = "id")
	private PlatformDictionary platformDictionary;
	
	@Size(max = 500)
	@Column(name = "content")
	private String content;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}


	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public PlatformDictionary getPlatformDictionary() {
		return platformDictionary;
	}

	public void setPlatformDictionary(PlatformDictionary platformDictionary) {
		this.platformDictionary = platformDictionary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	
	
	
	
	

}
