package miu.mpp.exam2017.prob1;

import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

    // returns a list of social security numbers, sorted in ascending order,
    // that belong to an Employee in the input table but that are not on the
    // socSecNums input list
    public static List<String> prepareSsnReport(HashMap<String, Employee> table, List<String> socSecNums) {
        //implement
        return table.keySet().stream().filter(s -> !socSecNums.contains(s)).sorted().toList();

    }
    //return a list of Employees whose social security number is on the input list socSecNums
    //and whose salary is >80000; the return list does not need to be sorted
    public static List<Employee> prepareEmpReport(HashMap<String, Employee> table, List<String> socSecNums) {
        //implement
        return table.entrySet().stream().filter(e -> socSecNums.contains(e.getKey()))
                .filter(e -> e.getValue().getSalary() > 80000)
                .map(e -> e.getValue()).toList();
    }
}
