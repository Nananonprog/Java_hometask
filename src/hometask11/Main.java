package hometask11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1 - прямоугольник, 2 - треугольник, 3 - круг: ");
        int choice  = input.nextInt();
        if(choice == 1){
            System.out.print("Ширина: ");
            float width = input.nextFloat();
            System.out.print("Высота: ");
            float height = input.nextFloat();
            rectangle(width,height);

        }
        else if(choice == 2){
            System.out.print("Основание: ");
            float base = input.nextFloat();
            System.out.print("Высота: ");
            float height = input.nextFloat();
            triangle(base,height);
        }
        else if(choice == 3){
            System.out.print("Радиус: ");
            float r = input.nextFloat();
            circle(r);
        }else{
            System.out.print("Ошибка ввода");
        }


    }

    public static void rectangle(float width, float height) {
        System.out.printf("%.2f", width * height);
    }

    public static void triangle(float base, float height) {
        System.out.printf("%.2f", 0.5 * base * height);
    }

    public static void circle(float r){
        System.out.printf("%.2f", Math.PI * Math.pow(r,2));
    }

}
