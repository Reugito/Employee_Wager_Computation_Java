package uc3.PartTime.Emp.Wage;

import java.util.Random;

import uc2.Calculate.Daily.Employee.Wage.Daily_Wage;

public class PartTime_Wage extends Daily_Wage {
	
	public static int Attendance() {                 // adding part time employee
		
		int isPresent = 1, isParttime = 2, isAbsent=0;
		Random random = new Random();                  
		int check = random.nextInt(3);
		
		return check;
	}
	
    public static int PartTimeWage() {                 // adding part time wager
    	
    	int isParttime = 2, WagePerHr = 20, PartThimeHr = 8;
    	int attendance = Attendance();             // called static method of class without creating object
    	
    	if (attendance == isParttime) {
			int PartTimeWage = WagePerHr * PartThimeHr;
			return PartTimeWage;
		}
    	return 0;
    	
    }
	public static void main(String[] args) {                  // calculating Total wager
		
		int parttimeWage = PartTimeWage();
		int dailyWage = Wager();                    // Daily wager of Emp from Daily_wage class
		int TotalWage = parttimeWage + dailyWage;   // Adding part time wage to daily wage
		System.out.println("Employee daily Total Daily wage = "+TotalWage);
		
    
	}

}
