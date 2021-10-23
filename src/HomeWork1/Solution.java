package HomeWork1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main (String [] args){
        Set<Employee> employeesSet = new HashSet<>();
        employeesSet.add(new Trainee("Кудрин Руслан", "Oxford", false));
        employeesSet.add(new BaseEmployee("Алла Борисовна", 72, false));
        employeesSet.add(new Developer("Розенок Константин", 8, "Java"));
        employeesSet.add(new TeamLead("Халмухамедов Валентин", 1000000, true));

        List<Employee> employeesList = new ArrayList<>();
        for (Employee employee : employeesSet){
            employeesList.add(employee);
        }

    }
}