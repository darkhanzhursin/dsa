package miu.fpp.homeworks.lesson8.prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double sum = 0;
		for (EmployeeData employeeData : aList) {
			sum += employeeData.getSalary();
		}
		return sum;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
