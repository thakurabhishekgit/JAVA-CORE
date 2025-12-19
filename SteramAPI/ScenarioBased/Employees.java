package SteramAPI.ScenarioBased;
import java.util.*;

record EmployeeDto(
        String name,
        String department,
        int age,
        String gender
) { }

public class Employees {

    public static void main(String[] args) {
        EmployeeDto employee1 = new EmployeeDto("SRK", "ECE", 31, "Male");
        EmployeeDto employee2 = new EmployeeDto("Salman", "CS", 44, "Male");
        EmployeeDto employee3 = new EmployeeDto("Katrina", "ECE", 21, "Female");
        EmployeeDto employee4 = new EmployeeDto("Kareena", "CS", 34, "Female");
        EmployeeDto employee5 = new EmployeeDto("Hrithik", "EEE", 30, "Male");
        EmployeeDto employee6 = new EmployeeDto("Aish", "EEE", 25, "Female");

        List<EmployeeDto> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.add(employee6);

        //Find the names of all Employees in the CS department, sorted by age in descending order

        List<EmployeeDto> csAgeDes = list.stream()
                .filter(x ->
                    x.department().equals("CS")
                )
                .sorted(Comparator.comparingInt(EmployeeDto::age).reversed())
                        .toList();

        System.out.println("csDesAge : " + csAgeDes);





    }

}
