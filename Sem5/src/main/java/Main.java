import Package1.Students;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Students[] students = new Students[10];
        students[0] = new Students("Igor", Arrays.asList(5., 5., 5., 5.), "Биология>"); //AverageGrade: 5.0
        students[1] = new Students("Ivan", Arrays.asList(3., 4., 5., 3.), "Информатика"); //AverageGrade: 3.75
        students[2] = new Students("Pavel", Arrays.asList(5., 4., 5., 5.), "Информатика"); //AverageGrade: 4.75
        students[3] = new Students("Alex", Arrays.asList(5., 5., 5., 5.), "Информатика"); //AverageGrade: 5.0
        students[4] = new Students("Elena", Arrays.asList(3., 4., 3., 5.), "Информатика"); //AverageGrade: 3.75
        students[5] = new Students("Alina", Arrays.asList(2., 4., 3., 5.), "Информатика"); //AverageGrade: 3.5
        students[6] = new Students("Artem", Arrays.asList(5., 4., 5., 5.), "Математика"); //AverageGrade: 4.75
        students[7] = new Students("Andrey", Arrays.asList(5., 4., 3., 5.), "Информатика"); //AverageGrade: 4.25
        students[8] = new Students("Nikolay", Arrays.asList(5., 3., 5., 5.), "Информатика"); //AverageGrade: 4.5
        students[9] = new Students("Olga", Arrays.asList(5., 4., 2., 5.), "История"); //AverageGrade: 4.0

//        for (Students s : students)
//            if (s != null) System.out.print(s.toString().concat(", AverageGrade: " + s.getAverageGrade() + "\n"));

        String filerSpec = "Информатика";
        int firstStudentsCount = 5;
        double avgMin = 4.5;
        var result = Arrays.asList(students).stream()
                .filter((s) -> s.getSpecialty().equals(filerSpec))
                .limit(firstStudentsCount)
                .filter((s) -> s.getAverageGrade() > avgMin)
                .sorted(Comparator.comparingDouble(Students::getAverageGrade).reversed())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}