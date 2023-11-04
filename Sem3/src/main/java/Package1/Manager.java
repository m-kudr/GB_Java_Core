package Package1;

public class Manager extends Employee {
    public Manager(String name, String surName,
                   String phone, String position, int salary, int bYear, int bMonth, int bDay) {
        super(name, surName, phone, position, salary, bYear, bMonth, bDay);
    }

    public static void increaser(Employee[] emp, int age, int increment) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {
                if (!(emp[i] instanceof Manager))
                    emp[i].increaseSalary(increment);
            }
        }
    }
}
