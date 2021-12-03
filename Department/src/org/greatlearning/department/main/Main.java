package org.greatlearning.department.main;

import org.greatlearning.department.impl.AdminDepartment;
import org.greatlearning.department.impl.HrDepartment;
import org.greatlearning.department.impl.TechDepartment;

public class Main {

	public static void main(String[] args) {

		HrDepartment hrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();
		AdminDepartment adminDept = new AdminDepartment();

		System.out.println("Welcome to " + adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());

		// Blank Line
		System.out.println("");

		System.out.println("Welcome to " + hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());

		// Blank Line
		System.out.println("");

		System.out.println("Welcome to " + techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
	}
}
