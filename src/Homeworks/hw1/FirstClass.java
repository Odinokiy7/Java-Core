package Homeworks.hw1;

import java.util.Scanner;

/**
 * Другой, очень полезный класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */
public class FirstClass {
    Scanner scanner = new Scanner(System.in);

    /**
     * Это основная функция, которая просит ввести имя и возраст
     * затем выводит введенные данные в консоль
     */
    public void run() {
        String name = setData("Enter name: ");
        String age_str = setData("Enter age: ");
        int age = 0;
        try {
            age = Integer.parseInt(age_str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Decorator.helloUser(name, age);
    }

    /**
     * Функция, которая возвращает введенную с консоли строку
     *
     * @param message - наша строка
     * @return - возвращаем нашу строку
     */
    public String setData(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
