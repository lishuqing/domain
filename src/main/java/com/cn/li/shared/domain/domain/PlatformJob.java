package com.cn.li.shared.domain.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name= "platform_job")
public class PlatformJob extends SQLBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/***岗位*/
	@Column(name = "job_name")
	private String jobName;
	
	/**月薪浮动*/
	@Column(name = "month_budget_max")
	private Float  monthBudgetMax;
	
	@Column(name = "month_budget_min")
	private Float  monthBudgetMin;
	
	/**工作地点*/
	@Column(name = "work_place")
	private String workPlace;
	
	/**招聘人数*/
	@Column(name = "people_num")
	private Long peopleNum;
	
	@JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
	@Column(name = "publish_date")
	private Date publishDate;
	
	/**岗位需求*/
	@Column(name = "demand")
	private String demand;

	

	


	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Float getMonthBudgetMax() {
		return monthBudgetMax;
	}

	public void setMonthBudgetMax(Float monthBudgetMax) {
		this.monthBudgetMax = monthBudgetMax;
	}

	public Float getMonthBudgetMin() {
		return monthBudgetMin;
	}

	public void setMonthBudgetMin(Float monthBudgetMin) {
		this.monthBudgetMin = monthBudgetMin;
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


	
	
	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getDemand() {
		return demand;
	}

	public void setDemand(String demand) {
		this.demand = demand;
	}
	
	
	
	
	
	
	

}
