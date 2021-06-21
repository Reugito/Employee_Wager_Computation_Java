
package uc5_Calculate_Emp_Wage_For_Month;

import uc4_Wager_Using_Switch_Case.SwitchCase;

public class Monthly_Wages extends SwitchCase {

	public static void main(String[] args) {
		
		int TotalWage = 0;
		
		for(int Day = 1; Day <= 20; Day++) {
		
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
