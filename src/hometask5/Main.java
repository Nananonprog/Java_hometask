package hometask5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE;
        int maximum = 0;
        int total = 0;
        int counter = 0;
        float average;
        System.out.println("Введите целое положительное число (0 - завершение работы): ");
        while (true) {
            System.out.println("Введите число: ");
            int num = input.nextInt();
            if (num == 0) {
                System.out.println("Выход из цикла.");
                break;
            }

            if (num < minimum) {
                minimum = num;
            }
            if (num > maximum) {
                maximum = num;
            }
            total += num;
            counter++;
        }

        if (counter > 0 && total > 0) {
            average = (float) total / counter;
            System.out.printf("Среднее арифметическое: %.2f\n", average);
            System.out.println("Минимальное значение: " + minimum);
            System.out.println("Максимальное значение: " + maximum);
        }else{
            System.out.println("Введены отрицательные значения");
        }

        }
    }

