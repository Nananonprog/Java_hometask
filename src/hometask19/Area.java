package hometask19;
import java.lang.Math;
public class Area {
    public static void main(String[] args) {
    areaCalculate f1 = new areaCalculate();
        System.out.println("Площадь треугольника по формуле Герона: " + f1.trianGer(3,4,5));
        System.out.println("Площадь треугольника через основание и высоту: " + f1.trianOsn(6,7));
        System.out.println("Площадь квадрата: " + f1.squr(7));
        System.out.println("Площадь прямоугольника: " + f1.rect(2,6));
        System.out.println("Количество подсчетов площади:  " + areaCalculate.getCount());



    }
}

 class areaCalculate{
     private static int count;
    int a;
    int b;
    int c;
    int h;

    public static double trianGer (int a, int b, int c) {

        areaCalculate.count++;
        double p = (a + b + c) / (double) 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }
    public static double trianOsn (int a, int h){

        areaCalculate.count++;

        return 0.5 * a * h;
    }
    public static double squr (int a){

        areaCalculate.count++;

        return Math.pow(a,2);
    }
    public static double rect(int a, int b){

        areaCalculate.count++;
        return a * b;
    }
    public static void setCount(int count){
        areaCalculate.count = count;
    }
    public static int getCount(){
        return count;
    }



    }
