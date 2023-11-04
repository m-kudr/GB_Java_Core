import Package1.Employee;
import Package1.Manager;

import static Package1.Manager.increaser;

public class Main {

    private static float averageSalary(Employee[] emp) {
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getSalary();
        return result / emp.length;
    }

    private static float averageAge(Employee[] emp) {
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getAge();
        return result / emp.length;
    }

    public static void main(String[] args) {
        Employee employeeMike = new Employee("Mikhail",
                "Kudryavtsev", "8(812)012-34-56",
                "developer", 100000, 1980, 12, 10);
        employeeMike.info();
        System.out.println(employeeMike.toString());
        System.out.println(employeeMike.toStringFormat());

        Employee ivan = new Employee("Ivan",
                "Ovchinnikov", "8(495)000-11-22",
                "developer", 50000, 1985, 5, 6);
        Employee andrey = new Employee("Andrey",
                "Bezrukov", "8(495)111-22-33",
                "fitter", 52000, 1973, 8, 20);
        Employee evgeniy = new Employee("Evgeniy",
                "Delfinov", "8(495)222-33-44",
                "project manager", 40000, 1963, 7, 12);
        Employee natalia = new Employee("Natalia",
                "Keks", "8(495)333-44-55",
                "senior developer", 90000, 1990, 3, 14);
        Employee tatiana = new Employee("Tatiana",
                "Krasotkina", "8(495)444-55-66",
                "accountant", 50000, 1983, 4, 23);

        Employee[] company = new Employee[5];
        company[0] = ivan;
        company[1] = andrey;
        company[2] = evgeniy;
        company[3] = natalia;
        company[4] = tatiana;

        Employee[] employees = {ivan, andrey, evgeniy, natalia, tatiana};

        System.out.println("averageSalary(employees) = " + averageSalary(employees));
        System.out.println("averageAge(employees) = " + averageAge(employees));

        Employee[] employees2 = {
                new Employee("Ivan",
                        "Ovchinnikov", "8(495)000-11-22",
                        "developer", 50000, 1985, 2, 3),
                new Employee("Andrey",
                        "Bezrukov", "8(495)111-22-33",
                        "fitter", 52000, 1973, 5, 6),
                new Employee("Evgeniy",
                        "Delfinov", "8(495)222-33-44",
                        "project manager", 40000, 1963, 8, 10),
                new Employee("Natalia",
                        "Keks", "8(495)333-44-55",
                        "senior developer", 90000, 1990, 5, 10),
                new Employee("Tatiana",
                        "Krasotkina", "8(495)444-55-66",
                        "accountant", 50000, 1983, 1, 18),
                new Manager("Ivan",
                        "Petrov", "8(812)012-55-55",
                        "manager", 150000, 1980, 8, 15)};

        for (int i = 0; i < employees.length; i++) {
            Employee.increaser(employees, 45, 5000);
        }
        //вывод разницы дат в днях
        System.out.println("Date Compare = " + employeeMike.compare(2000, 10, 5));

        for (int i = 3; i < employees2.length; i++) {
            employees2[i].info();
        }
        increaser(employees2, 30, 10000);
        System.out.println("Подняли заработную плату на 10.000 всем, кроме руководителей, кто старше 30 лет");
        for (int i = 3; i < employees2.length; i++) {
            employees2[i].info();
        }
    }
}