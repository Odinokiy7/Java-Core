package Seminars.sem3;

// Новый коммит для Homework3.

public class Employee {

    // Создать класс 'Сотрудник' с полями: ФИО, должность, телефон, зарплата, возраст
    private String name;
    private String position;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    // Метод должен принимать в качестве параметра массив сотрудников.
//    public static void salaryPlus(Employee[] array) {
//        for (Employee employee : array) {
//            if (employee.getAge() > 45) {
//                employee.setSalary(employee.getSalary() + 5000);
//            }
//        }
//    }

    // Написать тот же метод, но возраст и размер повышения должны быть параметрами метода.
//    public static void salaryPlus(Employee[] array, int minAge, int salaryPlus) {
//        for (Employee employee : array) {
//            if (employee.getAge() > minAge) {
//                employee.setSalary(employee.getSalary() + salaryPlus);
//            }
//        }
//    }

    // Написать метод (принимающие на вход массив сотрудников),
    // вычисляющий средний возраст всех сотрудников, вывести результаты работы в консоль.
    public static void averageAge(Employee[] array) {
        int sum = 0;

        for (Employee e : array) {
            sum += e.getAge();
        }
        System.out.println("Средний возраст: " + (float) sum / array.length);
    }

    // Написать метод (принимающие на вход массив сотрудников),
    // вычисляющий среднюю зарплату всех сотрудников, вывести результаты работы в консоль.
    public static void averageSalary(Employee[] array) {
        int sum = 0;

        for (Employee employee : array) {
            sum += employee.getSalary();
        }
        System.out.println("Средняя зарплата: " + (float) sum / array.length);
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "имя: '" + name + '\'' + ", " +
                "должность: '" + position + '\'' + ", " +
                "номер: '" + phone + '\'' + ", " +
                "зарплата: " + salary + ", " +
                "возраст: " + age + '}';
    }

    String displayEmployee() {
        return String.format("Сотрудник - зовут: %s, должность: %s, номер: %s, зарплата: %d, возраст: %d ",
                name, position, phone, salary, age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}