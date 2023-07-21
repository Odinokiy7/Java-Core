package Seminars.sem3;

// Новый коммит для Homework3.
// Опишите класс руководителя, наследник от сотрудника
public class Director extends Employee {
    /**
     * @param name
     * @param position
     * @param phone
     * @param salary
     * @param age
     */
    public Director(String name, String position, String phone, int salary, int age) {
        super(name, position, phone, salary, age);
    }

    // Перенесите статический метод повышения зарплаты в класс руководителя,
    // модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
    // кроме руководителей.
    // В основной программе создайте руководителя и поместите его в общий массив сотрудников.
    // Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
    public static void salaryPlus(Employee[] array, int salaryPlus) {
        for (Employee employee : array) {
            if (!employee.getPosition().equals("Директор")) {
                employee.setSalary(employee.getSalary() + salaryPlus);
            }
        }
    }

}
