package uc2.Calculate.Daily.Employee.Wage;

import uc1.Emloyee.Attendance.Emp_Attendance;

public class Daily_Wage extends Emp_Attendance {
	
	public static int Wager() {
		
		int attendance = Attendance();    // Employee Attendance inherited from Emp_Attendance class
		int WagePerHr = 20, FullDayHr = 8, isPresent = 1, isAbsent =0;
		
		if (attendance == isPresent) {
			
			int Daily_wage = WagePerHr * FullDayHr;
			return Daily_wage;
		}
		return 0;
	}
	public static void main(String[] args) {
		
		System.out.print("Employee Daily wager = "+Wager());
		
	}

}
