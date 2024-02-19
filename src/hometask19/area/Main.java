package hometask19.area;

public class Main {
    public static void main(String[] args) {
        final int N = 3;
        Figure[] fgr = new Figure[N];
        fgr[0] = new Figure();
        fgr[1] = new Rectangle(10,20);
        fgr[2] = new Triangle(10,20);

        for (int i = 0; i < N; i++) {
            System.out.println(fgr[i].info());
        }
    }
}
class Figure{
    double info(){
        System.out.print("Площадь фигуры не определена: ");
        return 0;
    }
}

class Triangle extends Figure{
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
   double info(){
        System.out.print("Площадь треугольника: ");
        return (base * height)/2;
    }
}

class Rectangle extends Figure{
    double width, length;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    double info(){
        System.out.print("Площадь прямоуольника: ");
        return width * length;
    }
}