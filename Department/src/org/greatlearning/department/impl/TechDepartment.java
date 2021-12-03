package org.greatlearning.department.impl;

import org.greatlearning.department.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	private String techDepartmentName = "Tech Department";
	private String techTodaysWork = "Complete coding of Module 1";
	private String techWorkDeadline = "Complete by EOD";
	private String techStackInfo = "Core Java";

	/**
	 * Get Tech Department Name.
	 * 
	 * @return techDepartmentName
	 */
	public String departmentName() {
		return techDepartmentName;
	}

	/**
	 * Get Todays's work for Tech Department.
	 * 
	 * @return techTodaysWork
	 */
	public String getTodaysWork() {
		return techTodaysWork;
	}

	/**
	 * Get Deadline for Tech's Work.
	 * 
	 * @return techWorkDeadline
	 */
	public String getWorkDeadline() {
		return techWorkDeadline;
	}

	/**
	 * Get Tech Stack Information.
	 * 
	 * @return techStackInfo
	 */
	public String getTechStackInformation() {
		return techStackInfo;
	}
}
