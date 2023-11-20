import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee>  employees = new ArrayList<>();
        employees.add(new Employee("IT", 24, "Ion", true));
        employees.add(new Employee("IT", 28, "Vasile", true));
        employees.add(new Employee("Management", 39, "Valentin", false));
        employees.add(new Employee("Management", 45, "Gabriel", true));
        List<Employee> employees1 = employees.stream()
                .filter(s -> s.getAge()>25 && s.isPaidPerHour()==true && s.getDepartament()=="Management")
                .limit(5)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(employees1.toString());
        List<String> filteredNames = employees.stream()
                .filter(employee -> !employee.isPaidPerHour() && employee.getAge() > 30)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());




    }
}