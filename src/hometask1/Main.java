package hometask1;

public class Main {
    public static void main(String[] args) {

            int num = 24685 ;
            int a, b, c, d, e, res;
            double srAr;
            System.out.printf("Исходное пятизначное число: %d %n", num);
            a = num % 10;

            num = num / 10;
            b = num % 10;

            num = num / 10;
            c = num % 10;

            num = num/10;
            d = num % 10;

            num = num /10;
            e = num % 10;

            res = a * b * c * d * e;
            System.out.printf("Произведение цифр числа: %d %n", res);
            srAr = (a + b + c + d + e)/5;
            System.out.printf("Среднее арифметическое цифр числа: %.2f", srAr);

    }
}