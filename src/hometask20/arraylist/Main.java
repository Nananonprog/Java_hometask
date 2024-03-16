package hometask20.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(101)); // Генерация случайного числа от 0 до 100

        }

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        for (int num: list) {
            sum+=num;
        }

       int max = Collections.max(list);
        System.out.println("Максимальный элемент: " + max);

        int min = Collections.min(list);
        System.out.println("Минимальный элемент: " + min);

        double average = (double) sum / list.size();
        System.out.println("Среднее арифметическое: " + average);
    }
}