package hometask13;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вычислить количество отрицательных чисел в массиве:\n[-2, 3, 8, -11, -4, 6]");
        int[] arr = {-2, 3, 8, -11, -4, 6};
        int count = countNeg(arr, arr.length);
        System.out.println("n = " + count);
    }

    public static int countNeg(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            if (arr[n - 1] < 0) {
                return 1 + countNeg(arr, n - 1);
            } else {
                return countNeg(arr, n - 1);
            }
        }
    }
}



