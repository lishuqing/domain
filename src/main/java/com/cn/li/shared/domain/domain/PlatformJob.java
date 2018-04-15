package com.cn.li.shared.domain.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "platform_job")
public class PlatformJob extends SQLBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/***岗位*/
	@Column(name = "name")
	private String name;
	
	/***年薪*/
	@Column(name = "annual_salary")
	private Float annualSalary;
	
	/**工作地点*/
	@Column(name = "work_place")
	private String workPlace;
	
	/**招聘人数*/
	@Column(name = "people_num")
	private Long peopleNum;
	
	@Column(name = "publish_time")
	private Date publishTime;
	
	/**岗位需求*/
	@Column(name = "demand")
	private String demand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Float getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(Float annualSalary) {
		this.annualSalary = annualSalary;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}


	public Long getPeopleNum() {
		return peopleNum;
	}

	public void setPeopleNum(Long peopleNum) {
		this.peopleNum = peopleNum;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getDemand() {
		return demand;
	}

	public void setDemand(String demand) {
		this.demand = demand;
	}
	
	
	
	
	
	
	

}
