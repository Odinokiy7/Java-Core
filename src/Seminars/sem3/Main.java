package Seminars.sem3;

// Новый коммит для Homework3.
// Создать массив из сотрудников. Массив должен быть сразу инициализирован
class Main {
    public static void main(String[] args) {
        Employee[] array = new Employee[10];

        Director director = new Director("Сабина", "Директор", "+74952736461", 500_000, 35);

        Employee[] employee = {director,
                new Employee("Александр", "Тимлид", "+7926826438292", 350_000, 46),
                new Employee("Владимир", "Лид", "+7926193746238", 250_000, 37),
                new Employee("Юрий", "Сеньор", "+792594736283", 200_000, 35),
                new Employee("Эльвира", "Мидл", "+792582743729", 150_000, 31),
                new Employee("Валя", "Уборщица", "+7925837287349", 50_000, 55)};


        for (Employee e : employee) {
            System.out.println(e.toString());
        }

        Employee.averageAge(employee);      // Средний возраст всех сотрудников
        Employee.averageSalary(employee);   // Средняя зарплата всех сотрудников

//        System.out.println("---- Прибавка к зарплате сотрудникам старше 45 ----");
        System.out.println("---- Прибавка к зарплате всем сотрудникам, кроме директора ----");
        Director.salaryPlus(employee, 10_000);

        for (Employee e : employee) {
            System.out.println(e.displayEmployee());
        }

    }
}
