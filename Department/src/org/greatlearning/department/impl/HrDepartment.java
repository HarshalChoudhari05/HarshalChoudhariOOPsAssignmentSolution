package org.greatlearning.department.impl;

import org.greatlearning.department.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	private String hrDepartmentName = "HR Department";
	private String hrTodaysWork = "Fill today’s timesheet and mark your attendance";
	private String hrWorkDeadline = "Complete by EOD";
	private String hrActivity = "Team Lunch";

	/**
	 * Get HR department Name.
	 * 
	 * @return hrDepartmentName
	 */
	public String departmentName() {
		return hrDepartmentName;
	}

	/**
	 * Get todays work for HR.
	 * 
	 * @return hrTodaysWork
	 */
	public String getTodaysWork() {
		return hrTodaysWork;
	}

	/**
	 * Get Deadline for HR work.
	 * 
	 * @return hrWorkDeadline
	 */
	public String getWorkDeadline() {
		return hrWorkDeadline;
	}

	/**
	 * Get HR activity.
	 * 
	 * @return hrActivity
	 */
	public String doActivity() {
		return hrActivity;
	}
}
