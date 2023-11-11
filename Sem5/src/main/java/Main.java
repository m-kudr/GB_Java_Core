import Package1.Students;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Students[] students = new Students[10];
        students[0] = new Students("Igor", Arrays.asList(5., 5., 5., 5.), "Биология>");
        students[1] = new Students("Ivan", Arrays.asList(3., 4., 5., 3.), "Информатика");
        students[2] = new Students("Pavel", Arrays.asList(5., 4., 5., 5.), "Информатика");
        students[3] = new Students("Alex", Arrays.asList(5., 5., 5., 5.), "Информатика");
        students[4] = new Students("Elena", Arrays.asList(3., 4., 3., 5.), "Информатика");
        students[5] = new Students("Alina", Arrays.asList(2., 4., 3., 5.), "Информатика");
        students[6] = new Students("Artem", Arrays.asList(5., 4., 5., 5.), "Математика");
        students[7] = new Students("Andrey", Arrays.asList(5., 4., 3., 5.), "Информатика");
        students[8] = new Students("Nikolay", Arrays.asList(5., 3., 5., 5.), "Информатика");
        students[9] = new Students("Olga", Arrays.asList(5., 4., 2., 5.), "История");

//        for (Students s : students) {
//            if (s != null) {
//                System.out.print(s.toString());
//                System.out.println(", AverageGrade: " + s.getAverageGrade());
//            }
//        }

        Stream<Students> streamStudents = Arrays.stream(students);
        String filerSpec = "Информатика";
        System.out.println(streamStudents
                .filter((s) -> s.getSpecialty().equals(filerSpec))
                .collect(Collectors.toList()));
    }
}