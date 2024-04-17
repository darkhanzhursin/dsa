package miu.mpp.stream.examples;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployee {
    public static void main(String[] args) {
        // initialize array of Employees
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);

        // display all Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);   //A method reference.

        // Predicate (boolean-valued function) that returns true for salaries
        //in the range $4000-$6000
        Predicate<Employee> fourToSixThousand =
                e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

        // Display Employees with salaries in the range $4000-$6000
        // sorted into ascending order by salary
        System.out.printf(
                "%nEmployees earning $4000-$6000 per month sorted by salary:%n");

        list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        // Display first Employee with salary in the range $4000-$6000
        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                list.stream()
                        .filter(fourToSixThousand)
                        .findFirst()
                        .get());

        // Functions for getting first and last names from an Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        // Comparator for comparing Employees by first name then last name
        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);
        // sort employees by last name, then first name
        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

        // sort employees in descending order by last name, then first name
        System.out.printf(
                "%nEmployees in descending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

        // display unique employee last names sorted
        System.out.printf("%nUnique employee last names:%n");
        list.stream()
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // display only first and last names
        System.out.printf(
                "%nEmployee names in order by last name then first name:%n");
        list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);

        // group Employees by department
        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> groupedByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("   %s%n", employee));
                }
        );


        // count number of Employees in each department
        System.out.printf("%nCount of Employees by department:%n");

        Map<String, Long> employeeCountByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                TreeMap::new, Collectors.counting()));

        employeeCountByDepartment.forEach(
                (department, count) -> System.out.printf(
                        "%s has %d employee(s)%n", department, count));

        // sum of Employee salaries with DoubleStream sum method
        System.out.printf(
                "%nSum of Employees' salaries (via sum method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary).sum());

        // calculate sum of Employee salaries with Stream reduce method
        System.out.printf(
                "Sum of Employees' salaries (via reduce method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, (value1, value2) -> value1 + value2));

        // average of Employee salaries with DoubleStream average method
        System.out.printf("Average of Employees' salaries: %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .getAsDouble());

        // Count the number of last names that begin with the letter  ‘B’.  Print out this number.
        System.out.printf("%nNumber of last names that begin with the letter  ‘B’: %d%n",
                list.stream().filter(e -> e.getLastName().startsWith("B")).count());

        // Print out all the Employee objects whose last name begins with the letter  ‘B’  in sorted order.
        System.out.printf("%nEmployee objects whose last name begins with the letter  ‘B’  in sorted order: %n");
        list.stream().filter(e -> e.getLastName().startsWith("B"))
                .sorted(Comparator.comparing(Employee::getLastName)).forEach(System.out::println);

        //  Print out all of the Employee objects whose last name begins with the letter  ‘B’  and
        //  change their first name and last name to be All capital letters.

        // doesn't change original list
        System.out.printf("%nNames with capital letters: %n");
        list.stream().filter(e -> e.getLastName().startsWith("B"))
                        .map(e -> capitalize(e)).forEach(System.out::println);


        // change original list
//        list.stream().filter(e -> e.getLastName().startsWith("B"))
//                .map(employee -> {
//                    employee.setFirstName(employee.getFirstName().toUpperCase());
//                    employee.setLastName(employee.getLastName().toUpperCase());
//                    return employee;
//                }).forEach(System.out::println);


        // Print out All the employee objects, but if the last name begins with the letter  ‘B’,  then capitalize
        // all the letters in the last name.
        System.out.printf("%nNames with capital letters: %n");
        list.stream().map(e -> capitalizeLast(e)).forEach(System.out::println);
    }

    static Employee capitalize(Employee e) {
        return new Employee(e.getFirstName().toUpperCase(), e.getLastName().toUpperCase(), e.getSalary(),
                e.getDepartment());
    }

    static Employee capitalizeLast(Employee e) {
        if (!e.getLastName().startsWith("B")) return e;
        return new Employee(e.getFirstName(), e.getLastName().toUpperCase(), e.getSalary(),
                e.getDepartment());
    }
}
