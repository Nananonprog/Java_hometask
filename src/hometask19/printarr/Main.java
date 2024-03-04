package hometask19.printarr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов числового массива: ");
        int size = input.nextInt();
        Integer[] intArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            System.out.print("-> ");
            intArray[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }



        System.out.print("Введите количество элементов массива строк: ");
        int size1 = input.nextInt();
        String[] strArray = new String[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("-> ");
            strArray[i] = input.next(); // Заполняем массив элементами, введёнными с клавиатуры
        }



        printArray(intArray, size);
        printArray(strArray, size1);


    }

    public static <T> void printArray(T[] inputArray,int size){
        System.out.print("Массив: ");
        for (T t : inputArray) {

            System.out.print(t + " ");
        }
        System.out.println();
    }
}
