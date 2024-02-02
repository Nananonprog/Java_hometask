package hometask3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Введите число (1-99): ");
        n = input.nextInt();
        if (n % 10 == 1 && n % 100 != 11){
            System.out.print(n + " копейка");
    } else if ((n % 10 >= 2 && n % 10 <= 4)) {
            System.out.println(n + " копейки");
        } else {
            System.out.println(n + " копеек");
        }
    }
}
