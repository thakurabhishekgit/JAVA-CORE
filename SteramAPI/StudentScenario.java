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

        // 4 Find the average grade per department

        students.stream()
                .collect(Collectors.groupingBy(
                        x -> x.department,
                        Collectors.averagingDouble(x -> x.grade)
                ))
                .forEach((key , value) ->
                        System.out.println("Dept : " + key +" Avg : " + Math.round(value)));


        //List students sorted by age and then by grade

        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparingInt((Student s) -> s.age).thenComparingDouble(s -> s.grade))
                .toList();

        sortedStudents.forEach(
                x -> System.out.println(x)
        );


        //Create a comma-separated list of student names
        String names = students.stream()
                .map(s -> s.firstName + " " + s.lastName )
                        .collect(Collectors.joining(", "));

        System.out.println("6. Comma-separated student names: " + names);


        //Check if all students are above 18

        Boolean check = students.stream()
                .allMatch(x -> x.age > 18);
        System.out.println(check);

        //Find the department with the most students

        String dept = students.stream()
                .collect(Collectors.groupingBy(
                        x -> x.department,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(dept);

        //Divide students into those who have grades above 8.0 and below
        List<Student> gradeAbove8 = students.stream()
                .filter(x -> x.grade > 8.0)
                .toList();

        System.out.println("gradeAbove8" + gradeAbove8);

        // Find the student with the longest full name

        Optional<Student> longestName = students.stream()
                .max(Comparator.comparingInt(x -> x.lastName.length() + x.firstName.length()));

        System.out.println("longestName" + longestName.get().firstName);






    }
}
