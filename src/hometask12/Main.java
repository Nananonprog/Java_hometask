package hometask12;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {3, 8, 9, 4, 1, 2, 5};
        int[] arr2 = {1, 2, 5};
        int max1 = poiskMax(arr1);
        int max2 = poiskMax(arr2);
        System.out.println("Максимальное число первого массива: "  + max1);
        System.out.println("Максимальное число второго массива: "  + max2);
    }

    public static int poiskMax(int[] mas) {
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
    return max;
    }
}