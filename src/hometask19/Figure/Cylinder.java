package hometask19.Figure;

public class Cylinder extends Figure{
    public Cylinder(int radius, double height) {
        super(radius, height);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(),2) * getHeight();
    }

    @Override
    public void info() {
        System.out.printf("Фигура: цилиндр  | Объём фигуры: %.2f%n", getVolume());

    }
}
