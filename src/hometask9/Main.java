package hometask9;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    int n = 6, m =  6;
    int [][] mas = new int[n][m];
        System.out.println("Двумерный массив: ");
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m;j++){
            mas[i][j] = (int) (Math.random() * 11);
        }
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            System.out.print( mas[i][j] + "\t");
        }
        System.out.println();
    }
        System.out.println("\nОдномерный массив: ");
        int [] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);}

        for (int value : arr) {
            System.out.print(value + "\t");
        }

        System.out.println();
        System.out.println("\nПреобразованный массив:");

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0) {
                mas[i] = arr;
            }
        }
        for (int[] row : mas) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        }
    }


