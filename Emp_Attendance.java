package uc1.Emloyee.Attendance;
import java.util.*;
public class Emp_Attendance {

	public static int Attendance() {
	
		int isPresent = 1, isAbsent = 0;
		Random random = new Random();
		int check = random.nextInt(2);
		
		if( check == isPresent ) {
			
			System.out.println("Employee is present");
			return isPresent;
		}
		else {
			
			System.out.println("Employee is absent");
		}
		return 0;
	}
	
	public static void main(String args[]) {
		
		Attendance();
		
	}

}
