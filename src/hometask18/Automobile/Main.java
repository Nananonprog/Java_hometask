package hometask18.Automobile;

public class Main {
    public static void main(String[] args) {
    Car veh1 = new Car("X7 M50i", 2021, "BMW", 530, "white", 10790000);
    veh1.printInfo();
    veh1.setModel("Urus");
    veh1.setYear(2025);
    veh1.setProduc("Lamborghini");
        System.out.println(veh1.getModel());
        System.out.println(veh1.getYear());
        System.out.println(veh1.getProduc());
        veh1.printInfo();

        Car veh2 = new Car("Audi 100");
        veh2.printInfo();



    }
}
