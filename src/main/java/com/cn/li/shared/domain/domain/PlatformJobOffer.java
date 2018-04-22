package com.cn.li.shared.domain.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "platform_job_offer")
public class PlatformJobOffer extends SQLBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "title")
	private String title;
	
	/**岗位名称*/
	@Column(name = "job_name")
	private String jobName;
	
	/***招聘公司*/
	@Column(name = "job_company")
	private String jobCompany;
	
	/**薪资预算 浮动 max*/
	@Column(name = "salary_budget_max")
	private Float  salaryBudgetMax;
	
	/**薪资预算 浮动 min*/
	@Column(name = "salary_budage_min")
	private Float salaryBudgetMin;
	
	/**工作地点*/
	@Column(name = "work_place")
	private String workPlace;
	
	/***招聘周期 */
	@Column(name = "recruitment_cycle")
	private Long recruitmentCycle;
	
	/**招聘流程*/
	@Column(name = "recruitment_process")
	private String recruitmentProcess;
	
	/***岗位状态*/
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "status",referencedColumnName = "id")
	private PlatformDictionary statusDictionary;
	
	/***入职年薪*/
	@Column(name = "entry_salary")
	private Float entrySalary;
	
	/**猎聘顾问*/
	@Column(name = "hunting_adviser")
	private String huntingAdviser;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public String getJobCompany() {
		return jobCompany;
	}

	public void setJobCompany(String jobCompany) {
		this.jobCompany = jobCompany;
	}

	public Float getSalaryBudgetMax() {
		return salaryBudgetMax;
	}

	public void setSalaryBudgetMax(Float salaryBudgetMax) {
		this.salaryBudgetMax = salaryBudgetMax;
	}

	public Float getSalaryBudgetMin() {
		return salaryBudgetMin;
	}

	public void setSalaryBudgetMin(Float salaryBudgetMin) {
		this.salaryBudgetMin = salaryBudgetMin;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public Long getRecruitmentCycle() {
		return recruitmentCycle;
	}

	public void setRecruitmentCycle(Long recruitmentCycle) {
		this.recruitmentCycle = recruitmentCycle;
	}

	public String getRecruitmentProcess() {
		return recruitmentProcess;
	}

	public void setRecruitmentProcess(String recruitmentProcess) {
		this.recruitmentProcess = recruitmentProcess;
	}


	public Float getEntrySalary() {
		return entrySalary;
	}

	public void setEntrySalary(Float entrySalary) {
		this.entrySalary = entrySalary;
	}

	public String getHuntingAdviser() {
		return huntingAdviser;
	}

	public void setHuntingAdviser(String huntingAdviser) {
		this.huntingAdviser = huntingAdviser;
	}

	

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public PlatformDictionary getStatusDictionary() {
		return statusDictionary;
	}

	public void setStatusDictionary(PlatformDictionary statusDictionary) {
		this.statusDictionary = statusDictionary;
	}
	
	
	
	
	
	
	 
	

}
