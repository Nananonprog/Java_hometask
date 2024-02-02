package hometask10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Выбор фигуры: ");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Круг");
        System.out.print(": ");
        int choice = input.nextInt();


        if(choice == 1){
            System.out.print("Введите сторону a = ");
            float a = input.nextFloat();
            System.out.print("Введите сторону b = ");
            float b = input.nextFloat();
            System.out.print("Введите сторону c = ");
            float c = input.nextFloat();
            float p = (a + b + c)/2;
            System.out.printf("Площадь фигуры: %.2f", Math.sqrt(p*((p-a)*(p-b)*(p-c))));

        } else if (choice == 2) {
            System.out.print("Введите сторону a = ");
            float a = input.nextFloat();
            System.out.print("Введите сторону b = ");
            float b = input.nextFloat();
            System.out.printf("Площадь фигуры: %.2f", a * b);

        }
        else if (choice == 3) {
            System.out.print("Введите радиус r = ");
            float r = input.nextFloat();
            System.out.printf("Площадь фигуры: %.2f", Math.PI * Math.pow(r,2));
        }else{
            System.out.print("Такой выбор не предусмотрен");
        }

    }
}
