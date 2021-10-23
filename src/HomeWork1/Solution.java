package HomeWork1;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Set<Employee> employeesSet = new HashSet<>();
        employeesSet.add(new Trainee(
                "Кудрин Руслан",
                "Oxford",
                false));
        employeesSet.add(new BaseEmployee(
                "Алла Борисовна",
                72, false));
        employeesSet.add(new Developer(
                "Розенок Константин",
                8,
                "Java"));
        employeesSet.add(new TeamLead(
                "Халмухамедов Валентин",
                1000000,
                true));
        employeesSet.add(new Trainee(
                "Вин Дизель",
                "Машиностроительный",
                true));
        employeesSet.add(new BaseEmployee(
                "Том Круз",
                15,
                true));
        employeesSet.add(new Developer(
                "Стив Возняк",
                10000,
                "All"));
        employeesSet.add(new TeamLead(
                "Стив Джобс",
                90000000,
                true));

        List<Employee> employeesList = new ArrayList<>();
        for (Employee employee : employeesSet) {
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

            public boolean isWorking() {
                return true;
            }

            public void getSalary() {
                if (getSalaryDate().equals("23")) {
                    System.out.println("Анонимный класс получил зарплату");
                } else System.out.println("День зарплаты будет позднее");
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

        List<Employee> sortedEmployee = employeesSet
                .stream()
                .filter(type -> type instanceof Trainee)
                .collect(Collectors.toCollection(ArrayList::new)); //отфильтровал по типу класса

        List<String> names = employeesSet
                .stream()
                .map(value -> value.getName())
                .collect(Collectors.toCollection(ArrayList::new)); //преобразовал в список имен

        names
                .stream()
                .forEach(System.out::println); //вывел в консоль
    }
}