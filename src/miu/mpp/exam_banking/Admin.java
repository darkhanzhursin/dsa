package miu.mpp.exam_banking;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> list) {
        //implement
        return list.stream().mapToDouble(Employee::computeUpdatedBalanceSum).sum();
    }
}
