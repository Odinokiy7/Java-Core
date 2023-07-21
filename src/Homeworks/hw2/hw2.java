package Homeworks.hw2;

public class hw2 {
    public static void main(String[] args) {
        // Проверка первого задания
//        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
//        System.out.println(countEvens(new int[]{2, 2, 0}));
//        System.out.println(countEvens(new int[]{1, 3, 5}));

        // Проверка второго задания
//        System.out.println(countEvens2(new int[]{5, 7, 5, 12, 9}));

        // Проверка третьего задания
        System.out.println(countEvens3(new int[]{1, 2, 3, 0, 0, 4, 5, 6}));

    }

    // Написать метод, возвращающий количество чётных элементов массива.
    // countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    private static int countEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Написать функцию, возвращающую разницу между самым большим
    // и самым маленьким элементами переданного не пустого массива
    private static int countEvens2(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min;
    }

    // Написать функцию, возвращающую истину,
    // если в переданном массиве есть два соседних элемента, с нулевым значением
    private static boolean countEvens3(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

}
