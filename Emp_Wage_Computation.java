
package uc5_Calculate_Emp_Wage_For_Month;

import uc4_Wager_Using_Switch_Case.SwitchCase;

public class Monthly_Wages extends SwitchCase {

	public static void main(String[] args) {
		
		int TotalWage = 0;
		
		for(int Day = 1; Day <= 30; Day++) {
		
			int check = Switch();
			
			switch (check) {
			
			case 1:                                                        // full time wage
				TotalWage += Wager();     // Daily wager
				break;
				
			case 2:                                                        // part time wage
			
				TotalWage += PartTimeWage() + Wager();
				break;
				
			default:                                                    //Absent

               TotalWage += 0;
			}
		}

		System.out.println(" Employee Monthly wager = "+TotalWage);
	}

}
=======
package uc4_Wager_Using_Switch_Case;

import java.util.*;

import uc3_PartTime_Emp_Wage.PartTime_Wage;
public class SwitchCase extends PartTime_Wage {
	
	public static int Switch() {
		
		Random randome = new Random();
		int check = randome.nextInt(3);
		return check;
	}

	public static void main(String[] args) {
		
		int check = Switch();
		
		switch (check) {
		
		case 1:                                                        // full time wage
			System.out.println("Employee Full day Wager = "+Wager());
			break;
			
		case 2:                                                        // part time wage
		
			System.out.println("Employee Part time Wager = "+PartTimeWage());
			break;
		default:
			System.out.println("Employee is Absent");               //Absent
		}
		
	}

