package org.greatlearning.department;

public class SuperDepartment {

	private String departmentName = "Super Department";
	private String todaysWork = "No Work as of now";
	private String workDeadline = "Nil";
	private String todayAHoliday = "Today is not a Holiday";

	/**
	 * Get Department Name.
	 * 
	 * @return departmentName
	 */
	public String departmentName() {
		return departmentName;
	}

	/**
	 * Get today's work.
	 * 
	 * @return todaysWork
	 */
	public String getTodaysWork() {
		return todaysWork;
	}

	/**
	 * Get work deadline.
	 * 
	 * @return workDeadline
	 */
	public String getWorkDeadline() {
		return workDeadline;
	}

	/**
	 * Get Holiday details for today.
	 * 
	 * @return todayAHoliday
	 */
	public String isTodayAHoliday() {
		return todayAHoliday;
	}
}
