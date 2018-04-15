package com.cn.li.shared.domain.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@Column(name = "job_name")
	private String jobName;
	
	@Column(name = "job_company")
	private String jobCompany;
	
	/**薪资预算 浮动 max*/
	@Column(name = "salary_budget_max")
	private Float  salaryBudgetMax;
	
	/**薪资预算 浮动 min*/
	@Column(name = "salary_budage_min")
	private Float salaryBudgetMin;
	
	@Column(name = "work_place")
	private String workPlace;
	
	/***招聘周期 */
	@Column(name = "recruitment_cycle")
	private Long recruitmentCycle;
	
	/**招聘流程*/
	@Column(name = "recruitment_process")
	private String recruitmentProcess;
	
	/***岗位状态*/
	@Column(name = "status")
	private String status;
	
	/***入职年薪*/
	@Column(name = "entry_salary")
	private Float entrySalary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Float getEntrySalary() {
		return entrySalary;
	}

	public void setEntrySalary(Float entrySalary) {
		this.entrySalary = entrySalary;
	}
	
	
	
	
	
	
	 
	

}
