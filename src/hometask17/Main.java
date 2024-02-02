package hometask17;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

        String s = "+7 499 456-45-78\n+74994564578\n7 (499) 456 45 78\n7 (499) 456-45-78";
       String pattern = "((\\+7|7)?\\s?\\(?\\d{3}\\)?[-\\s]?\\d{3}[-\\s]?\\d{2}[-\\s]?\\d{2})*";
      Pattern regex = Pattern.compile(pattern,Pattern.MULTILINE);
      Matcher matcher = regex.matcher(s);
      while(matcher.find()){
           System.out.println(matcher.group());}

          Scanner input = new Scanner(System.in);
          System.out.print("Введите количество символов: ");
          int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (((i + j) & 1) == 0) {
                    System.out.print("X  ");
                } else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }

        System.out.println("Здравствуйте! Желаю отличного дня, а мне удачи с Github");
    }

    }

