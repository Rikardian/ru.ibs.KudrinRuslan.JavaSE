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

        Employee anonymousEmployee = new Employee() {
            String name = "Савелий";
            int salary = 60000;
            boolean sex = true;


            @Override
            public void work() {
                System.out.println("Анонимный класс делает работу");
            }

            public boolean isWorking (){
                return true;
            }

            public void getSalary(){
                if (getSalaryDate().equals("23")){
                    System.out.println("Анонимный класс получил зарплату");
                }
                else System.out.println("День зарплаты будет позднее");
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public void setSalary(int salary) {
                this.salary = salary;
            }

            public boolean isSex() {
                return sex;
            }

            public void setSex(boolean sex) {
                this.sex = sex;
            }
        };

    }
}