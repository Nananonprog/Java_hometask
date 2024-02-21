package hometask19.Figure;

public abstract class Figure {
    private int radius;
    private double height;
    public Figure(){}
    public Figure(int radius) {
        this.radius = radius;
    }
    public Figure(double height){
        this.height = height;
    }
    public Figure(int radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public abstract double getVolume();

    public abstract void info();
}
