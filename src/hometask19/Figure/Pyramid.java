package hometask19.Figure;

public class Pyramid extends Figure {
     private int side;
    public Pyramid(double height, int side) {
        super(height);
        this.side = side;
    }

// берется тетраэдр (V = ha² / 4√3)
    @Override
    public double getVolume() {
        return  (this.getHeight() * Math.pow(this.side,2))/(4 * Math.sqrt(3)) ;
    }

    @Override
    public void info() {
        System.out.printf("Фигура: пирамида | Объём фигуры: %.2f%n", getVolume());

    }
}
