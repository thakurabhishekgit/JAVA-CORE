package SteramAPI.ScenarioBased;
import java.util.*;
import java.util.stream.Collectors;

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



        // Group Employees by department and count how many Employees are in each department

        list.stream()
                .collect(Collectors.groupingBy(
                        x -> x.department(),
                        Collectors.counting()
                ))
                .forEach((key , value) ->
                        System.out.println("Dept : " + key +", Count : " + value));

        //.Find the youngest female Employee.

        Optional<EmployeeDto> age = list.stream()
                .filter(x -> x.gender().equals("Male"))
                .min(Comparator.comparingInt(EmployeeDto::age))
                .stream().findFirst();

        System.out.println(age.get().age());


       // Create a map of department -> list of Employee names.

        Map<String , Long> DeptWithCount = list.stream()
                .collect(Collectors.groupingBy(
                        x -> x.department(),
                        Collectors.counting()
                ));

        DeptWithCount.forEach((key , value) ->
                System.out.println("Dept : " + key +" Count : " + value));



        //Find the average age of Employees in each department.

        Map<String , Double > avgAgeDept =
                list.stream()
                .collect(Collectors.groupingBy(
                        x -> x.department(),
                        Collectors.averagingDouble(x -> x.age())
                ));

        avgAgeDept.forEach((key , value) ->
                System.out.println("Dept : " + key +" Avg : " + value));


        //. Get a list of unique departments Employees belong to

        HashSet<String> seen = new HashSet<>();
        List<String> uniqueDepartments =  list.stream()
                .filter(e -> seen.add(e.department()))
                .map(e -> e.department())
                .toList();
        System.out.println("Unique Departments: " + uniqueDepartments);


        // Partition Employees into male and female groups, then list their names.
        Map<String, List<String>> partitionedList =   list.stream().collect(Collectors.groupingBy(e -> {
                    if(e.gender() == "Female") {
                        return "Female";
                    }
                    else if(e.gender() == "Male") {
                        return "Male";
                    }
                    return "";
                },
                Collectors.mapping(e -> e.name(), Collectors.toList())
        ));
        System.out.println("Partitioned List: " + partitionedList);


        // Group employees by department, then within each department find the oldest employee

        Map<String , Optional<EmployeeDto>> DeptToEmpByAge = list.stream()
                .collect(Collectors.groupingBy(
                        x -> x.department(),
                        Collectors.maxBy(Comparator.comparingInt(x -> x.age()))
                ))
                ;

        System.out.println(DeptToEmpByAge);


        Map<String, Optional<Integer>> deptToMaxAge =
                list.stream()
                        .collect(Collectors.groupingBy(
                                EmployeeDto::department,
                                Collectors.mapping(
                                        EmployeeDto::age,
                                        Collectors.maxBy(Integer::compare)
                                )
                        ));

        System.out.println(deptToMaxAge);



        //. For each department, find the youngest employee, but instead of returning the employee object,
        //return only their name in uppercase.

        // key point  : collectingAndThen  - get the values with condition and then return based on comparision

        Map<String  , String> res =
                list.stream()
                        .collect(Collectors.groupingBy(
                                EmployeeDto::department,
                                Collectors.collectingAndThen(
                                        Collectors.minBy(Comparator.comparingInt(EmployeeDto::age)),
                                        e -> e.get().name().toUpperCase()
                                )
                        ));

        System.out.println(res);











    }

}
