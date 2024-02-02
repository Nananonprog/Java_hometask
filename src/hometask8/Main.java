package hometask8;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

      int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}