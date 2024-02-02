package hometask7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Введите элементы массива: ");
        System.out.print("n = ");
        n = input.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> ");
            array[i] = input.nextInt();

        }
        for(int i = 1; i < array.length; i++){
            if(array[i] > array[i-1]){
                System.out.print(array[i] + " ");
            }
        }



    }
}
