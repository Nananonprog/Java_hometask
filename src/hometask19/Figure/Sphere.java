package hometask19.Figure;

public class Sphere extends Figure {
    public Sphere(int radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(getRadius(),3))/3 ;
    }

    @Override
    public void info() {
        System.out.printf("Фигура: шар      | Объём фигуры: %.2f%n", getVolume());

    }
}
