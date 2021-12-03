package org.greatlearning.department.impl;

import org.greatlearning.department.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	private String adminDepartmentName = "Admin Department";

	private String todaysWork = "Complete your documents submission";

	private String workDeadline = "Complete by EOD";

	/**
	 * Get Admin Department Name.
	 * 
	 * @return adminDepartmentName
	 */
	public String departmentName() {
		return adminDepartmentName;
	}

	/**
	 * Get today's Admin work.
	 * 
	 * @return todaysWork
	 */
	public String getTodaysWork() {
		return todaysWork;
	}

	/**
	 * Get Admin work deadline.
	 * 
	 * @return workDeadline
	 */
	public String getWorkDeadline() {
		return workDeadline;
	}
}
