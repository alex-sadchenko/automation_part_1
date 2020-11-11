package by.automation.fundamentals.maintasks;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class RandomNumbersInLine {
    public static void main(String[] args) {
        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 10);
        }

        System.out.println();
        System.out.println("Случайные числа от 1 до 10 с переходом на новую строку");
        for (int i : randomArray) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Случайные числа от 1 до 10 без перехода на новую строку");
        for (int i : randomArray) {
            System.out.print(i + " ");
        }
    }
}