package hometask19.Figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[3];
        figure[0] = new Sphere(5);
        figure[1] = new Cylinder(4,8);
        figure[2] = new Pyramid(6,3);

        for (Figure f:figure) {
            f.info();
        }
    }
}
