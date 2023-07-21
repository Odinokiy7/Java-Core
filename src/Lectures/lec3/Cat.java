package Lectures.lec3;

public class Cat {
    String name;
    String color;
    int age;

    void jump() {
        if (age < 5) {
            System.out.println(name + " jump");

        }
    }

    void voice() {
        System.out.println(name + " meouww");
    }
}
