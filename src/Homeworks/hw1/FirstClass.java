package Homeworks.hw1;

import java.util.Scanner;

public class FirstClass {
    Scanner scanner = new Scanner(System.in);

    public void run() {
        String name = setData("Введите имя: ");
        String age_str = setData("Введите возраст: ");
        int age = 0;
        try {
            age = Integer.parseInt(age_str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Decorator.helloUser(name, age);
    }

    public String setData(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
