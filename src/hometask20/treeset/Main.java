package hometask20.treeset;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        int count = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целые числа: ");
        for (int i = 0; i < count; i++) {
            System.out.print("-> ");
            int num = input.nextInt();
            treeSet.add(num);

        }
        System.out.println("Наименьший элемент в TreeSet: " + Collections.min(treeSet));
    }
}
