package Package1;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Students {
    private String name;
    private List<Double> grades;
    private String specialty;

    public double getAverageGrade() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
