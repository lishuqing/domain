package com.cn.li.shared.domain.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "platform_article")
public class PlatformArticle extends SQLBaseEntity{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	 @Column(name = "title")
	 private String	title;
	 
	 @Column(name = "thunmbnail_url")
	 private String	thunmbnailUrl;
	 
	 @Column(name = "author")
	 private String	author;
	 
	 @Column(name = "hits")
	 private Integer hits;
	 
	 @Column(name = "recommend")
	 private Integer recommend;
	 
	 @Column(name = "linked_url")
	 private String	linkedUrl;
	 
	 @Column(name = "description")
	 private String	description;
	 
	 @Column(name = "content")
	 private String	content;
	 
	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name = "article_type",referencedColumnName = "id")
	 private PlatformDictionary articleType;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThunmbnailUrl() {
		return thunmbnailUrl;
	}

	public void setThunmbnailUrl(String thunmbnailUrl) {
		this.thunmbnailUrl = thunmbnailUrl;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getRecommend() {
		return recommend;
	}

	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}

	public String getLinkedUrl() {
		return linkedUrl;
	}

	public void setLinkedUrl(String linkedUrl) {
		this.linkedUrl = linkedUrl;
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

	public PlatformDictionary getArticleType() {
		return articleType;
	}

	public void setArticleType(PlatformDictionary articleType) {
		this.articleType = articleType;
	}

	 
	 
}
