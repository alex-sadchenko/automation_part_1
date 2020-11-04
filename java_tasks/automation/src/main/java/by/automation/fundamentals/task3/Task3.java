package by.automation.fundamentals.task3;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class Task3 {
    public static void main(String[] args) {
        int[] random = new int[10];

        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 10);
        }

        System.out.println();
        System.out.println("Случайные числа от 1 до 10 с переходом на новую строку");
        for (int i : random) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Случайные числа от 1 до 10 без перехода на новую строку");
        for (int i : random) {
            System.out.print(i + " ");
        }
    }
}