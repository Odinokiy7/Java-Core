package Homeworks.hw1;

/**
 * Декоратор, он декорирует, то есть накладывает на результат декорации.
 * Внешний вид важен, поэтому этот класс существует.
 */
public class Decorator {
    /**
     * Функция декорирования имени и возраста для вывода в консоль
     *
     * @param name - строка, требующее декорации
     * @param age - число, требующее декорации
     * @sout - отформатированный вывод в консоль
     */
    public static void helloUser(String name, int age) {
        System.out.println("Hello, " + name + "! Your age is " + age);
    }

}
