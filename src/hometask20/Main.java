package hometask20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ShowWord w = new ShowWord() {
            @Override
            public void readWord(String fst, String scnd) {
                if (fst.length() < scnd.length()) {
                    System.out.println("Самое короткое слово: " + fst);
                } else if (scnd.length() < fst.length()) {
                    System.out.println("Самое короткое слово: " + scnd);

                } else {
                    System.out.println("Слова одинаковы по длине");
                }
            }
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Первое слово: ");
        String x = input.nextLine();
        System.out.print("Второе слово: ");
        String y = input.nextLine();
        w.readWord(x,y);

    }
}

interface ShowWord{
    void readWord(String fst, String scnd);
}