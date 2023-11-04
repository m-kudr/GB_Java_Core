package Package1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private static final int CURRENT_YEAR = 2023;
    private String name;
    private String surName;
    private String phone;
    private String position;
    private int salary;
    private int bYear;
    private int bMonth;
    private int bDay;

    public int compare(int yyyy, int mm, int dd) {
        //day = 0..30, 31 is binary 11111, ok to left shift month by 6
        //month = 0..11, 15 is binary 1111, ok to left shift year by 5 more
        int employeeDate = (bYear << 11) + (bMonth << 6) + bDay;
        int compareDate = (yyyy << 11) + (mm << 6) + dd;
        return employeeDate - compareDate;
    }

    public int getAge() {
        return CURRENT_YEAR - bYear;
    }

    public void increaseSalary(int amount) {
        this.salary += amount;
    }

    public static void increaser(Employee[] emp, int age, int increment) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {
                emp[i].increaseSalary(increment);
            }
        }
    }

    public void info() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", birthYear=" + bYear +
                '}');
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", birthYear=" + bYear +
                '}';
    }

    public String toStringFormat() {
        return String.format("Employee{" +
                        "name='%s', surName='%s'" +
                        ", position='%s', phone='%s'" +
                        ", salary=%d, birthYear=%d}'",
                name, surName, position, phone, salary, bYear);
    }
}
