package com.cn.li.shared.domain.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "platform_new")
public class PlatformNew extends SQLBaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**标题*/
	@Column(name = "title")
	private String title;
	
	/**新闻简述*/
	@Column(name = "description")
	private String description;
	
	/**新闻内容*/
	@Column(name = "content")
	private String content;
	
	/**发布日期*/
	@Column(name = "publish_date")
	private Date publishDate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	
	
	
	

}
