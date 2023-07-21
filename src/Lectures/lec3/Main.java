package Lectures.lec3;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Khureyra";
        cat1.color = "black and white";
        cat1.age = 6;

        Cat cat2 = new Cat();
        cat2.name = "Mufasa";
        cat2.color = "Brown and white";
        cat2.age = 3;

        System.out.printf("Cat %s is %s of age %d\n",
                cat1.name, cat1.color, cat1.age);
        System.out.printf("Cat %s is %s of age %d\n",
                cat2.name, cat2.color, cat2.age);

        cat1.jump();
        cat1.voice();
        cat2.jump();
        cat2.voice();

    }
}
