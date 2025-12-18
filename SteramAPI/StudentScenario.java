package SteramAPI;
import java.util.*;
import java.util.stream.Collectors;

class Student {
    String firstName, lastName, city, department;
    double grade;
    int age;

    public Student(String firstName, String lastName, String city, double grade, int age, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.grade = grade;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + city + ", " + grade + ", " + age + ", " + department + ")";
    }
}
public class StudentScenario {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Rahul", "Sharma", "Hyderabad", 8.38, 19, "Civil"),
                new Student("Amit", "Verma", "Delhi", 8.4, 21, "IT"),
                new Student("Suresh", "Reddy", "Hyderabad", 7.5, 20, "Civil"),
                new Student("Kiran", "Patel", "Mumbai", 9.1, 20, "IT"),
                new Student("Arjun", "Naidu", "Bengaluru", 7.83, 20, "Civil")
        );

//        students.forEach(x ->
//                System.out.println(x)
//        );
            //find the student from hyderabad whose grade is  > 80

        List<Student> HydMoreThan80 = students.stream()
                .filter(x -> x.city.equals("Hyderabad") && x.grade > 8.0)
                .toList();
        System.out.println( "HydMoreThan80 : "+ HydMoreThan80);


        // Find the student with the highest grade

        Optional<Student> maxGrade = students.stream()
                .max(Comparator.comparingDouble(student -> student.grade));
        System.out.println( "maxGrade : "+ maxGrade);

        // 3. Count the number of students in each department

        students.stream()
                .collect(Collectors.groupingBy(
                        x -> x.department,
                        Collectors.counting()
                ))
                .forEach((key , value) ->
                        System.out.println("Dept : " + key +" Count : " + value));





    }
}
