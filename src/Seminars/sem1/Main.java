package Seminars.sem1;

/**
 * Основной класс приложения. Здесь мы можем описать его основное назначение
 * и способы взаимодействия с ним.
 */
public class Main {
    /**
     * Точка входа в программу. С нее всегда все начинается
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = OtherClass.sum(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mult(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(result));
    }

}
